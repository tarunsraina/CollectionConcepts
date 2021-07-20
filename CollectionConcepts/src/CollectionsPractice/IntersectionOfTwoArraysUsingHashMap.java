package CollectionsPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class IntersectionOfTwoArraysUsingHashMap {
	
	static ArrayList<Integer> Inter=new ArrayList<>();
	
	public static void main(String args[])
	{
		int a1[]= {5,1,3,4,7};
		int a2[]= {2,4,3,5,7,10,15};
		
		HashMap<Integer,Boolean> hm=new HashMap<>();
		
		for(int i=0;i<=a1.length-1;i++)
		{
			hm.put(a1[i],false);
		}
		
		
		for(int i=0;i<=a2.length-1;i++)
		{
			if(hm.containsKey(a2[i]))
			{
				hm.put(a2[i],true);
			}
		}
		
		
		for(Map.Entry<Integer,Boolean> entries:hm.entrySet())
		{
			if(entries.getValue()==true)
			{
				Inter.add(entries.getKey());
			}
		}
		
		System.out.println("Intersecting elements between two arrays are:");
		System.out.println(Inter);
		
		
	}

}
