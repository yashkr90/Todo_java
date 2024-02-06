package com.TodoAssesment.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.TodoAssesment.model.Todo;
import com.TodoAssesment.repo.TodoRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class TodoServiceImpl implements TodoService {

	private final TodoRepository todoRepository;
	@Override
	public Todo createTodo(Todo todo) {
		// TODO Auto-generated method stub
		return todoRepository.save(todo);
	}

	@Override
	public List<Todo> getAllTodo() {
		// TODO Auto-generated method stub
		return todoRepository.findAll();
	}

	@Override
	public void deleteTodo(Integer id) {
		// TODO Auto-generated method stub
		Todo tempTodo= todoRepository.getReferenceById(id);
		todoRepository.deleteById(id);;
	}

	@Override
	public Todo updateTodo(Integer id, Todo todo) {
		// TODO Auto-generated method stub
		Todo tempTodo= todoRepository.getReferenceById(id);
		BeanUtils.copyProperties(todo, tempTodo, "todoIdInteger");
		return todoRepository.save(tempTodo);
		
	}

}
