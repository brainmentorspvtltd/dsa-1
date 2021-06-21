package com.dit.dsa.matrix;

public class SetMatrixZero {
	
	public static void setZeroes(int matrix[][], int m, int n) {
		
		boolean row[] = new boolean[m];
		boolean col[] = new boolean[n];
		
		for(int i = 0; i < m; i++)
		{
			row[i] = false;
		}
		
		for(int i = 0; i < n; i++)
		{
			col[i] = false;
		}
		
		for(int i = 0; i < m; i++)
		{
			for(int j = 0; j < n; j++)
			{
				if(matrix[i][j] == 0)
				{
					row[i] = true;
					col[j] = true;
				}
			}
		}
		
		//set zeroes
		for(int i = 0; i < m; i++)
		{
			for(int j = 0; j < n; j++)
			{
				if(row[i] == true || col[j] == true)
				{
					matrix[i][j] = 0;
				}
			}
		}
		
		for(int i = 0; i < m; i++)
		{
			for(int j = 0; j < n; j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int matrix[][] = {
				{1, 1, 0, 1},
				{1, 1, 1, 1},
				{1, 1, 1, 1},
				{1, 1, 1, 0}
		};
		
		setZeroes(matrix, 4, 4);

	}

}
