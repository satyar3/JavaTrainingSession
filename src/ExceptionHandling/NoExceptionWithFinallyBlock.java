package ExceptionHandling;

public class NoExceptionWithFinallyBlock
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("In try before exit");
			int a = 10/2;
			System.out.println(a);
		}
		catch (Exception e) 
		{
			System.out.println("In catch");
		}
		finally 
		{
			System.out.println("In finally");
		}
	}
}
