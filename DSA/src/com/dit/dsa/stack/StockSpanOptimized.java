package com.dit.dsa.stack;
import java.util.Arrays;
import java.util.Stack;

public class StockSpanOptimized {
	
	public static void calculate(int price[], int n, int S[])
	{
		Stack<Integer> stack = new Stack<>();
		stack.push(0);
		
		S[0] = 1; // span value of first element is always 1
		
		for(int i = 1; i < n; i++) // calculate remaining span values 
		{
			//If stack is not empty then pop elements from the stack, top of stack is smaller than price[i]
			while(!stack.isEmpty() && price[stack.peek()] <= price[i])
			{
				stack.pop();
			}
			
			// if stack is empty, then price[i] greater than all elements on left, else price[i] is greater than elements after top of stack.
			S[i] = (stack.isEmpty()) ? (i + 1) : (i - stack.peek());
			stack.push(i);
		}
	}
	
	public static void print(int arr[])
	{
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int price[] = {100, 80, 60, 70, 60, 75, 85};
		int n = price.length;
		int S[] = new int[n];
		
		calculate(price, n, S);

		print(S);
	}

}
