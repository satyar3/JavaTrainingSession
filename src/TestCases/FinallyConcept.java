package TestCases;

public class FinallyConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		//test2();
		div();
	}
	
	public static void test1()
	{
		try
		{
			System.out.println("inside test1 method");
			throw new RuntimeException("test");
		}
		catch(Exception e)
		{
			System.out.println("inside in catch block");
		}
		
		//finally block always associated with try catch block
		//once the control is back to it's original position, then finally block will be executed
		
		finally
		{
			System.out.println("inside finally block");
		}
	}
	
	public static void test2()
	{
		try
		{
			System.out.println("inside test2");
		}
		finally
		{
			System.out.println("inside fianlly code in test2");
		}
	}
	
	public static void div()
	{
		int i = 10;
		try
		{
			System.out.println("inside try block div method");
			int k = i/0;
		}
		/*catch(ArithmeticException e)
		{
			System.out.println("insode catch block");
			System.out.println("dive by 0 error");
		}*/
		catch(NullPointerException e)
		{
			System.out.println("insode catch block");
			System.out.println("dive by 0 error");
		}
		//finally is block
		finally
		{
			System.out.println("execute the code even if after excpetion");
		}
	}

}
