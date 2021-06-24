package com.dit.dsa.recursion;

import java.util.ArrayList;

public class MazePathProblem {
	
	public static ArrayList<String> getMazePath(int currentRow, int currentColumn, int endRow, int endColumn)
	{
		if(currentRow == endRow && currentColumn == endColumn)
		{
			ArrayList<String> t = new ArrayList<>();
			t.add("");
			return t;
		}

		if(currentRow > endRow || currentColumn > endColumn)
		{
			ArrayList<String> t = new ArrayList<>();
			return t;
		}
		
		ArrayList<String> result = new ArrayList<>();
		
		ArrayList<String> horizontalResult = getMazePath(currentRow, currentColumn + 1, endRow, endColumn);
		
		for(String tempResult : horizontalResult) {
			result.add("H"+tempResult);
		}
		
		ArrayList<String> verticalResult = getMazePath(currentRow + 1, currentColumn, endRow, endColumn);
		
		for(String tempResult : verticalResult) {
			result.add("V"+tempResult);
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(getMazePath(0, 0, 2, 2));

	}

}
