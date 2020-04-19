package com.example.service;

import java.util.ArrayList;
import java.util.List;

import com.demo.model.Task;
import com.demo.model.ToDo;

public interface ToDoServive {

//	public void createTask(ToDo todo);
//	public List<ToDo> getAllToDo();
	public void createToDoService(String toDoName);
	public ArrayList<Task> display();
	public void deleteService(String toDoName);
	public void updateService(String oldName,String toDoName);
}
