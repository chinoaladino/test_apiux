package com.apiux_test.springboot.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

	@GetMapping
	public String index() {
		return "Bienvenido a la api de Tareas realizada en Spring boot";
	}
}
