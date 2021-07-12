package com.dit.dsa.stack;

import java.util.Stack;

public class CelebriityProblem {
	
	static int matrix[][] = {
							{0, 0, 1, 0},
							{0, 0, 1, 0},
							{0, 0, 0, 0},
							{0, 0, 1, 0}
	};
	
	public static boolean knows(int a, int b)
	{
		return (matrix[a][b] == 1) ? true : false;
	}
	
	public static int findCelebrity(int n)
	{
		Stack<Integer> stack = new Stack<>();
		
		for(int i = 0; i < n ; i++)
		{
			stack.push(i);
		}
		
		while(stack.size() > 1)
		{
			int a = stack.pop();
			int b = stack.pop();
			
			if(knows(a, b))
			{
				stack.push(b);
			}
			else {
				stack.push(a);
			}
		}
		
		if(stack.isEmpty())
		{
			return -1;
		}
		
		int last = stack.pop();
		
		//check if the last person celebrity or not
		for(int i = 0; i < n; i++)
		{
			if(i != last && (knows(last, i) || !knows(i, last)))
			{
				return -1;
			}
		}
		
		return last;		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result = findCelebrity(4);
		
		if(result == -1)
		{
			System.out.println("No Celebrity");
		}
		else {
			System.out.println("Celebrity is "+result);
		}
	}

}
