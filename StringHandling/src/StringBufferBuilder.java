
public class StringBufferBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long startTime = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("Java");
		
		for(int i = 0; i < 10000; i++)
		{
			sb.append("Advanced Java");
		}
		System.out.println("Time taken by StringBuffer is: "+(System.currentTimeMillis() - startTime));
		
		startTime = System.currentTimeMillis();
		
		StringBuilder s = new StringBuilder("Java");
		
		for(int i = 0; i < 10000; i++)
		{
			s.append("Advanced Java");
		}
		
		System.out.println("Time taken by StringBuffer is: "+(System.currentTimeMillis() - startTime));
	}

}
