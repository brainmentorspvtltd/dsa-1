interface Parent1 {
	void print();
}

interface Parent2 {
	void show();
}

class Child implements Parent1, Parent2 {
	public void print()
	{
		System.out.println("Parent1 print method");
	}
	public void show()
	{
		System.out.println("Parent2 show method");
	}
}

public class MultipleIInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Child obj = new Child();
		obj.print();
		obj.show();
		
	}

}
