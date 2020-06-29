package ExceptionHandling;

public class ThrowKeyWordAndOutsideFinally
{
	public static void main(String[] args)
	{
		try
		{
			fun();
		}
		catch (RuntimeException e) 
		{
			System.out.println("Inside Runtime");
		}
		catch (Exception e)
		{
			System.out.println("Inside Exception");
		}
		finally
		{
			System.out.println("Inside finally");
		}
		
		System.out.println("Outside Exception handling");
	}
	
	public static void fun()
	{
		throw new RuntimeException();
	}
}
