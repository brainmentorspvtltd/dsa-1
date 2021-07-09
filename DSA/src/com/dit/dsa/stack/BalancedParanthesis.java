package com.dit.dsa.stack;

import java.util.HashMap;

public class BalancedParanthesis {
	
	static class Stack {
		int top = -1;
		int max = 100;
		char arr[] = new char[max];
		
		void push(char value)
		{
			if(top == max - 1)
			{
				System.out.println("Stack Overflow");
			}
			else {
				arr[++top] = value;
			}
		}
		
		char pop()
		{
			if(top == -1)
			{
				System.out.println("Stack Underflow");
				return 0;
			}
			else {
				char data = arr[top];
				top--;
				return data;
			}
		}
		
		boolean isEmpty()
		{
			return (top == -1) ? true : false;
		}
	}
	
	public static boolean checkParanthesis()
	{
		Stack stack = new Stack();
		String input = "{}([()])";
		
		HashMap<Character, Character> map = new HashMap<>();
		
		map.put('(',')');
		map.put('[',']');
		map.put('{','}');
		
		//String char by char traverse
		
		for(int i = 0; i < input.length(); i++)
		{
			//if opening bracket
			if(input.charAt(i) == '(' || input.charAt(i) == '[' || input.charAt(i) == '{')
			{
				stack.push(input.charAt(i));
			}
			else {
				//Not Opening Bracket
				
				Character currentBracket = stack.pop();
				currentBracket = map.get(currentBracket);
				
				if(currentBracket != input.charAt(i)) {
					//System.out.println("Not Balanced");
					return false;
				}
			}
		}
		
		if(stack.isEmpty())
		{
			//System.out.println("Balanced");
			return true;
		}
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(checkParanthesis())
		{
			System.out.println("Balanced");
		}
		else {
			System.out.println("Not Balanced");
		}

	}

}
