package com.dit.dsa.stack;

class Stack {
	final int max = 100;
	int top = -1; // initially stack is empty, so top is at -1 position
	
	int arr[] = new int[max];
	
	boolean push(int value)
	{
		if(top >= (max - 1))
		{
			System.out.println("Stack Overflow");
			return false;
		}
		
		else {
			arr[++top] = value;
			System.out.println(value + " pushed into a Stack");
			return true;
		}
	}
	
	int pop()
	{
		if(top < 0)
		{
			System.out.println("Stack Underflow");
			return 0;
		}
		else {
			int value = arr[top--];
			
			return value;
		}
	}
	
	int peek()
	{
		if(top < 0)
		{
			System.out.println("Stack Underflow");
			return 0;
		}
		
		else {
			int value = arr[top];
			return value;
		}
	}
	
}

public class StackWithArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack stack = new Stack();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		
		System.out.println(stack.pop() + " Popped value from the stack");
		
		System.out.println(stack.peek()+" Peek end of the stack");

	}

}
