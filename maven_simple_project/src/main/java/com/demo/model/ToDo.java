package com.demo.model;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class ToDo {
	
//	private String todoID;
//	private String todoName;
//
//	public ToDo(String todoName)
//	{
//		this.todoID=UUID.randomUUID().toString();
//		this.todoName=todoName;
//	}
	String toDoId;
	String toDoName;
	
	public ToDo(String toDoName)
	{
		this.toDoId = UUID.randomUUID().toString();
		this.toDoName= toDoName;
		
	}

	@Override
	public String toString() {
		return "ToDo [toDoId=" + toDoId + ", toDoName=" + toDoName + "]";
	}

	public String getToDoId() {
		return toDoId;
	}

	public void setToDoId(String toDoId) {
		this.toDoId = toDoId;
	}

	public String getToDoName() {
		return toDoName;
	}

	public void setToDoName(String toDoName) {
		this.toDoName = toDoName;
	}
	
	

}
