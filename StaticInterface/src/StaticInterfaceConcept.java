interface Example {
	static void hello()
	{
		System.out.println("Interface's Static Method");
	}
	void overrideMethod();
}

class Demo implements Example {
	public void overrideMethod()
	{
		System.out.println("This is overridden method");
	}
}


public class StaticInterfaceConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo obj = new Demo();
		obj.overrideMethod();
		//obj.hello(); // not overridden and not implemented in class demo
		Example.hello();
	}
}
