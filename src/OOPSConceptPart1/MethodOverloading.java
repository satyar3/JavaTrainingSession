package OOPSConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(10, 11);
	}
	
	//main method can be overloaded
	public static void main (int p)
	{
		
	}
	public static void main (int p, int q)
	{
		
	}
	
	//method overloading
	//when the method name is same with different arguments i.e with different data types within the same class
	//can't create a method inside a method
	//duplicate methods i.e. same name and same method number of arguments are not allowed
	
	public void sum()//0 input parameter
	{
		System.out.println("sum method with Zero parameter");
	}
	public void sum(double i)//0 input parameter
	{
		System.out.println("sum method with Zero parameter");
	}
	public void sum(int i)//1 input parameter
	{
		System.out.println("sum method with 1 input parameter"+i);
	}
	public void sum(int k, int l) //2 input parameters
	{
		System.out.println("sum method with 2 input parameters"+k+l);
	}

}
