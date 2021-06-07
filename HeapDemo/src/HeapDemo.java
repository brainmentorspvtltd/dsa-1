import java.util.ArrayList;

class Emp {
	long id;
	String name;
	double salary;
	
	Emp(long id, String name, double salary)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
}

public class HeapDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ArrayList l = new ArrayList();
		System.out.println("Heap Demo start.....");
		long i = 1;
		
		while(true) //infinite loop
		{
			Emp e = new Emp(i, "Ram"+i, 5000);
			Thread.sleep(50);
			l.add(e);
			i++;
		}
	}

}
