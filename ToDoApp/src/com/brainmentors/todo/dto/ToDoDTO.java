package com.brainmentors.todo.dto;

import java.io.Serializable;
import java.util.Date;

import com.brainmentors.todo.utils.Constants;

public class ToDoDTO implements Serializable,  Constants{
	private String name;
	private String description;
	private String status;
	private Date date;
	
	public ToDoDTO(String name, String description) {
		super();
		this.name = name;
		this.description = description;
		this.status =NEW;
		this.date = new Date();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "ToDoDTO [name=" + name + ", description=" + description + ", status=" + status + ", date=" + date + "]";
	}
	
	

}
