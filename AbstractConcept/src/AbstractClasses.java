abstract class Person {
	private String name;
	private int age;
	
	public Person(String name, int age)
	{	
		this.name = name;
		this.age = age;
	}
	
	public void print()
	{
		System.out.println("Person Details: " + name + " " + age);
	}
	
	//abstract method- only declaration(no body)
	public abstract void contNumber();
}

class Student extends Person {
	private int id;
	
	public Student(int id)
	{
		super("Rahul", 25);
		this.id = id;
	}
	
	public void printId()
	{
		System.out.println("Student id is: "+id);
	}
	
	@Override
	public void contNumber()
	{
		System.out.println("Student's Contact Number");
	}
}


public class AbstractClasses {

	public static void main(String[] args) {
		
		Student student = new Student(100);
		student.contNumber();
		student.print();
		student.printId();
		
		//Person person = new Person(100); // error
		
	}
}
