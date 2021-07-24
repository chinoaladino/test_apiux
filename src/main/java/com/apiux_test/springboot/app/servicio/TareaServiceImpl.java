package com.apiux_test.springboot.app.servicio;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apiux_test.springboot.app.entity.Tarea;
import com.apiux_test.springboot.app.repository.TareaRepository;

@Service
public class TareaServiceImpl{

	private final TareaRepository tareaRepository;
	
	@Autowired
	public TareaServiceImpl(TareaRepository tareaRepository) {
		this.tareaRepository = tareaRepository;
	}
	
	public List<Tarea> getTareas(){
		return tareaRepository.findAll();
	}
	
	public Tarea getTarea(Long id){
		if (id <= 0) {
			throw new IllegalStateException("Parametro invalido para una tarea");
		}
		return tareaRepository.findById(id).orElseThrow(() -> new IllegalStateException("No existe la tarea con ese ID: "+ id));
	}
	
	public void addNewTarea(Tarea tarea) {
		if (tarea.getDescripcion() == null || tarea.getDescripcion().isEmpty()) {
			throw new IllegalStateException("descripcion vacia");
		}
		tareaRepository.save(tarea);
	}
	
	public void deleteTarea(Long id) {
		boolean exist = tareaRepository.existsById(id);
		if (!exist) {
			throw new IllegalStateException("No existe la tarea con ese ID: "+id);
		}
		tareaRepository.deleteById(id);
	}
	
	@Transactional
	public void updateTarea(Long id, String descripcion) {
		Tarea tarea = tareaRepository.findById(id).orElseThrow(() -> new IllegalStateException("No existe la tarea con el ID: "+id));
	
		if (descripcion != null && descripcion.length() > 0 && !Objects.equals(tarea.getDescripcion(), descripcion)) {
			tarea.setDescripcion(descripcion);
		}
		
	}
	
}
