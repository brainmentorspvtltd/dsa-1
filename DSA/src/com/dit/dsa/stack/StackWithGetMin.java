package com.dit.dsa.stack;

import java.util.Stack;

class MinStack {
	
	Stack<Node> stack;
	
	class Node {
		int val;
		int min;
		
		Node(int val, int min)
		{
			this.val = val;
			this.min = min;
		}
	}
	
	//initialize the data structure
	public MinStack()
	{
		this.stack = new Stack<Node>();
	}
	
	public void push(int value)
	{
		if(stack.isEmpty())
		{
			this.stack.push(new Node(value, value));
		}
		else {
			int min = Math.min(this.stack.peek().min, value);
			this.stack.push(new Node(value, min));			
		}
	}
	
	public int pop()
	{
		return this.stack.pop().val;
	}
	
	public int top()
	{
		return this.stack.peek().val;
	}
	
	public int getMin()
	{
		return this.stack.peek().min;
	}
}


public class StackWithGetMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MinStack s = new MinStack();
		
		s.push(1);
		s.push(-1);
		s.push(-4);
		s.push(0);
		
		System.out.println(s.getMin());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.getMin());
		
		
	}

}
