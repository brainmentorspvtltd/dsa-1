package com.dit.dsa.string;

public class NonRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "garima";
		boolean unique = true;
		
		for(int i = 0; i < str.length(); i++)
		{
			for(int j = 0; j < str.length(); j++)
			{
				if(i < j && str.charAt(i) == str.charAt(j)) {
					unique = false;
					break;
				}
				else if(unique)
				{
					System.out.println("First non-repeating char "+str.charAt(j));
					return;
				}
			}
		}

	}

}
