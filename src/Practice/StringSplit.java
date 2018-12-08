package Practice;

public class StringSplit
{

	public static void main(String[] args)
	{
		String str = "        hello         world   java ";
		String[] arr = str.split(" ");
		
		//System.out.println(arr.length);		
		
		String newStr = "";
		
		for(int i = 0; i<arr.length; i++)
		{
			if(arr[i].length() == 0)
			{
				//Don't
			}
			else
			{
				System.out.println(arr[i]);
				
				if(i !=arr.length-1)
					newStr = newStr+arr[i]+" ";
				else
					newStr = newStr+arr[i]+".";
			}
		}
		
		System.out.println(newStr);
	}

}
