package com.apiux_test.springboot.app.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.apiux_test.springboot.app.entity.Tarea;
import com.apiux_test.springboot.app.servicio.TareaServiceImpl;


@RestController
@RequestMapping("/tarea")
public class TareaController {

	@Autowired
	private TareaServiceImpl tareaServiceImpl;
	
	@GetMapping("/all")
	public List<Tarea> getTareas() {
		return tareaServiceImpl.getTareas();	
	}
	
	@GetMapping("/find/{id}")
	public Tarea getTarea(@PathVariable("id") Long id) {
		return tareaServiceImpl.getTarea(id);	
	}
	
	@PostMapping("/create")
	public void registerNewTarea(@RequestParam String descripcion) {
		Tarea tarea = new Tarea();
		tarea.setDescripcion(descripcion);
		tareaServiceImpl.addNewTarea(tarea);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteStudent(@PathVariable("id") Long id) {
		tareaServiceImpl.deleteTarea(id);
	}
	
	@PutMapping("/update/{id}")
	public void updateStudent(@PathVariable("id") Long id, @RequestParam(required = false) String descripcion,@RequestParam(required = false) Boolean vigencia) {
		tareaServiceImpl.updateTarea(id,descripcion);
	}
	
}
