package CollectionsPractice;

import java.util.HashSet;
import java.util.Scanner;

public class RepeatedLetters {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.next();
		
		HashSet hs=new HashSet();
		for(int i=0;i<str.length();i++)
		{
			hs.add(str.charAt(i));
		}
		//System.out.println(hs);
		if(hs.size()==str.length())
		{
			System.out.println("No repeated Letter");
		}
		else
		{
			System.out.println("Repeated Letter");
		}
	}

}
