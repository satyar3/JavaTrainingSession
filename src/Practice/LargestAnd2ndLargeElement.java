package Practice;

import java.util.Arrays;

public class LargestAnd2ndLargeElement {
	
	public static void main(String...args)
	{
		int[] arr = {1,2,9,400,6,10};
		
		Arrays.sort(arr);
		
		int tempmax2 = arr[arr.length-1];
		int temp2ndmax2 = arr[arr.length-2];
		
		System.out.println(tempmax2);
		System.out.println(temp2ndmax2);
		
		int tempmax = 0;
		int temp2ndmax = 0;
		
		for(int i = 0; i<arr.length; i++)
		{
			if(tempmax < arr[i])
			{
				tempmax = arr[i];
			}			
		}
		
		for(int i = 0; i<arr.length; i++)
		{
			
			if(temp2ndmax < arr[i] && arr[i] < tempmax)
			{
				temp2ndmax = arr[i];
			}
		}
		
		System.out.println("Max Number is : "+tempmax);
		System.out.println("Max Number is : "+temp2ndmax);
	}

}
