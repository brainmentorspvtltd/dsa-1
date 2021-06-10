import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	private int id;
	private String name;
	private double salary;
	
	Employee()
	{
		id = 1001;
		name = "Ram";
		salary = 9999;
		System.out.println("Employee Default Cons");
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	Employee(int id, String name, double salary)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
		System.out.println("Employee Param Cons");
		
	}
}

public class ObjectReadWrite {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		//Serialization
		String path = "E://JavaOutput/emp.txt";
		Employee shyam = new Employee(1002, "Shyam", 2222);
		FileOutputStream fo = new FileOutputStream(path);
		ObjectOutputStream os = new ObjectOutputStream(fo);
		os.writeObject(shyam);
		os.close();
		fo.close();
		System.out.println("Object Write Demo");
		
		//Deserialization
		FileInputStream fs = new FileInputStream(path);
		ObjectInputStream oi = new ObjectInputStream(fs);
		Employee e = (Employee)oi.readObject();
		System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary());
		oi.close();
		fs.close();
		
	}
}
