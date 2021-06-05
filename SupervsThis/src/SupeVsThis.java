class A {
	int x; // instance variable
	A() {
		System.out.println("A default cons call");
	}
	A(int x)
	{
		this();
		this.x = x;
		System.out.println("A Param cons call: "+x);
	}
}

class B extends A {
	int x;
	B()
	{	
		//super();
		super(100);
		System.out.println("B default cons call");
	}
	B(int x)
	{
		//super();
		//super(200);
		this();
		this.x = x; //instance variable = local variable
		System.out.println("B param cons call: "+x);
	}	
}


public class SupeVsThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B obj = new B(99);
	}
}
