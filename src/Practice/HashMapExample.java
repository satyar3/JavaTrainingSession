package Practice;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String[] args) {

		
		HashMap<Integer, String> hm = new HashMap<Integer,String>();
		
		hm.put(1, "one");
		hm.put(2,"two");
		hm.put(3,"three");
		hm.put(4,"four");
		hm.put(5,"five");
		hm.put(5, "five new");
		
		
		
		for(Entry<Integer,String> e : hm.entrySet())
		{
			int key = e.getKey();
			String val = e.getValue();
			
			//System.out.println("Key : "+key+" , "+"Value : "+val);
		}
		
		HashMapUserDefinedDataClass hc1 = new HashMapUserDefinedDataClass(11, "abc");
		//hc1.putData(11, "abc");
		//hc1.putData(12, "def");
		//hc1.putData(13, "xyz");

		HashMapUserDefinedDataClass hc2 = new HashMapUserDefinedDataClass(21, "def");
		//hc2.putData(21, "abc");
		//hc2.putData(22, "def");
		//hc2.putData(23, "xyz");
		
		HashMapUserDefinedDataClass hc3 = new HashMapUserDefinedDataClass(31, "xyz");
		//hc3.putData(31, "abc");
		//hc3.putData(32, "def");
		//hc3.putData(33, "xyz");
		
		HashMap<Integer, HashMapUserDefinedDataClass> hm2 = new HashMap<Integer, HashMapUserDefinedDataClass>();
		hm2.put(90, hc1);
		hm2.put(91, hc2);
		hm2.put(92, hc3);
		
		HashMap<Integer, HashMapUserDefinedDataClass> hm3 = new HashMap<Integer, HashMapUserDefinedDataClass>();
		hm3.put(90, hc1);
		hm3.put(91, hc2);
		hm3.put(92, hc3);
		//hm3.get(key);
		
		HashMap<Integer, HashMapUserDefinedDataClass> hm4 = new HashMap<Integer, HashMapUserDefinedDataClass>();
		hm4.putAll(hm3);
		
		for(Entry<Integer, HashMapUserDefinedDataClass> e: hm2.entrySet())
		{
			int key = e.getKey();
			HashMapUserDefinedDataClass val = e.getValue();
			
			System.out.println("Key is: "+key+" , "+"Value is : "+val.ename+" & "+val.num);
		}
		
		System.out.println("*************************************");
		for(Integer e: hm2.keySet())
		{
			int key = e.intValue();
			//HashMapUserDefinedDataClass val = e.getValue();
			
			System.out.println("Key is: "+key);
		}
	}
}