package com.demo.dao;

import java.util.ArrayList;

import com.demo.model.Task;
import com.demo.model.ToDo;

public class ToDoDaoImpl implements ToDoDao{
	
// private Task task;
//	
//	{
//		task=new Task();
//	}
//
//	public void createTask(ToDo todo) {
//		task.craeteToDo(todo);
//
//		
//	}
//
//	public List<ToDo> getAllToDo() {
//		
//		return task.getAllToDo();
//	}
	
	int id = 0;
	Task objTask = new Task();
	ToDo objTodo;
	public void createTask(String toDoName)
	{
		objTask.addTodo(new ToDo(toDoName));
		System.out.println("todo added");
	}
	
	
	public ArrayList<Task> display()
	{
		return objTask.display();

	}
	
	public void delete(String toDoName)
	{
		objTask.delete(toDoName);
		
	}
	
	public void update(String oldName,String toDoName)
	{
		objTask.update(oldName, toDoName);
	}

}
