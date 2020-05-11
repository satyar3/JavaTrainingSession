package ExceptionHandling;

public class ReturnStatmentInFinallyBlock
{
	public static String main()
	{
		try
		{
			return "In try";
		}
		catch (Exception e) 
		{
			return "In catch";
		}
		finally 
		{
			return "In finally";
		}
	}
	
	public static void main(String[] args)
	{
		System.out.println(main());
		
		//OP is "In finally"
	}
}
