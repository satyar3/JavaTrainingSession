package OOPSConceptPart1;

public class StaticAndNonStaticConcept {

	//global variable and it's available across all the functions with some conditions
	String name = "Tom";//non static global variable
	static int age = 25;//static global variable
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//how to call static methods and variables
		//1. direct call
		sum();
		System.out.println(age);
		
		//2.calling by class name
		StaticAndNonStaticConcept.sum();
		System.out.println(StaticAndNonStaticConcept.age);
		
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		obj.sendMail();
		System.out.println(obj.name);
		
		//static members can be accessed using object but warning will be given i.e to access in a static way 
		
	}

	public void sendMail()//non-static method
	{
		System.out.println("Send mailMethod");
	}
	public static void sum()//static method
	{
		System.out.println("sum method");
	}
}
