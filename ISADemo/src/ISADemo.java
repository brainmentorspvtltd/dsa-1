class Person { //parent class
	private String name;
	
	public Person()
	{
		name = "Rahul";
	}
	
	public void printName()
	{
		System.out.println("Name of the Person is: "+name);
	}
	
	public void contNumber()
	{
		System.out.println("Contact number of person");
	}
}

class Student extends Person{ // student - child class
	private int id;
	
	public Student()
	{
		//super(); // parent default cons call (implicit Super call)
		id = 150;
	}
	
	public void printId()
	{
		System.out.println("Student id is: "+id);
	}
}

class Employee extends Person{ // student - child class
	private double salary;
	
	public Employee()
	{
		salary = 50000.0;
	}
	
	public void printId()
	{
		System.out.println("Salary of the Employee is: "+salary);
	}
	
	@Override //annotation
	public void contNumber()
	{
		System.out.println("Contact number of employee");
	}
}

public class ISADemo {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.printName();
		student.printId();
		student.contNumber();
		
		Employee employee = new Employee();
		employee.contNumber();	

	}

}
