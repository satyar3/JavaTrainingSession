package Practice;

public class AbstractLawChildClass extends AbstractLawClass
{

	@Override
	public void mandatoryLaw()
	{
		System.out.println("mandatoryLaw implementted");
		
	}
	
	public AbstractLawChildClass()
	{
		System.out.println("AbstractLawClass Child");
	}
	
	public static void main(String[] args)
	{
		AbstractLawChildClass ach = new AbstractLawChildClass();
		System.out.println(numberofMandatoryLaw);
		System.out.println(numberofOptionalLaw);
	}
}
