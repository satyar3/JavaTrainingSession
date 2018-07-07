package OOPSConceptPart2;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//compile time or static polymorphisoim (polymorphisim means one to may)
		//at the time of java will decide which method it need to call
		BMW b = new BMW();
		b.start(); //whenever the same method present in child and parent then child method will be given preference
		b.stop();
		b.refill();
		b.theftSafety();
		b.engine();
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refill();
		c.engine();
		
		//Top casting/up casting - runtime polymorphisim
		Car c1 = new BMW(); //child class object can be referred by parent class reference variable is called dynamic polymorphisim or runtime polymorphisim
		c1.start();//preference will always be give to child
		c1.stop();
		c1.refill();
		c1.engine();
		
		//Down casting i.e convering parent class to child class
		//BMW b1 = (BMW)new Car(); //run time exception i.e class caste exception
	}

}
