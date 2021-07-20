package com.dit.dsa.bitmanipulation;

public class PowerofTwo {
	
	public static boolean checkPowerOfTwo(int n)
	{
		return n != 0 && ((n & (n - 1)) == 0); // 32 & 31
		
		// 7 - 0111
		// 6 - 0110
		//     0110 - 6 not equal to zero
		
		// 0010 0000 - 32
		// 0001 1111 - 31
		 //  0000 0000 - 0
	}
	
	public static void main(String[] args) {
		
		System.out.println(checkPowerOfTwo(32) ? "Yes" : "No");
		
		System.out.println(checkPowerOfTwo(7) ? "Yes" : "No");
		
	}

}
