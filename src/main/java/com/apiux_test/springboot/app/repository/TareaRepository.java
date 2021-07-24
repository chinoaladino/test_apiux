package com.apiux_test.springboot.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apiux_test.springboot.app.entity.Tarea;

@Repository
public interface TareaRepository extends JpaRepository<Tarea, Long>{

}
