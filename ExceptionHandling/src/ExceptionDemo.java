import java.io.File;
import java.io.IOException;

public class ExceptionDemo {

	public static void main(String[] args) {

		//Exception Abnormal condition which terminates the program flow
		
		System.out.println("DB connection open...");
		System.out.println("DB Query");
		try {
			
			String path = "E:\\abc.txt";
			
			File file = new File(path);
			
			if(file.exists())
			{
				System.out.println("Yes this file is exist");
				file.delete();
			}
			else {
				file.createNewFile();
				System.out.println("File Created....");
			}
			/*
			
			String name = null;
			
			//if(name != null && name.equals("amit")) 
			if("amit".equals(name)){
				System.out.println("Welcome"+name);
			}
			else 
			{
				System.out.println("hello");
			}
			*/
			/*
			String t = null;
			if(t != null)
			{
			t.toUpperCase();
			}			
			
			int arr[] = new int[10];
			arr[11] = 100;
			
			
		int a = 10 / 0; // throw new ArithemticException();*/
		}
		catch(IOException e)
		{
			System.out.println("File can't be create");
		}
		catch(ArithmeticException e)
		{
			//System.out.println("You Divide a number by zero"+e);
			System.out.println("You divide a number by zero");
			return;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("More than Array Bound Size");
		}
		catch(NullPointerException e)
		{
			System.out.println("Value is null");
		}
		/*
		catch(Exception e)
		{
			System.out.println("Some other problem arise. Contact to System Admin...");
		}
		*/
		System.out.println("Get the result of Query");
		System.out.println("Print the result of the Query");
		System.out.println("Close the DB connection");
	
	}
}
