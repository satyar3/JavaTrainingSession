package OOPSConceptPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x = "100";
		System.out.println(x+20);
		
		//Wrapper Class i.e. converting to Integer value from String
		//Integer, Double, Boolean are some of the wrapper class
		int  i = Integer.parseInt(x);
		int j = Integer.valueOf(x);		

		System.out.println(i);
		System.out.println(j);
		
		String s = "12.33";
		System.out.println(Double.valueOf(s));
		System.out.println(Double.parseDouble(s));
		
		String k = "true";
		System.out.println(Boolean.parseBoolean(k));
		
		//Integer to String conversion
		
		int f = 100;
		String f1 = String.valueOf(k);
		
		String s1 = "100A";
		//System.out.println(Integer.parseUnsignedInt(s1));
	}

}
