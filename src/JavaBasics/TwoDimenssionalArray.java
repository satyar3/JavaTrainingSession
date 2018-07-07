package JavaBasics;

public class TwoDimenssionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x[][] = new String[3][5];
		System.out.println(x.length); //output is 3, it'll give total number of rows
		System.out.println(x[0].length); //output is 5, it'll give total number of columns
		
		x[0][0] = "Hello00";
		x[0][1] = "Hello01";
		x[0][2] = "Hello02";
		x[0][3] = "Hello03";
		x[0][4] = "Hello04";
		
		x[1][0] = "Hello10";
		x[1][1] = "Hello11";
		x[1][2] = "Hello12";
		x[1][3] = "Hello13";
		x[1][4] = "Hello14";
		
		x[2][0] = "Hello20";
		x[2][1] = "Hello21";
		x[2][2] = "Hello22";
		x[2][3] = "Hello23";
		x[2][4] = "Hello24";
		
		//to print all the values of 2D array we need to use 2 for loops
		
		for(int row = 0; row<3; row++)//outer loop
		{
			for(int col = 0; col<5; col++)//inner loop
			{
				System.out.print(x[row][col]);
			}
			System.out.println(" ");
		}
	}

}
