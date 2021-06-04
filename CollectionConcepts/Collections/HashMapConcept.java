package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapConcept {

	public static void main(String[] args) {
		// key-value pairs
		// ex:Emp_ID corresponding to Emp_names
		// map is independent interface,not a child Interface of Collection
	
		// Duplicate keys are not allowed,duplicate value is allowed.
		
		// underlying DS is HashTable
		// Insertion order is not preserved
		// Null key is allowed [only once]
		// Multiple null values are allowed
		// Searching is faster
		
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		
		hm.put(1,1);
		hm.put(2,4);
		hm.put(3,9);
	
		
		HashMap <Integer,Integer> hm1=new HashMap<Integer,Integer> ();
		hm1.put(4, 16);
		hm1.put(4,17);
		hm1.put(5, 25);
		hm1.put(null,null);

		
		hm.putAll(hm1); //Combining two maps into one
		System.out.println(hm);
		
		System.out.println(hm.get(3));//returns value associated with key 3 i.e.,9
		System.out.println(hm.remove(3));//removes pair with key 3
		
		System.out.println(hm.containsKey(2));
		System.out.println(hm.containsValue(4));
		System.out.println(hm.isEmpty());
		System.out.println(hm.size());
		//hm.clear();---->Clears every record

		System.out.println(hm.keySet()); //returns all the keys--> [1, 2, 4, 5]
		System.out.println(hm.values()); //returns all the values--> [1, 4, 16, 25]
		System.out.println(hm.entrySet());// [1=1, 2=4, 4=16, 5=25]
		
		
		//Entry is a interface within the HashMap interface
		
		for(Map.Entry entry:hm.entrySet())   
		{
			System.out.print(entry.getKey()+" ");
			System.out.print(entry.getValue()+" ");
		}
		
		
		Set s=hm.entrySet();
		Iterator it=s.iterator();
		while(it.hasNext())
		{
			Map.Entry entry=(Entry)it.next();
			System.out.print(entry.getKey());
			System.out.print(entry.getValue());
		}
		
		
		

	}

}
