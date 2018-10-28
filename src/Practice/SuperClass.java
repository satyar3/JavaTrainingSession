package Practice;

public class SuperClass {
	
	int a;
	int b;
	
	SuperClass(int a)
	{
		this(34,95);	//This method
	}
	
	public SuperClass(int i, int j) 
	{
		System.out.println(i+" "+j);
	}

	void sum(int a, int b)
	{
		this.a = a;	//This Keyword
		this.b = b;
	}

}
