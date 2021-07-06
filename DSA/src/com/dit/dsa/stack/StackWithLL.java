package com.dit.dsa.stack;

public class StackWithLL {
	
	StackNode top;
	
	static class StackNode {
		int data;
		StackNode next;
		
		StackNode(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	
	public void push(int data)
	{
		StackNode newNode = new StackNode(data);
		
		if(top == null)
		{
			top = newNode;
		}
		
		else {
			StackNode temp = top;		
			top = newNode;
			newNode.next = temp;
		}
		
		System.out.println(data + " pushed into a Stack");
	}
	
	public int pop()
	{
		int popped = Integer.MIN_VALUE;
		
		if(top == null)
		{
			System.out.println("Stack Underflow");
		}
		else {
			popped = top.data;
			top = top.next;
		}
		
		return popped;
	}
	
	public int peek()
	{
		if(top == null)
		{
			System.out.println("Stack Underflow");
			return Integer.MIN_VALUE;
		}
		else {
			return top.data;
		}
	}
	
	public boolean isEmpty()
	{
		if(top == null)
		{
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		StackWithLL stack = new StackWithLL();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		
		System.out.println(stack.pop()+" pooped from the stack");
		System.out.println(stack.peek()+" Peek value of the stack"); 
		
		if(stack.isEmpty())
		{
			System.out.println("Stack is Empty. Stack Underflow");
		}
		else {
			System.out.println("Stack is not Empty");
		}
	}
}
