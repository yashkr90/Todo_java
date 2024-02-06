package com.TodoAssesment.controller;

import org.springframework.web.bind.annotation.RestController;

import com.TodoAssesment.model.Todo;
import com.TodoAssesment.service.TodoService;

import lombok.AllArgsConstructor;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@AllArgsConstructor
public class TodoController {

	private final TodoService todoService;
	
	@GetMapping("/")
	public ResponseEntity<List<Todo>> getAllTodos() {
		return  ResponseEntity.status(HttpStatus.OK).body(todoService.getAllTodo()) ;
	}
	
	@PostMapping("/post")
	public ResponseEntity<?> createTodo(@RequestBody Todo todo) {
		//TODO: process POST request
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(todoService.createTodo(todo));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updateTodo(@PathVariable("id") Integer id, @RequestBody Todo todo) {
		//TODO: process PUT request
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(todoService.updateTodo(id, todo));
	}
	
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteTodo(@PathVariable("id") Integer id)
    {
    	todoService.deleteTodo(id);
		return ResponseEntity.status(HttpStatus.OK).body("deleted successfully");
    	
    }
	
	
}
