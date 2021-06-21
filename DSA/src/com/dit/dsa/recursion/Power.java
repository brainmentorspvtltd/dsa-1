package com.dit.dsa.recursion;

public class Power {
	
	public static int pow(int base, int power)
	{
		if(power == 0) // base case
		{
			return 1;
		}
		
		//processing logic
		return base * (pow(base, power - 1)); 
		
		//pow(base, power - 1) - small problem
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result = pow(2, 2);
		System.out.println(result);

	}

}
