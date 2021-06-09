
public class ProperCase {
	
	static String toProperCase(String str)
	{
		if(str == null || str.isEmpty())
		{
			return "";
		}
		
		if(str.length() == 1)
		{
			return str.toUpperCase();
		}
		
		String words[] = str.split(" ");
		
		StringBuilder sb = new StringBuilder(str.length());
		
		//1st Way
		
		/*
		for(String word : words)
		{
			if(word.length() > 1)
			{
				sb.append(word.substring(0, 1).toUpperCase()).append(word.substring(1).toLowerCase());
				sb.append(" ");
			}
		}*/
		
		//2nd Way
		
		for(String word : words)
		{
			char charArray[] = word.toLowerCase().toCharArray();
			charArray[0] = Character.toUpperCase(charArray[0]);
			
			sb.append(new String(charArray)).append(" ");
		}
		
		return sb.toString().trim();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "hello java example";
		
		System.out.println(toProperCase(str));

	}

}
