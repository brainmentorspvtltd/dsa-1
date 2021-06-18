package com.dit.dsa.string;

public class RemoveAdjacent {
	
	public static String removeDuplicate(char[] chars)
	{
		int k = 0;
		char prev = '\0';
		
		for(char c : chars)
		{
			if(prev != c)
			{
				chars[k++] = c;
				prev = c;
			}
		}
		
		return new String(chars).substring(0, k);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "AAABBCDDD";
		
		str = removeDuplicate(str.toCharArray());
		
		System.out.println(str);

	}

}
