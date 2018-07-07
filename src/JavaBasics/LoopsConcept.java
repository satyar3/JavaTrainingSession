package JavaBasics;

public class LoopsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. while loop
		//it'll generate infinite loop if no incremental or decremental part
		
		int i = 1;
		while(i<=10)
		{
			System.out.println(i);
			i++;
			//System.out.println(i++);//2
			//System.out.println(++i);//4
		}
		
		//for loop
		
		for( int j = 1;j<=10;j++) //initialization, conditional, incremental
		{
			System.out.println(j);
		}
		
		for(int j = 10;j>=1;j--)
		{
			System.out.println(j);
		}
		
	}

}
