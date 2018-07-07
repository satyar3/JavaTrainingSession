package OOPSConceptPart1;

public class FunctionsInJava {

	//program execution started
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FunctionsInJava fn = new FunctionsInJava();
		//object will be created because of the above line and fn is the reference of the object
		//after object creation, copy of all non static methods will be given to the object
		//to call non static methods, we need to create object
		
		fn.test1();
		System.out.println(fn.test2());
		System.out.println(fn.test3());
		System.out.println(fn.test4(4, 5));
		
		//main method is void and never returns a value
	}
	
	//non static methods
	
	//void means doesn't return any value
	public void test1() // no input and no output
	{
		System.out.println("test method");
	}
	
	//return type is int
	public int test2() // no input but int output
	{
		int a = 10;
		int b = 20;
		int c = a+b;
		
		System.out.println();
		return c;
	}
	
	public String test3()// no input but String output
	{
		System.out.println("test3 method");
		String s = "Selenium";
		
		return s;
	}
	
	public int test4(int a, int b) //a and b are input parameters or arguments
	{
		System.out.println("test4 method");
		int c = a+b;
		
		return c;
	}
}
