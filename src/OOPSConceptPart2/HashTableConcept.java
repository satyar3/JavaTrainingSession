package OOPSConceptPart2;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable h = new Hashtable();
		h.put("A", "Test 1");
		h.put("B", "Test 2");
		h.put("C", "Test 3");
		h.put(3, 100);
		
		System.out.println(h.size());
		
		System.out.println(h.get("B"));
		System.out.println(h.get(3));
		
		//restrciting Hastablle key and value to integer
		Hashtable<Integer,Integer> h1 = new Hashtable<Integer,Integer>();
		Hashtable<Integer,String> h2 = new Hashtable<Integer,String>();
	}
}