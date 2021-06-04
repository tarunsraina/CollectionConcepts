package CollectionsPractice;

import java.util.LinkedList;
import java.util.Scanner;

public class IdentifyPalindromeLL {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		LinkedList LL=new LinkedList(); //original linked list
		LinkedList LLfirst=new LinkedList(); //LL for storing first half
		LinkedList LLlast=new LinkedList(); //LL for storing second half
		
		//idea:store first half,reverse second half,if both are equal then it is a palindrome.
		
		System.out.println("Enter the Size of linked list");
		int n=sc.nextInt();
		System.out.println("Enter "+n+" numbers ");
		for(int i=0;i<n;i++)
		{
			int input=sc.nextInt();
			LL.add(input);
		}
		if(n%2==0)
		{
			//For even palindromes
			int mid=LL.size()/2;
			for(int t=0;t<mid;t++)
			{
				int v1=(int)LL.get(t);
				LLfirst.add(v1);
			}
			for(int u=mid;u<LL.size();u++)
			{
				int v2=(int)LL.get(u);
				LLlast.addFirst(v2);
			}
		
		}
		else
		{
			//For odd palindromes
			int mid=LL.size()/2;
			for(int t=0;t<mid;t++)
			{
				System.out.println();
				int v1=(int)LL.get(t);
				LLfirst.add(v1);
				
			}
			for(int u=mid+1;u<LL.size();u++)
			{
				int v2=(int)LL.get(u);
				LLlast.addFirst(v2);
			}	
		}
		if(LLlast.equals(LLfirst))
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Not Equal");
		}	
	}
}
	


