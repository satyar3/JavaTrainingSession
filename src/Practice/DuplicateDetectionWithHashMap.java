package Practice;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateDetectionWithHashMap {

	public static void main(String[] args) {

		String[] arr = {"java" , "c", "c++", ".net", "java","c" ,"java"};
		
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		
		for(String str : arr)
		{
			Integer idx = hm.get(str);
			if(idx == null)
			{
				hm.put(str, 1);
			}
			else
			{
				hm.put(str, ++idx);
			}
		}
		
		//System.out.println(hm.entrySet());
		
		for(Entry<String, Integer> e1: hm.entrySet())
		{
			if(e1.getValue()>1)
			{
				System.out.println("Duplicat is : "+e1.getKey()+" and present for "+e1.getValue()+" times.");
			}
		}

	}

}
