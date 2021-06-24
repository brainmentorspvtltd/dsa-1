package com.dit.dsa.recursion;

public class StairClimb {
	
	public static int countClimb(int n)
	{
		if(n == 0 || n == 1)
		{
			return 1; 
		}
		
		if(n == 2)
		{
			return 2;
		}
		else {
			return countClimb(n - 3) + countClimb(n - 2) + countClimb(n - 1);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(countClimb(4));

	}

}
