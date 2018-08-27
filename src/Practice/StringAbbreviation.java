package Practice;

public class StringAbbreviation {

	public static void main(String[] args) {

		String str = "Satya Ranjan";
		String[] arr = str.split(" ");
		
		String newstring = "";
		
		arr[arr.length-1] = arr[arr.length-1].charAt(0)+".";
		
		for(int i = 0; i<arr.length; i++)
		{
			newstring = newstring+arr[i]+" ";
		}
		
		System.out.println(newstring);

	}

}
