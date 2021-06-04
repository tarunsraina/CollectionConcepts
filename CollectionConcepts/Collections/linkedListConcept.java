package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class linkedListConcept {

	public static void main(String[] args) {
		//duplicates allowed,insertion order is preserved.
		//when to use linked list and when to use array list.
		//if retrieving is the frequent operation ,then go for array list.
		//if frequent operation is insertion or deletion,then go for linked list.
		
		//Declaring Linked List
		LinkedList LL=new LinkedList();
		LL.add("tarun");   //addind at the end of LL
		LL.add("teja");
		LL.add(1,"varun");  //adding at the specific index
		
		
		ArrayList AL=new ArrayList();
		for(int i=0;i<10;i++)
		{
			AL.add(i);
		}
		
		LL.addAll(AL);  //adding the arrayList to LinkedList
		System.out.println(LL);
		
		LL.remove("varun"); //removing object
		System.out.println(LL);
		
		LL.remove(10);  //removing element at specific index(10 in this case)
		System.out.println(LL);
		
		//LL.removeAll(AL);  //removing all the arraylist elements that were added
		System.out.println(LL);
		
		//LL.removeAll(LL);   //removes all elements in the linked list
		System.out.println(LL);
		
		
		System.out.println(LL.get(5));  //get the element at index 5
		
		//setting the element at specific index
		LL.set(0,"Begin");
		// [tarun, teja, 0, 1, 2, 3, 4, 5, 6, 7, 9]---->before
		// [Begin, teja, 0, 1, 2, 3, 4, 5, 6, 7, 9]---->after
		
		LL.addFirst("hello");
		// [Begin, teja, 0, 1, 2, 3, 4, 5, 6, 7, 9]---->before
		// [hello, Begin, teja, 0, 1, 2, 3, 4, 5, 6, 7, 9]---->After
		
		LL.addLast("BYE");
		// [hello, Begin, teja, 0, 1, 2, 3, 4, 5, 6, 7, 9]---->Before
		// [hello, Begin, teja, 0, 1, 2, 3, 4, 5, 6, 7, 9, BYE]-->After
		
		System.out.println(LL);
		
		LL.removeFirst(); //remove first element in LL
		LL.removeLast();  //remove last element in LL
		
		
		
		
		System.out.println(LL.getFirst()); //prints first element in LL
		System.out.println(LL.getLast()); //prints last element in LL
		
		LL.removeAll(AL);
		Collections.sort(LL);  //sort
		System.out.println(LL);
		
		Collections.sort(LL,Collections.reverseOrder());
		System.out.println(LL); //reverse sort
		
		Collections.shuffle(LL);
		System.out.println(LL);
		
		System.out.println(LL.size());  //returns the size of linked list
	}

}
