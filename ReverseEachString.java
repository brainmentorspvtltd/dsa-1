
public class ReverseEachString {
	
	public static void reverseEachWord(String inputString)
	{
		String[] words =  inputString.split(" ");
		
		String reverseString = "";
		
		for(int i = 0; i < words.length; i++)
		{
			String word = words[i];
			
			String reverseWord = "";
			
			for(int j = word.length()-1; j >= 0; j--)
			{
				reverseWord = reverseWord + word.charAt(j); // Hello- olleH, How- woH
			}
			
			// "" = "" + olleH + " ";
			//olleH 
			//olleH = olleH + woH + " ";
			reverseString = reverseString + reverseWord + " ";
		}
		
		System.out.println("Reverse Each Word of a Given String: "+reverseString);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		reverseEachWord("Hello How are you");

	}

}
