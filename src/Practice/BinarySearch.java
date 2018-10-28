package Practice;

public class BinarySearch
{
	public static void main(String[] args)
	{
		int[] arr =
		{ 2, 5, 7, 9, 12, 15 };
		int val = 11;
		binSearch(arr, val);
	}

	public static void binSearch(int[] arr, int val)
	{
		int startIdx = 0;
		int endIdx = arr.length - 1;

		int mid = arr.length / 2;

		while (startIdx <= endIdx)
		{
			if (arr[mid - 1] < val)
			{
				startIdx = mid + 1;
			}
			else if (arr[mid - 1] > val)
			{
				endIdx = mid - 1;

			}
			else
			{
				System.out.println(mid + "---> " + arr[mid]);
				break;
			}

			mid = (startIdx + endIdx) / 2;
		}

		if (startIdx > endIdx)
			System.out.println("No match");
	}
}
