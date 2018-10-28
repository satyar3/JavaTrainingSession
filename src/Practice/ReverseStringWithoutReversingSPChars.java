package Practice;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReverseStringWithoutReversingSPChars
{
	public static void main(String[] args)
	{
		String str = "abc,&*d^*%i";
		System.out.println(str);
		StringBuffer sb = new StringBuffer(str);
		int startIdx = 0;
		int endidx = str.length()-1;
		char temp1 = 0;
		char temp2 = 0;
		
		while(startIdx < endidx )
		{
			
			while(checkSpecialChar(str,startIdx) == true)
			{
				startIdx =startIdx+1;
			}
			
	
			while(checkSpecialChar(str,endidx) == true)
			{
				endidx =endidx-1;
			}
			
		
			temp1 = sb.charAt(endidx);
			temp2 = sb.charAt(startIdx);
			sb.setCharAt(startIdx, temp1);
			sb.setCharAt(endidx, temp2);
			//System.out.println(sb);
			
			startIdx++;
			endidx--;
			
		}
		
		System.out.println(sb);
	}
	
	public static boolean checkSpecialChar(String str, int idx)
	{
		Pattern p = Pattern.compile("[^A-Za-z0-9]");
		Matcher m = p.matcher(String.valueOf(str.charAt(idx)));
		boolean b = m.find();
		return b;
	}
}
