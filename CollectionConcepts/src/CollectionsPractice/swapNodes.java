package CollectionsPractice;

import java.util.LinkedList;
import java.util.Scanner;

public class swapNodes {

	public static void main(String[] args) {
		
		System.out.println("enter size of Linked list");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		LinkedList<Integer> list=new LinkedList<>();
		for(int i=0;i<=n;i++)
		{
			list.add(sc.nextInt());
		}
		System.out.println("Liked list before "+list);
		sc.close();

		
		for(int i=1;i<=n;i++)
		{
			int temp=(int)list.get(i);
			list.remove(i-1);
			list.add(i-1,temp);
			
			int temp1=(int)list.get(i-1);
			list.remove(i);
			list.add(i,temp1);
			
			
		}
		
		
		System.out.println("Linked list after "+list);
		

	}

}
