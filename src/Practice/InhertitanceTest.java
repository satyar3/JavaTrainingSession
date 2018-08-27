package Practice;

public class InhertitanceTest
{
	String name;
	int age;
	InhertitanceTest(String name, int age)
	{
		//super(); This will call the default constructor of the parent class i.e Object class
		//execution of non static block;
		this.name = name;
		this.age = age;
	}
	{
		System.out.println(this.name+" "+this.age);
		System.out.println("parent");
	}
	static
	{
		System.out.println("parent static");
	}
}
