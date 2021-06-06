class Parent {
	public void display()
	{
		System.out.println("Parent Class Method");
	}
}

class Child extends Parent {
	@Override
	public void display()
	{
		System.out.println("Child Class Method");
	}
	public void displayChild()
	{
		System.out.println("Unique Child's Method");
	}
}

public class CastingConcept {

	public static void main(String[] args) {
		//Upcasting
		Parent parent = new Child();
		parent.display();
		//parent.displayChild(); // error
		
		//downcasting
		//Child child = new Parent(); // compile time error
		Child child = (Child)parent;
		child.displayChild();
		
		//int x = (int)56.78f;
		
		//upcasting: Parent to Child (access parent class)
		//downcasting: Child to Parent (access child class) 
		
		
	}

}
