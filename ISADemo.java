import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class C implements Serializable {
	
	int m;
	C()
	{
		m = 999;
		System.out.println("C cons call");
	}
}


class A implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int x;
	int y;
	C obj = new C();
	String name = new String("Ram");
	//transient - means that don't convert into byte and not uploaded on file too.
	transient int f;
	A()
	{
		x = 100;
		y = 200;
		f = 10000;
		System.out.println("A Cons Call");
	}
	
	void plus()
	{
		x++;
		y++;
		f++;
	}
	
}

class B extends A  //implements Serializable{
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int z;
	int gg;
	B()
	{
		gg = 2000;
		z = 300;
		System.out.println("B Cons Call");
	}
	
	void add()
	{
		z++;
	}
}




public class ISADemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		B obj = new B();
		obj.plus();
		obj.add();
		String path = "E://JavaOutput/test.txt";
		FileOutputStream fo = new FileOutputStream(path);
		ObjectOutputStream os = new ObjectOutputStream(fo);
		os.writeObject(obj);
		fo.close();
		os.close();
		System.out.println("Data Store");
		
		FileInputStream fi = new FileInputStream(path);
		ObjectInputStream oi = new ObjectInputStream(fi);
		B e = (B)oi.readObject();
		System.out.println(e.x+" "+e.y+" "+e.z+" "+e.f+" "+e.name+" "+e.obj.m+" "+e.gg);
		oi.close();
		fi.close();
		
	}

}
