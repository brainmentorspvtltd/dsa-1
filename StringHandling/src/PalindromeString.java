
public class PalindromeString {
	
	static boolean isPalindrome(String str)
	{
		int i = 0, j = str.length() - 1;
		
		while(i < j)
		{
			if(str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Original String = Reversed String // Palindrome
		
		String str  = "malayalam"; // 
		
		if(isPalindrome(str))
		{
			System.out.println("Palindrome String");
		}
		else {
			System.out.println("Not a Palindrome String");
		}
	}

}
