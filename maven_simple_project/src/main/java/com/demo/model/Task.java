package com.demo.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@EqualsAndHashCode
public class Task {
	
//	private String taskID;
//	private List<ToDo> todos;
//	
//	{
//		taskID=UUID.randomUUID().toString();
//		todos=new ArrayList<ToDo>();
//	}
//
//	public void craeteToDo(ToDo todo) {
//		todos.add(todo);
//		System.out.println("todo added successfully.!");
//	}
//
//	public List<ToDo> getAllToDo()
//	{
//		return todos;
//	}
	
	ArrayList<Task> objArray;
	private String taskId;
	private ToDo  objTodo; 
		
	Task objTask ;
	
	{
		objArray= new ArrayList<Task>();
		taskId=UUID.randomUUID().toString();
		
	}
	
	
	public void addTodo(ToDo objTodo)
	{
		objTask = new Task();
		objTask.setToDoId(taskId);
		objTask.setObjTodo(objTodo);
		objArray.add(objTask);
	}
	
	public ArrayList<Task> display()
	{
		return objArray;
	}
	
	public void delete(String todoName)
	{
		int i=0;
		for(Task task:objArray)
		{
			if(task.getObjTodo().getToDoName().equals(todoName))
			{
				objArray.remove(i);
				System.out.println("object deleted");
				break;
			}
			i++;
		}
	}
	
	public void update(String oldName,String toDoName)
	{
		
		int i=0;
		for(Task task:objArray)
		{
			if(task.getObjTodo().getToDoName().equals(oldName))
			{
				objTask = new Task();
				objTodo = task.getObjTodo();
				objTodo.setToDoName(toDoName);
				objTask.setObjTodo(objTodo);
				objArray.set(i,objTask);
				System.out.println("object updated");
				break;
			}
			i++;
		}
	
		
		
	}

}
