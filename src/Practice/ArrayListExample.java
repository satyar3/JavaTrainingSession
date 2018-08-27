package Practice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
	
	public static void main(String...args)
	{
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(1);
		ar1.add(2);
		ar1.add(3);
		
		System.out.println(ar1);
		System.out.println(ar1.size());
		
		for(int i = 0; i<ar1.size(); i++)
		{
			System.out.println(ar1.get(i));
		}
		
		for(int i : ar1)
		{
			System.out.println(i);
		}
		
		Iterator it = ar1.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
