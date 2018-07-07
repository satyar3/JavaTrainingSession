package OOPSConceptPart2;

public class HSBCBank implements USBank, BrazilBank{
	//achieving multiple inheritance
	//Is-a relationship
	
	//if a class is implementing an interface then it's mandatory to override all the methods of interface
	
	
	//overriding from USBank
	@Override
	public void credit() {
		// TODO Auto-generated method stub
		System.out.println("HSBC credit");
	}
	
	@Override
	public void debit() {
		// TODO Auto-generated method stub
		System.out.println("HSBC debit");
	}

	@Override
	public void transferMoney() {
		// TODO Auto-generated method stub
		System.out.println("HSBC transfer money");
		
	}
	
	//Overriding from HSBC bank
	@Override	
	public void mutualFund()
	{
		System.out.println("mutual fund in HSBC");
	}
	
	//Own method of HSBC class
	public void eduLoan()
	{
		System.out.println("HSBC eduLoan");
	}
	
	public void carLoan()
	{
		System.out.println("HSBC car loan");
	}
}
