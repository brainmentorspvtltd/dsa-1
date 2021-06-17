
public class AnagramString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		anagramString("silent", "listen");

	}
	
	public static void anagramString(String str1, String str2)
	{
		if(str1.length() != str2.length())
		{
			System.out.println("Not Anagram String");
			return;
		}
		
		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();
		
		//Hashing
		int hash1[] = new int[256]; // hash: default 0
		int hash2[] = new int[256];
		
		for(int i = 0; i < arr1.length; i++)
		{
			++hash1[arr1[i]]; // hash1[h] - 104 - 1
		}
		
		for(int i = 0; i < arr2.length; i++)
		{
			++hash2[arr2[i]]; // 1
		}
		
		for(int i = 0; i < hash1.length; i++)
		{
			if(hash1[i] != hash2[i])
			{
				System.out.println("Not Anagram String");
				return;
			}
		}
		
		System.out.println("Anagram String");
	
	}
}
