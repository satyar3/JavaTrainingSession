package OOPSConceptPart2;

public class BMW extends Car{ //has-a relationship
	
	
	//method overriding
	//when same class is present in both parent and child class with same name and same number of arguments
	public void start()
	{
		System.out.println("BMW auto start");
	}
	public void theftSafety()
	{
		System.out.println("BMW theft safety");
	}
	
}
