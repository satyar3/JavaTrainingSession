package Practice;

public class InhertitanceTest2 extends InhertitanceTest
{
	//Child()
	InhertitanceTest2(String name, int age)
	{
		super(name, age);
	}
	{
		System.out.println(this.name+" "+this.age);
		System.out.println(super.name+" "+super.age);
		System.out.println("child");
	}
	static
	{
		System.out.println("child static");
	}
}
