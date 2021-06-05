class Person {
	protected String name = "Brain Mentors";
}

class Student extends Person {
	public void print()
	{
		System.out.println(name);
	}
}

public class ProtectedKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student = new Student();
		student.print();		
	}
}
