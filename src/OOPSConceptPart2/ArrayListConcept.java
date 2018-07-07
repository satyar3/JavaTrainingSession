package OOPSConceptPart2;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList ar = new ArrayList();
		
		ar.add(100);
		ar.add(200);
		ar.add(300);
		
		//System.out.println(ar.size());
		
		ar.add("hello");
		ar.add(12.33);
		
		ar.remove(2);
		
		//System.out.println(ar.get(3));
		
		for (int i = 0; i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		
		//to restrict ArrayList only to one data type
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		//ar1.add("Hello");
		ar1.add(1);
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Hello");
		
	}

}
