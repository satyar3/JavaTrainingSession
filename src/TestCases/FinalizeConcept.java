package TestCases;

public class FinalizeConcept {
	
	//finalize is method
	public void finalize()
	{
		System.out.println("finalize method");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		FinalizeConcept f1 = new FinalizeConcept();
		FinalizeConcept f2 = new FinalizeConcept();
		
		f1 = null;
		f2 = null;
		
		//before garbage collection finalize() will be called automatically to clean up processing of object
		//calling the garbage collector
		System.gc();
	}
}
