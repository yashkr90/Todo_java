package com.TodoAssesment.service;

import java.util.List;

import com.TodoAssesment.model.Todo;

public interface TodoService {

	Todo createTodo(Todo todo);
	List<Todo> getAllTodo();
	void deleteTodo(Integer id);
	Todo updateTodo(Integer id, Todo todo);
}
