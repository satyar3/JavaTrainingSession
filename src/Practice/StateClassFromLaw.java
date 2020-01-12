package Practice;

public class StateClassFromLaw extends AbstractLawClass implements AbstractLawInterface{

	public static void main(String[] args) {

		//AbstractLawClass obj = new AbstractLawClass();
		numberofOptionalLaw = 30;
		System.out.println(numberofOptionalLaw);
		new StateClassFromLaw().mandatoryLaw();
		new StateClassFromLaw().obeyLaw1();
		AbstractLawInterface.obeyLaw();
	}

	@Override
	public void mandatoryLaw() {
		// TODO Auto-generated method stub
		System.out.println("class mandatoryLaw obeyed");
	}

	@Override
	public void obeyLaw1() {
		// TODO Auto-generated method stub
		System.out.println("Interface mandatoryLaw obeyed");
	}

	@Override
	public void obeyLaw2()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void obeyLaw3()
	{
		// TODO Auto-generated method stub
		
	}

}
