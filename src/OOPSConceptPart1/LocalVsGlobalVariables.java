package OOPSConceptPart1;

public class LocalVsGlobalVariables {
	
	//Global variable or class variables
	String name = "Tom";
	int age = 25;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Local variable
		int i = 15;
		System.out.println(i);
		
		LocalVsGlobalVariables obj = new LocalVsGlobalVariables();		
		System.out.println(obj.age);

	}
	
	public void sum()
	{
		//Local Variable
		int i = 10;
		int j = 20;		
		int age = 25;
	}

}
