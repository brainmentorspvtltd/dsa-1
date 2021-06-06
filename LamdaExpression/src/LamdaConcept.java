/*interface Printable {
	public void print();
}*/

@FunctionalInterface //(It is optional)
interface Add{
	int add(int a, int b);
}

public class LamdaConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Lambda Expression- 1. It provides functional interface
		 * 					  2. It provides less coding syntax
		 * 
		*/
		
		//without Lambda. Printable implementation using anonymous class
		/*
		Printable p = new Printable() {
			
			public void print( ) {
				System.out.println("This is print method of interface");
			}
		};
		*/
		
		//With Lambda- Arrow Token- No parameter in Lambda Expression
		
		/*
		Printable p = ()-> {
			System.out.println("Printable");
		};
		
		p.print();
		*/
		
		//Multiple Parameters example of Lambda Expression
		//Add add = (a, b)->(a + b);
		Add add = (int a, int b)->(a + b);
		System.out.println(add.add(10, 20));
		
	}
}
