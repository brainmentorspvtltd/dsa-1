package com.brainmentors.todo.views;

import static com.brainmentors.todo.utils.Constants.ADD;
import static com.brainmentors.todo.utils.Constants.PRINT;
import static com.brainmentors.todo.utils.MessageReader.getValue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.brainmentors.todo.dto.ToDoDTO;
import com.brainmentors.todo.repo.IToDoRepo;
import com.brainmentors.todo.repo.TodoRepo;

public class ToDoView {
	static Scanner scanner = new Scanner(System.in);
	static void print() {
		IToDoRepo todoRepo = TodoRepo.getInstance();
		try {
			ArrayList<ToDoDTO> list = todoRepo.printTask();
			if(list.size()>0) {
				for(ToDoDTO todo: list) {
					System.out.println(todo);
				}
			}
			else {
				System.out.println("List is empty ");
			}
		} catch (IOException | ClassNotFoundException e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	static void add() {
		scanner.nextLine();
		System.out.println(getValue("entername"));
		String name = scanner.nextLine();
		System.out.println(getValue("enterdesc"));
		String desc = scanner.nextLine();
		ToDoDTO toDoDTO = new ToDoDTO(name, desc);
		IToDoRepo todoRepo  = null;
		try {
			todoRepo = TodoRepo.getInstance();
			String result = todoRepo.addTask(toDoDTO)?getValue("record.added"):getValue("record.added.fail");
			System.out.println(result);
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Error in Record Add");
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		
		while(true) {
			System.out.println(getValue("addtask"));
			System.out.println(getValue("removetask"));
			System.out.println(getValue("updatetask"));
			System.out.println(getValue("searchtask"));
			System.out.println(getValue("printtask"));
			System.out.println(getValue("choice"));
			int choice = scanner.nextInt();
			switch(choice) {
			case ADD:
				
				add();
				break;
			case PRINT:
				print();
				break;
			}
			
		}
	}

}
