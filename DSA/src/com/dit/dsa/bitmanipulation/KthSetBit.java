package com.dit.dsa.bitmanipulation;

public class KthSetBit {
	
	public static void kthSetBit(int n, int k)
	{
		//Right Shift Approach
		
		if(((n >> (k - 1)) & 1) > 0) {

			/*
			 * n = 5 - 0101
			 * 
			 * 0101
			 * 0001 &
			 * 0001 = 1
			 * 
			 * */
			
			System.out.println("Set");
		}
		else {
			System.out.println("Not Set");
		}
		

		/*
		 * Left Shift Approach
		 */
		//if((n & (1 << (k - 1))) > 0) {
			
			/*
			 * n = 6
			 * k = 2
			 * 
			 * 6 - 0110
			 * 
			 * 1 - 0001 << 1 = 0010 = 2
			 * 
			 * 0110
			 * 0010 &
			 * 0010 = 2
			 * 
			 * */
			
			/*
			 * n = 5, k = 1
			 * 
			 * 5 - 0101
			 * 1 - 0001 &
			 *     0001 = 1
			 * */
			
		/*	System.out.println("Set");
		}
		else {
			System.out.println("Not Set");
		}*/
	}

	public static void main(String[] args) {
		
		int n = 5, k = 1;
		//int n = 6, k = 2;
		//int n = 2, k = 3;
		
		kthSetBit(n, k);
		
	}
	
}
