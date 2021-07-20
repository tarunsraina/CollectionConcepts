package CollectionsPractice;

import java.util.LinkedList;
import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// Remove duplicates from sorted linked list
		int RepEle = 0;
		Scanner sc=new Scanner(System.in);
		LinkedList LL=new LinkedList();
		
		System.out.println("Enter the Size of linked list");
		int n=sc.nextInt();
		System.out.println("Enter "+n+" numbers in ascending order(Duplicates allowed)");
		for(int i=0;i<n;i++)
		{
			int input=sc.nextInt();
			LL.add(input);
		}
		
		System.out.println("Elements BEFORE removing duplicates");
		System.out.println(LL);
		
		for(int t=1;t<LL.size();t++)
		{
			if(LL.get(t-1)==LL.get(t))
			{
				RepEle=(int)LL.get(t);
				LL.remove(RepEle);
			}
		
		}
		System.out.println("Elements AFTER removing duplicates");
		System.out.println(LL);
		
		

	}

}
