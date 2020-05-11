package ExceptionHandling;

public class NoReturnStatmentInFinallyBlock
{
	public static String main()
	{
		try
		{
			return "In try";
		}
		catch (Exception e) 
		{
			System.out.println("In catch");
			return "In catch";
		}
		finally 
		{
			System.out.println("In finally");
		}
	}
	
	public static void main(String[] args)
	{
		System.out.println(main());
		
		//OP is "in finally" then "In try"
	}
}
