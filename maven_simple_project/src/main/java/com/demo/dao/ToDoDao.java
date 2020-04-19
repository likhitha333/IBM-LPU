package com.demo.dao;

import java.util.ArrayList;
import java.util.List;

import com.demo.model.Task;
import com.demo.model.ToDo;

public interface ToDoDao {
	
//	public void createTask(ToDo todo);
//	public List<ToDo> getAllToDo();
	
	public void createTask(String toDoName);
	
	public ArrayList<Task> display();
	
	public void delete(String toDoName);
	
	public void update(String oldName,String toDoName);	



}
