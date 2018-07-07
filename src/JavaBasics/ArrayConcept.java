package JavaBasics;

public class ArrayConcept {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//to store similar data type variable in an array		
		//lowest index is 0 and the upper bound or index is n-1 where n is the size of array
		//1-dimenssional array
		
		//disadvantages of array
		//1. size is fixed - static array -- to overcome this problem, we use collections, like ArrayList, hasTable etc., also known as dynamic array
		//2. stores only similar data type values -- to overcome this problem, we use Object array.
		
		
		//one type to create array
		int[] i = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		//another type to create array
		int i1[] = {10,11,12,13};
		
		System.out.println(i[0]);
		System.out.println(i[1]);
		System.out.println(i[2]);
		System.out.println(i[3]);
		//System.out.println(i[4]); //ArrayIndexoutOfBound Excpetion
		
		System.out.println(i.length); //length of Array
		
		//print all the values of array
		for(int k = 0;k<4;k++)
		{
			System.out.println(i[k]);
		}
		
		//double array
		
		double d[] = new double[3];
		d[0] = 10.33;
		d[1] = 13.44;
		d[2] = 45.55;
		
		System.out.println(d[2]);
		
		//character array
		
		char c[] = new char[3];
		c[0] = 'a';
		c[1] = '2';
		c[2] = '$';
		
		//string array
		String s[] = new String[3];
		s[0] = "hello";
		s[1] = "world";
		s[2] = "test";
		
		System.out.println(s.length);
		
		//Object Array (Object is a call) -- is used to store different data type values
		Object obj[] = new Object[6];
		
		obj[0] = "Tom";
		obj[1] = 25;
		obj[2] = 12.33;
		obj[3] = 1/1/1990;
		obj[4] = "male";
		obj[5] = "London";
		
		System.out.println(obj[5]);
		System.out.println(obj.length);
		
		for(int objarray = 0; objarray<6 ; objarray++ )
		{
			System.out.println(obj[objarray]);
		}
		
	}

}
