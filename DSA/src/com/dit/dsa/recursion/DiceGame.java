package com.dit.dsa.recursion;

import java.util.ArrayList;

public class DiceGame {
	
	public static ArrayList<String> reachTo10(int currentValue, int endValue)
	{
		//base case
		if(currentValue == endValue)
		{
			ArrayList<String> t = new ArrayList<>();
			t.add("");
			return t;
		}
		
		//Negative Base Case
		if(currentValue > endValue)
		{
			ArrayList<String> t = new ArrayList<>();
			return t;
		}
		
		ArrayList<String> tempResult = new ArrayList<>();
		
		//Now roll the dice
		for(int dice = 1; dice <= 6; dice++)
		{
			int newValue = currentValue + dice;
			ArrayList<String> result = reachTo10(newValue, endValue);
			
			for(String r : result)
			{
				tempResult.add(dice + r);
			}
		}
		
		return tempResult;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(reachTo10(0, 4));

	}

}
