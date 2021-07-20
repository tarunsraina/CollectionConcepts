package CollectionsPractice;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class FrequencyOfAlphabet {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.next();
		char[] chArray=new char[20];
		for(int i=0;i<str.length();i++)
		{
			chArray[i]=str.charAt(i);
		}
		Hashtable ht=new Hashtable();
		for(int i=0;i<str.length();i++)
		{
			if(ht.containsKey(chArray[i]))
			{
				int v=(int) ht.get(chArray[i]);
				ht.put(chArray[i],v+1);
			}
			else
			{
				ht.put(chArray[i],1);
			}
		}
		
		//System.out.println(ht);
		
		Enumeration<Integer> enumeration=ht.keys();
		
		int count=enumeration.nextElement();
		//System.out.println(count);
	
		
	}

}
