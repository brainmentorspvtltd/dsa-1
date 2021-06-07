
public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "Hello How are you";
		/*StringBuilder sb = new StringBuilder();
		
		sb.append(input);
		
		sb.reverse();
		
		System.out.println(sb);
		*/
		
		char[] input1 = input.toCharArray();
		
		for(int i = input1.length-1; i>=0; i--)
		{
			System.out.print(input1[i]);
		}
	}
}
