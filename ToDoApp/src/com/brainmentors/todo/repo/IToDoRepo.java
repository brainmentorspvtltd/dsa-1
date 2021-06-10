package com.brainmentors.todo.repo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import com.brainmentors.todo.dto.ToDoDTO;

public interface IToDoRepo {
	
	public boolean addTask(ToDoDTO todo) throws IOException, ClassNotFoundException;
	public boolean removeTask(ToDoDTO todo);
	public ToDoDTO searchTask(ToDoDTO todo);
	public boolean updateTask(ToDoDTO todo);
	public ArrayList<ToDoDTO> printTask() throws IOException, ClassNotFoundException;
	

}
