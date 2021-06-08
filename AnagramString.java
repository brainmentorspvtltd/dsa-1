import java.util.Arrays;

public class AnagramString {
	
	public static void anagramString(String str1, String str2)
	{
		if(str1.length() != str2.length())
		{
			System.out.println("Not Anagram String");
			return;
		}
		
		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();
		
		//Sort
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		//Compare
		for(int i = 0; i < arr1.length; i++)
		{
			if(arr1[i] != arr2[i])
			{
				System.out.println("Not Anagram String");
				return;
			}	
		}
		
		System.out.println("Anagram String");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Anagram of a string is another string with exactly the same quantity of each characters in it, in any order.
		
		anagramString("listen", "silent");

	}

}
