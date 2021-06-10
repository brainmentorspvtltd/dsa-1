package com.brainmentors.todo.repo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.brainmentors.todo.dto.ToDoDTO;
import com.brainmentors.todo.utils.Constants;

// Singleton class - Design Pattern (Best Practice)
public class TodoRepo implements IToDoRepo{
	private File file;
	private static TodoRepo todoRepo;
	
	private TodoRepo() throws IOException{
		file = new File(Constants.FILE_PATH);
		if(!file.exists()) {
			file.createNewFile();
			System.out.println("File Created...");
		}
	}
	
	public static IToDoRepo getInstance() {
		if(todoRepo==null) {
			try {
				todoRepo = new TodoRepo();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return todoRepo;
	}
	
	@Override
	public boolean addTask(ToDoDTO todo) throws IOException, ClassNotFoundException {
		
		ArrayList<ToDoDTO> list = printTask();
		if(list!=null && list.size()>0) {
			list.add(todo);
		}
		else {
			list = new ArrayList<>();
			list.add(todo);
		}
		// TODO Auto-generated method stub
		FileOutputStream fo = null;
		ObjectOutputStream os = null;
		try {
			 fo = new FileOutputStream(file);
			 os = new ObjectOutputStream(fo);
		os.writeObject(list);
		}
		finally {
			if(os!=null) {
			os.close();
			}
			if(fo!=null) {
			fo.close();
			}
		}
		return true;
	}

	@Override
	public boolean removeTask(ToDoDTO todo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ToDoDTO searchTask(ToDoDTO todo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateTask(ToDoDTO todo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<ToDoDTO> printTask() throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream fs = null;
		ObjectInputStream os = null;
		ArrayList<ToDoDTO> list = new ArrayList<>();
		try {
		fs = new FileInputStream(file);
		os = new ObjectInputStream(fs);
		
		
			ArrayList<ToDoDTO> todolist = (ArrayList<ToDoDTO>)os.readObject();
			if(todolist.size()>0) {
				for(ToDoDTO todoDTO: todolist) {
					list.add(todoDTO);
				}
			}
			
		}
		
		catch(Exception e) {
			System.out.println(e);
			
		}
		finally {
			if(os!=null) {
				os.close();
			}
			if(fs!=null) {
				fs.close();
			}
		}
		return list;
		
	}

}
