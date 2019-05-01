package OOPSConceptPart2;

public class EncapsulationConcept {
	
	//Encapsulation also called Data hiding
	//How to implement Encapsulation :
	//1. Make the instance variable as private, so that these variables can't be accessed from outside of class
	//2. create getter and setter to set the variables.
	
	//Private data variable
	private int ssn;
	private String name;
	private int empage;
	
	//public getter and setter method

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpage() {
		return empage;
	}

	public void setEmpage(int empage) {
		this.empage = empage;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EncapsulationConcept enp = new EncapsulationConcept();
		enp.setName("Tom");
		enp.setEmpage(28);
		enp.setSsn(123456);
		
		System.out.println(enp.getEmpage());
		System.out.println(enp.getSsn());
		System.out.println(enp.getName());
	}
}
