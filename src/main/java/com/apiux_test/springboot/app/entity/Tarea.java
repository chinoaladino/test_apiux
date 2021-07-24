package com.apiux_test.springboot.app.entity;


import java.sql.Timestamp;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "tarea")
public class Tarea {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String descripcion;
	
	@CreationTimestamp
	private Timestamp fecha_creacion;
	private boolean vigencia = false;
	
	public Tarea() {
		
	}
	
	public Tarea(Long id, String descripcion, Timestamp fecha_creacion, boolean vigencia) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.fecha_creacion = fecha_creacion;
		this.vigencia = vigencia;
	}

	public Tarea(String descripcion, boolean vigencia) {
		super();
		this.descripcion = descripcion;
		this.vigencia = vigencia;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Timestamp getFecha_creacion() {
		return fecha_creacion;
	}

	public void setFecha_creacion(Timestamp fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}

	public boolean isVigencia() {
		return vigencia;
	}

	public void setVigencia(boolean vigencia) {
		this.vigencia = vigencia;
	}
	
	
	
	
	
}
