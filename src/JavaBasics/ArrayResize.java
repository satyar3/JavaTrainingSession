package JavaBasics;

public class ArrayResize
{	
	int temp = 0;

	public static void main(String[] args)
	{
		int a[] = new int[2];
		int arrlen = a.length;
		a = new int[arrlen+3];
		System.out.println(a.length);		
	}	
}
