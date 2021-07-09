package com.dit.dsa.stack;
import java.util.Stack;

public class ReverseStackRecursion {
	
	static Stack<Character> stack = new Stack<>();
	
	public static void insertAtBottom(char data)
	{
		if(stack.isEmpty())
		{
			stack.push(data);
		}
		else {
			char value = stack.peek();
			stack.pop();
			insertAtBottom(data);
			
			stack.push(value);
		}
	}
	
	public static void reverse()
	{
		if(stack.size() > 0)
		{
			char data = stack.peek();
			stack.pop();
			reverse();
			
			insertAtBottom(data);
		}
	}
	
	public static void main(String[] args) {
		
		//push into a stack
		stack.push('1');
		stack.push('2');
		stack.push('3');
		stack.push('4');
		
		System.out.println(stack);
		
		//function to reverse the stack
		reverse();
		
		System.out.println("Reversed Stack ");
		System.out.println(stack);
		
	}

}
