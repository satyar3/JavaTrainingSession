package Practice;

public class WellsfargoChild extends WellsfargoParent
{
	protected int a=3;
	
	void print()
	{
		System.out.println(super.a);
	}
	
	public static void main(String[] args)
	{
		WellsfargoChild wc = new WellsfargoChild();
		wc.print();
	}
}
