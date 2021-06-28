package com.dit.dsa.backtracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateParanthesis {
	
	public static void helper(List<String> ans, String currentBrackets, int open, int close, int max)
	{
		//base case
		if(currentBrackets.length() == max * 2)
		{
			ans.add(currentBrackets);
			return;
		}
		
		if(open < max)
		{
			helper(ans, currentBrackets+"(", open + 1, close, max);
		}
		
		if(close < open)
		{
			helper(ans, currentBrackets+")", open, close + 1, max);
		}
	}
	
	public static List<String> generate(int n)
	{
		List<String> ans = new ArrayList();
		helper(ans, "", 0, 0, n); // int open, int close, int max
		return ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(generate(3));

	}

}
