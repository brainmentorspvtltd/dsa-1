//final class Parent { // to prevent inheritance
class Parent {
	
	public final void print() // to prevent overriding
	{
		System.out.println("Parent class method");
	}
	
}

class Child extends Parent {
	
	//@Override
	/*
	public void print()
	{
		System.out.println("Child class method");
	}
	*/
}

public class FinalKeyword {

	public static void main(String[] args) {
		
		final int i = 10; // to fixed value of any variable
		//i = 30; // error	
		
		Child child = new Child();
		//child.display();
		child.print();

	}
}
