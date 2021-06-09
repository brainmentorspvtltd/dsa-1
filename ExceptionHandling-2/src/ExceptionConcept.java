
public class ExceptionConcept {
	
	static void dao() throws ArithmeticException
	{
		System.out.println("Connection Open");
		//try with resource
		try {
			
		if(10 > 2)
		{
			System.exit(0); // exit the program
			//return;
		}
			
		//int s = 100 / 0;
		System.out.println("Query and Get Result");
		System.out.println("Send Result to Helper");
		}
		finally {
			//resource clean up code
		System.out.println("Connection Close");
		}
	}
	
	static void helper() throws ArithmeticException
	{
		System.out.println("Call Dao");
		dao();
		System.out.println("Get Result from Dao");
		System.out.println("Send Result to View");
	}
	
	static void view()
	{
		try {
		helper();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Some problem in DAO");
			//e.printStackTrace(); // only for developers
		}
		System.out.println("Call helper");
		System.out.println("Get Result from Helper");
		System.out.println("Print Result to User");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		view();
	}

}
