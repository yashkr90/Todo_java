package com.TodoAssesment.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TodoAssesment.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Integer>{

	
}
