package OOPSConceptPart2;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(USBank.min_bal);
		//USBank.min_bal = 200;//interface variable value can't be changed as it's final in nature
		HSBCBank usb = new HSBCBank();
		usb.debit();
		usb.transferMoney();
		usb.eduLoan();
		usb.carLoan();
		usb.credit();
	}

}
