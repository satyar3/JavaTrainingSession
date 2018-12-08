package JavaBasics;

public class TwoDArray
{

	public static void main(String[] args)
	{
		Object[][] obj1 = new Object[2][1];
		
		obj1[0] = new Object[] {3};
		System.out.println(obj1.length);
		
		Object[][] obj2 = {{2,3},{2,3,4},{2,3,4,5}};
		System.out.println(obj2.length);
		System.out.println(obj2[0].length);
		System.out.println(obj2[1].length);
		System.out.println(obj2[2].length);
		
	}
}
	
