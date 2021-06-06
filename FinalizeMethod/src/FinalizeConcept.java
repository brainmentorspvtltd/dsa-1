
public class FinalizeConcept {

	public static void main(String[] args) {
		
		//Finalize is used to perform  clean up processing just before object is eligible for garbage collector.
		
		FinalizeConcept obj = new FinalizeConcept();
		obj = null;

		//Requesting to JVM to call Garbage Collector Method
		System.gc();
		System.out.println("Main End");
	}
	
	public void finalize()
	{
		System.out.println("Overridden Finalize Method");
	}
}
