package Practice;

public class PalindromeNumber
{

	public static void main(String[] args)
	{
		isPalindromeNum(151);

	}
	
	public static void isPalindromeNum(int num)
	{
		int original = num;
		int temp = 0;
		int rem = 0;
		while(num > 0)
		{
			rem = num%10;
			num = num/10;
			temp = temp*10+rem;
		}
		
		//System.out.println(temp);
		
		if(original == temp)
			System.out.println(original+" is palindrome");
		else
			System.out.println(original+" is not palindrome");
	}

}
