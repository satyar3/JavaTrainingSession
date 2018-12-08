package Practice;

class ClassOne
{
	{
		s = "second";
	}

	String s = "first";
	{
		System.out.println(s);
		s = "third";
	}

	public ClassOne()
	{
		System.out.println(s);
	}

	public ClassOne(String s)
	{
		System.out.println(s);
		this.s = s;
	}
}

public class ExecutionFlow
{
	public static void main(String[] args)

		{
			ClassOne one = new ClassOne("last");
			ClassOne two = new ClassOne();
		}
}
