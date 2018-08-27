package OOPSConceptPart2;

public interface USBank {

		int min_bal = 100;
		/*public static void credit() {
			System.out.println("test");
		}*/
		
		public void credit();
		public void debit();
		public void transferMoney();
		
		//only method declaration i.e no method body or only method prototype
		//in interface we can declare the variables
		//by default variable will be public,static and final
		//no static methods in interface
		//variable value can not be changed
		//no main method
		//interface are abstract in nature i.e no object can't be created
}
