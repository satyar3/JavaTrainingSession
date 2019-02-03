package Practice;

public class FindPrimeNumber
{

	public static void main(String[] args)
	{
		int num = -6;
		FindPrimeNumber.isPrime(num);
		
		int range = 20;
		
		for(int i = 2;i<=range;i++)
		{
			isPrime(i);
		}
		
//		int rem = 0;
//		int count = 0;
//		int i = 2;
		
//		while(count <= 1)
//		{
//			rem = num%i;
//			if(rem == 0)
//				count++;
//			//System.out.println(count);
//			i++;
//			if(i>num)
//				break;
//		}
		
//		for(int j = 2;j<=num;j++)
//		{
//			rem = num%j;
//			if(rem == 0)
//				count++;
//		}
//		
//		if(count>1)
//			System.out.println("Not prime");
//		else
//			System.out.println("Prime");
//
	}
	
	public static void isPrime(int num)
	{
		int rem = 0;
		int count = 0;
		
		for(int j = 2;j<=num;j++)
		{
			rem = num%j;
			if(rem == 0)
				count++;
		}
		
		if(count> 0 && count <2)
			System.out.println(num+ " is prime");
		else
			System.out.println(num+" is Not Prime");
	}

}
