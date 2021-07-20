package CollectionsPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class SwapElements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> a1=new ArrayList<>();
		ArrayList<Integer> a2=new ArrayList<>();
		System.out.println("Enter n");
		int n=sc.nextInt();
		
		System.out.println("Enter values for ArrayList 1");
		for(int i=0;i<n;i++)
		{
			a1.add(sc.nextInt());
		}
		System.out.println("Enter values for ArrayList 2");
		for(int i=0;i<n;i++)
		{
			a2.add(sc.nextInt());
		}
		System.out.println("Enter the index to be swapped");
		int index=sc.nextInt();
		sc.close();
		if(index<0||index>n)
		{
			System.out.println("Cannot be swapped,try again!");
			System.exit(0);
		}
		else
		{
			int t1=(int)a1.get(index);
			int t2=(int)a2.get(index);
			a1.remove(index);
			a2.remove(index);
			a1.add(index,t2);
			a2.add(index,t1);
		}
		System.out.println(a1);
		System.out.println(a2);
		
	}

}
