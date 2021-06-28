package com.dit.dsa.backtracking;

public class NQueenCount {
	
	public static boolean isSafePlace(boolean chessBoard[][], int row, int col)
	{
		//Row check , Col Check , And Diagonal Check
		
		for(int i = row; i >= 0; i--)
		{
			if(chessBoard[i][col])
			{
				return false;
			}
		}
		
		for(int i = row, j = col; i >= 0 && j >= 0; i--, j--)
		{
			if(chessBoard[i][j])
			{
				return false;
			}
		}
		
		for(int i = row, j = col; i >= 0 && j < chessBoard.length; i--, j++)
		{
			if(chessBoard[i][j])
			{
				return false;
			}
		}
		
		return true;
	}
	
	public static int countQueenPlacement(boolean chessBoard[][], int currentRow)
	{
		int count = 0;
		
		//Termination Case
		if(currentRow == chessBoard.length)
		{
			return 1; // Return 1 count possibility
		}
		
		//current row and traverse all the cells
		for(int col = 0; col < chessBoard[currentRow].length; col++) // board[0].length - col
		{
			//before placing queen, just check row wise, col wise and diagonal wise
			
			if(isSafePlace(chessBoard, currentRow, col))
			{
				chessBoard[currentRow][col] = true; // Queen Place
				count = count + countQueenPlacement(chessBoard, currentRow + 1);
				
				chessBoard[currentRow][col] = false; // undo (Post processing)
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean chessBoard[][] = new boolean[4][4]; // by default value is false for all the cells
		
		int count = countQueenPlacement(chessBoard, 0);
		
		System.out.println(count);

	}

}
