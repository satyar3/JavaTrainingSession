package Practice;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromString
{

	public static void main(String[] args)
	{
		String str = "BETTER";
		char[] a = str.toCharArray();
		
		Set set = new HashSet();
		
		for(int i=0; i<a.length;i++ )
		{
			if(set.add(a[i])==false)
			{
				a[i] = '$';				
			}
		}

		String newStr =	"";
		for(int i=0; i<a.length;i++ )
		{
			newStr = newStr+a[i];
		}
		
		System.out.println(newStr.replaceAll("[^a-zA-Z]", ""));
	}

}
