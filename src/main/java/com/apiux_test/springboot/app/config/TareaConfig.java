package com.apiux_test.springboot.app.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.*;

import com.apiux_test.springboot.app.entity.Tarea;
import com.apiux_test.springboot.app.repository.TareaRepository;

@Configuration
public class TareaConfig {

	@Bean
	CommandLineRunner commandLineRunner(TareaRepository repository) {
		return args -> {
			Tarea tarea1 = new Tarea(
					"TAREA 1",
					false
				);
			Tarea tarea2 = new Tarea(
					"TAREA 2",
					false
				);
			repository.saveAll(
					List.of(tarea1,tarea2)
					);
			
		};
	}
	
}
