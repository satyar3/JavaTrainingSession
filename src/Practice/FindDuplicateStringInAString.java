package Practice;

import java.util.HashMap;

public class FindDuplicateStringInAString
{

	public static void main(String[] args)
	{

		String mainstr = "Helloworldabcde123HelloHelloHellohellohellohello323Hello";
		String findstr = "Hello";
		String newstr = mainstr.replaceAll("[Hello]", "");
		System.out.println(findstr+" "+((mainstr.length()-newstr.length())/findstr.length())+" times");
		
		
		HashMap<String, Integer> hm = new HashMap<>();
		
		

	}

}
