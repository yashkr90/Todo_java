package com.TodoAssesment.model;

import javax.print.event.PrintJobAttributeEvent;

import org.springframework.stereotype.Service;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Todo_table")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Todo {
	
	@Id
	@Column(name = "Id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer todoIdInteger;
	
	@Column(name = "TodoName")
	private TodoNameEnum todoName;
	
	@Column(name = "isCompleted")
	private Boolean isCompleted;
	
	@Column(name = "CompletionDate")
	private String completionDate;

	@Override
	public String toString() {
		return "Todo [todoIdInteger=" + todoIdInteger + ", todoName=" + todoName + ", isCompleted=" + isCompleted
				+ ", completionDate=" + completionDate + "]";
	}

//	public Todo(Integer todoIdInteger, TodoNameEnum todoName, Boolean isCompleted, String completionDate) {
//		super();
//		this.todoIdInteger = todoIdInteger;
//		this.todoName = todoName;
//		this.isCompleted = isCompleted;
//		this.completionDate = completionDate;
//	}

	
	
	
	
	

}
