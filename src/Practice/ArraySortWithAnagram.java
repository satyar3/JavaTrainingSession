package Practice;

import java.util.Arrays;

public class ArraySortWithAnagram {

	public static void main(String[] args) 
	{

		String init1 = "army";
		String init2 = "mary";

		boolean flag = validateAndPerform(init1, init2);
		
		if(flag == false)
		{
			System.out.println("Not Anagram");
		}
		else
		{
			System.out.println("Anagram");
		}			
		
		simpleAnagramValidation(init1,init2);
		
	}

	public static boolean validateAndPerform(String init1, String init2) 
	{
		char[] initchar1 = sortArray(init1);
		char[] initchar2 = sortArray(init2);
		boolean flag = true;

		if (initchar1.length == initchar2.length) 
		{
			for (int i = 0; i < initchar1.length; i++) 
			{
				if (!((Object) initchar1[i]).equals((Object) initchar2[i])) 
				{
					flag = false;
					break;
				}
			}
			
			return flag;
		}
		else
		{
			return false;
		}
	}

	public static char[] sortArray(String init) 
	{
		char[] initchar = new char[init.length()];
		for (int i = 0; i < init.length(); i++) 
		{
			initchar[i] = init.charAt(i);
		}

		Arrays.sort(initchar);
		return initchar;
	}
	
	public static void simpleAnagramValidation(String init1, String init2)
	{
		
		char[] a = init1.toCharArray();
		char[] b = init2.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		//System.out.println(a[0]);
		//System.out.println(a);
		//System.out.println(b);
		System.out.println(Arrays.equals(a, b));		
	}

}
