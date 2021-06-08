
public class StringIntViceVersa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "20";
		
		//int n = Integer.parseInt(name); // 1st way
		
		Integer n = Integer.valueOf(name); // 2nd way
		
		System.out.println(n);
		
		int x = 10;
		
		String str = Integer.toString(x);  // 1st way
		
		//String str = String.valueOf(x); // 2nd way
		System.out.println(str);
		
	}
}
