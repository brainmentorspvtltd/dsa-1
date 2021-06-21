package com.dit.dsa.recursion;

public class TreeRecursion {
	
	public static void func(int n) // 2, 1, 0
	{
		if(n > 0)
		{
			System.out.println(n); // print 2 1 1
			func(n - 1); // 1 0
			func(n - 1); // 1 0
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		func(2);

	}

}
