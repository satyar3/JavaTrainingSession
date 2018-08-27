package Practice;

public interface AbstractLawInterface {
	
	int interfacemandatorylaw = 34;
	
	void obeyLaw1();
	abstract void obeyLaw2();
	
	public static void obeyLaw() 
	{
		System.out.println("Obey law inside interface");
	}

}
