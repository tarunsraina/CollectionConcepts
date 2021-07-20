package CollectionsPractice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MaxFrequency {
	
	
	static int max=Integer.MIN_VALUE;
	static char maxFreqAlphabet;

	public static void main(String[] args) {
		
		HashMap<Character,Integer> hm=new HashMap<>();
		String str="aabbaaabcdda";
		
		for(int i=0;i<str.length();i++)
		{
			if(hm.containsKey(str.charAt(i)))
			{
				int v=hm.get(str.charAt(i));
				hm.put(str.charAt(i),v+1);
			}
			else
			{
				hm.put(str.charAt(i),1);
			}
		}
		
		Set<Map.Entry<Character,Integer>> entries=hm.entrySet();
		for(Map.Entry<Character, Integer> entry:entries)
		{
			if(entry.getValue()>max)
			{
				maxFreqAlphabet=entry.getKey();
			}
		}
		System.out.println(maxFreqAlphabet);
		

	}

}
