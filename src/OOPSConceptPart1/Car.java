package OOPSConceptPart1;

public class Car {

	//Two class variable or global variable
	String model;
	int wheel;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Car a = new Car(); //right hand side is called object and a is called object reference variable
		Car b = new Car();
		Car c = new Car();
		
		a.model = "BMW-X1";
		a.wheel = 4;
		
		b.model = "Audi-Q8";
		b.wheel = 5;
		
		c.model	= "Mercedes-1";
		c.wheel = 3;
		
		//before assigning
		
		System.out.println(a.model);
		System.out.println(a.wheel);
		
		System.out.println(b.model);
		System.out.println(b.wheel);
		
		System.out.println(c.model);
		System.out.println(c.wheel);
		
		//after assigning
		System.out.println("after assigning");
		
		//called shifting the object references
		
		a = b;
		b = c;
		c = a;
		
		System.out.println(a.model);
		System.out.println(a.wheel);
		
		System.out.println(b.model);
		System.out.println(b.wheel);
		
		System.out.println(c.model);
		System.out.println(c.wheel);
		
		a.model = "test";
		System.out.println(a.model);
		c.model = "test1";
		System.out.println(a.model);
	}	
}
