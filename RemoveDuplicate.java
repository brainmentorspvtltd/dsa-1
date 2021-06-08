
public class RemoveDuplicate {

	public static String removeDuplicate(String s)
	{
		String str = new String().intern();
		int len = s.length();
		
		for(int i = 0; i < len; i++) {
			
			char c = s.charAt(i);
			
			System.out.println(str.indexOf(c));
			if(str.indexOf(c) < 0) // - 1 < 0
			{
				str += c;// str = str + c; // add c to str // karem
			}
		}
		
		return str;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "kareema"; // karem
		
		System.out.println(removeDuplicate(str));

	}

}
