package com.example.service;

import java.util.ArrayList;
import java.util.List;

import com.demo.dao.ToDoDao;
import com.demo.dao.ToDoDaoImpl;
import com.demo.model.Task;
import com.demo.model.ToDo;

public class ToDoServiceImpl implements ToDoServive
{
	private ToDoDao objdao;
	
	{
		objdao = new ToDoDaoImpl();
	}
//
//	public void createTask(ToDo todo) {
//		dao.createTask(todo);
//	}
//
//	public List<ToDo> getAllToDo() {
//		// TODO Auto-generated method stub
//		return dao.getAllToDo();
//	}
	
	//ToDoDao objDao = new ToDoDao();
	
	public void createToDoService(String toDoName)
	{
		objdao.createTask( toDoName);
	}
	
	public ArrayList<Task> display()
	{

		return objdao.display();

	}
	public void deleteService(String toDoName)
	{
		objdao.delete(toDoName);
	}
	
	public void updateService(String oldName,String toDoName)
	{
		objdao.update(oldName, toDoName);
	}

}
