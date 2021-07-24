package com.apiux_test.springboot.app.servicio;

import java.util.List;

import com.apiux_test.springboot.app.entity.Tarea;

public interface ITareaService {
	
	public List<Tarea> listaTareas();
	
	public void guardar(Tarea tarea);
	
	public void eliminar(Tarea tarea);
	
	public Tarea find(Tarea tarea);
	
}
