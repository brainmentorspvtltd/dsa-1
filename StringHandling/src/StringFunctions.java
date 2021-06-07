
public class StringFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "      Amit     Pandey      ";
		System.out.println(name.length());
		System.out.println(name.charAt(0));
		System.out.println(name.substring(1, 3)); // mi
		//System.out.println(name);
		System.out.println("["+name+"]");
		System.out.println("["+name.trim()+"]");
		System.out.println(name.replace('m', 'v'));
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.concat(" Delhi"));
		System.out.println(name+ " Delhi");
		System.out.println(name.contains("and"));
		System.out.println(name.indexOf("i"));
		System.out.println(name.lastIndexOf("a"));
	}
}
