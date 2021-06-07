
public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder(200);
		//StringBuffer sb = new StringBuffer(200);
		System.out.println(sb.capacity() + " "+sb.length());
		sb.append("Hello");
		sb.ensureCapacity(250);
		System.out.println(sb.capacity() + " "+sb.length());
		sb.append("How are you I am fine iuegfiuggifgiuefgiuerluifhlqiuewgquuiwqguiglorg");
		System.out.println(sb.capacity() + " "+sb.length());
		
		String name = "Ram".intern(); // 1 or 0
		String name2 = "Ram".intern();
		String name3 = new String("Ram").intern(); // 1 or 2
		String name4 = new String("Ram");
		
		System.out.println(name==name2); // address comapre
		System.out.println(name==name3);
		System.out.println(name3==name4);
		
		String t = "Hello";
		String y = t;
		System.out.println(y==t);
		t = t+" How are you";
		System.out.println(y==t);
	}
}
