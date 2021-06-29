package com.dit.dsa.backtracking;

public class SodokuProblem {
	
	static int board[][] = {
							{5, 3, 0, 0, 7, 0, 0, 0, 0},
							{6, 0, 0, 1, 9, 5, 0, 0, 0},
							{0, 9, 8, 0, 0, 0, 0, 6, 0},
							{8, 0, 0, 0, 6, 0, 0, 0, 3},
							{4, 0, 0, 8, 0, 3, 0, 0, 1},
							{7, 0, 0, 0, 2, 0, 0, 0, 6},
							{0, 6, 0, 0, 0, 0, 2, 8, 0},
							{0, 0, 0, 4, 1, 9, 0, 0, 5},
							{0, 0, 0, 0, 8, 0, 0, 7, 9}
			
	};
	
	static int MAX_BOARD_SIZE = 9;
	
	public static void display()
	{
		for(int i = 0; i < board.length; i++)
		{
			for(int j = 0; j < board[0].length; j++)
			{
				System.out.print(board[i][j] + " ");
			}
			
			System.out.println();
		}
	}
	
	//check if a number is already present in a row	
	public static boolean isPresentInRow(int row, int data)
	{
		for(int col = 0; col < board.length; col++)
		{
			if(board[row][col] == data)
			{
				return true;
			}
		}
		
		return false;
	}
	
	//check if a number is already present in a col
	public static boolean isPresentInCol(int col, int data)
		{
			for(int row = 0; row < board.length; row++)
			{
				if(board[row][col] == data)
				{
					return true;
				}
			}
			
			return false;
	}
	
	//Check if a number is already present in a 3X3 box
	public static boolean isPresentInBox(int row, int col, int data)
	{
		int r = row - row % 3;
		int c = col - col % 3;
		
		for(int i = r; i < r + 3; i++)
		{
			for(int j = c; j < c + 3; j++)
			{
				if(board[i][j] == data)
				{
					return true;
				}
			}
		}
		
		return false;
	}
	
	
	public static boolean isSafePlace(int row, int col, int data)
	{
		return !isPresentInRow(row, data) && !isPresentInCol(col, data) && !isPresentInBox(row, col, data);
	}
	
	public static boolean solveIt(int row, int col)
	{
		//checking col is reach to the end
		if(col == MAX_BOARD_SIZE)
		{
			row = row + 1;
			col = 0;
		}
		
		//base case reach to the end of the board
				if(row == board.length)
				{
					display();
					return true;
				}		
		
		//Checking if the value is present then do recursive call and move to the next col
		if(board[row][col] != 0)
		{
			return solveIt(row, col + 1);
		}
		
		
		
		//checking for those does not have the values
		for(int i = 1; i <= MAX_BOARD_SIZE; i++)
		{
			if(isSafePlace(row, col, i))
			{
				board[row][col] = i;
				
				//Keep checking for the next col
				boolean result = solveIt(row, col + 1);
				
				//If result comes true it means reach to the board end
				if(result)
				{
					return true;
				}
				
				//backtracking (undo)
				board[row][col] = 0;
			}
			
		}
		
		//If nothing works then we return false
		return false;
		
	}
	
	public static void main(String[] args) {
		
		String result = solveIt(0, 0) ? "Solve It" : "Not Solve It";
		
		System.out.println(result);
		
	}

}
