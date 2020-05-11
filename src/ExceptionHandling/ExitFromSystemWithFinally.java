package ExceptionHandling;

public class ExitFromSystemWithFinally
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("In try before exit");
			int a = 10/0;
			System.exit(0);
			System.out.println("In try after exit");
		}
		catch (Exception e) 
		{
			System.out.println("In catch");
		}
		finally 
		{
			//This will be executed as SYstem.exit(0) is written after the exception code
			System.out.println("In finally");
		}
	}
}
