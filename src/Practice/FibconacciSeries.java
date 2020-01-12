package Practice;

import java.util.HashMap;

public class FibconacciSeries
{

	public static void main(String[] args)
	{
		//int pos = 4;
		//System.out.println(fibSeries1(pos));
		//fibSeries2(pos);
		
		int maxnum = 13;
		fibSeries3(maxnum);
		//System.out.println(fibSeries4(maxnum));
		
	}
	
	//Recursive Function
	public static int fibSeries1(int pos)
	{
		if(pos > 2)
		{
			return fibSeries1(pos-1)+fibSeries1(pos-2);
		}
		else
		{
			return 1;
		}
	}
	
	//Bottom-up Approach
	public static void fibSeries2(int pos)
	{
		HashMap<Integer,Integer> series = new HashMap<>();
		series.put(1, 1);
		series.put(2, 1);
		for(int i =3; i<=pos;i++)
		{
			series.put(i, series.get(i-1)+series.get(i-2));
		}
		System.out.println(series.get(pos));
	}
	
	
	public static void fibSeries3(int maxnum)
	{
		int first = 0;
		int second = 1;
		int next = 0;
		
		while(next < maxnum)
		{
			next = first+second;
			
			first = second;
			second = next;
			
			System.out.println(next);
		}		
	}
	
	
}
