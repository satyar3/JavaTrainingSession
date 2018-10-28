package Practice;

import java.util.Arrays;

public class Triplets
{
	public static void main(String[] args)
	{
		int[] arr = { 1, 3, 4, 7, 5 };
		Arrays.sort(arr);
		int gap = 0;
		int[] newArr = new int[3];
		int sum = 9;

		int idx = 0;

		for (int i = 0; i < arr.length - 2; i++)
		{
			if (arr[i] + arr[i + 1] < sum)
			{
				gap = sum - (arr[i] + arr[i + 1]);

				idx = i + 2;

				if (gap > arr[idx])
				{
					while (idx < arr.length)
					{
						if(gap > arr[idx])
						{
							newArr[0] = arr[i];
							newArr[1] = arr[i + 1];
							newArr[2] = arr[idx];

							System.out.println(newArr[0] + "," + newArr[1] + "," + newArr[2]);
						}
						else
							break;

						idx++;
					}
				}
			}
		}

	}
}
