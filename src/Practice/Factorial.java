package Practice;

public class Factorial
{

	public static void main(String[] args)
	{
		System.out.println(factorial(5));

	}
	
	public static int factorial(int n)
	{
		if(n>=2)
			return n*factorial(n-1);
		else
			return 1;
	}

}
