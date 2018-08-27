package Practice;

public class ChildOfSuperClass extends SuperClass{
	
	public ChildOfSuperClass()
	{
		super(89);	//Super method to call the parent class constructor
		super.a = 35;	//Super keyword to call the parent class variable
		super.b = 95;
	}

}
