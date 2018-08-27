package TestCases;

import java.util.HashSet;

public class PreventDuplicateAddition {
	
	public static void main(String...args)
	{
		String[] a = {"java","python","c#","java"};
		
		HashSet<String> hs = new HashSet<String>();
		
		for(int i = 0; i<a.length;i++)
		{
			if(hs.add(a[i]) == false)
			{
				System.out.println("duplicate"+a[i]+i);
			}
		}
	
		//System.out.println(hs.size());
	}

}
