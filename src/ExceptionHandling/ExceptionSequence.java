package ExceptionHandling;

public class ExceptionSequence
{

	//Scenario - 1
	public static void main2(String[] args)
	{
		try
		{
			int a = 10 / 0;
		} 
		
		catch (Exception e)
		{

		} 
		
		// Unreachable code
		catch (ArithmeticException e)
		{
			
		}
	}

	//Scenario - 2
	public static void main3(String[] args)
	{
		try
		{
			int a = 10 / 0;
		} 
		catch (ArithmeticException e)
		{

		}
		//Reachable code
		catch (Exception e)
		{

		}
	}

	//Scenario - 3
	public static void main4(String[] args)
	{
		try
		{
			int a = 10 / 0;
		} catch (ArithmeticException e)
		{

		}

		catch (Exception e)
		{

		}
		//Reachable code
		catch (Throwable e)
		{

		}
	}

	//Scenario - 4
	public static void main5(String[] args)
	{
		try
		{
			int a = 10 / 0;
		} catch (ArithmeticException e)
		{

		}
		
		catch (Throwable e)
		{

		} 
		
		//UnReachable code
		catch (Exception e)
		{

		}

	}
}
