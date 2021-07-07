package com.dit.dsa.stack;

public class NGE {
	
	static class Stack{
		int top;
		int max = 100;
		int arr[] = new int[max];
		
		void push(int value)
		{
			if(top == max-1)
			{
				System.out.println("Stack Overflow");
			}
			else {
				arr[++top] = value;
			}
		}
		
		int pop()
		{
			if(top == -1)
			{
				System.out.println("Stack Underflow");
				return -1;
			}
			else {
				int data = arr[top];
				top--;
				return data;
			}
		}
		
		boolean isEmpty()
		{
			return (top == -1) ? true : false;
		}
	}
	
	public static void findNGE(int arr[], int n)
	{
		Stack stack = new Stack();
		stack.top = -1;
		int element, next;
		
		stack.push(arr[0]);
		
		for(int i = 1; i < n; i++)
		{
			next = arr[i];
			
			if(stack.isEmpty() == false) // if stack is not empty
			{
				element = stack.pop();
				
				while(element < next)
				{
					System.out.println(element+"->"+next);
					
					if(stack.isEmpty() == true)
					{
						break;
					}
					
					element = stack.pop();
				}
				
				if(element > next)
				{
					stack.push(element);
				}
			}
			
			stack.push(next);
			
		}
		
		while(stack.isEmpty() == false)
		{
			element = stack.pop();
			next = -1;
			System.out.println(element+"->"+next);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {11, 13, 21, 3};
		
		findNGE(arr, arr.length);

	}

}
