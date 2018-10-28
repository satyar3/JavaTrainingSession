package Practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindSpecialCharacterInaGivenString
{
	public static void main(String[] args)
	{

		String s = "84632*&^*vkv(*)*)";
		char a = s.charAt(5);
		Pattern p = Pattern.compile("[^A-Za-z0-9]");
		Matcher m = p.matcher(String.valueOf(a));
		// boolean b = m.matches();
		boolean b = m.find();
		if (b == true)
			System.out.println("There is a special character in my string ");
		else
			System.out.println("There is no special char.");

	}
}
