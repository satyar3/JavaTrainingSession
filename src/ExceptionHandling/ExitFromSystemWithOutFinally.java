package ExceptionHandling;

public class ExitFromSystemWithOutFinally
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("In try before exit");
			System.exit(0);
			int a = 10/0;
			System.out.println("In try after exit");
		}
		catch (Exception e) 
		{
			System.out.println("In catch");
		}
		finally 
		{
			//This won't be executed as System.exit(0) is written before the exception code
			System.out.println("In finally");
		}
	}
}
