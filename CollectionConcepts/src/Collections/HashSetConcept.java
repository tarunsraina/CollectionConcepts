package Collections;

import java.util.HashSet;

public class HashSetConcept {

	public static void main(String[] args) {
		// duplicates are not allowed
		// insertion order is not preserved
		// If frequent operation is searching,then use hashSet
		// randomly arranged,no concept of indexing
		// Heterogeneous data is supported[null allowed]
		
		// Declaring
		HashSet hs=new HashSet();  //initial size is 16
		
		/* Load factor is 0.75--->This means when the 75% of the present alloted size is filled,then the
		                        a new hashset of larger length will be created,and the old one will be
						  		eligible for garbage collection.
						  		
			In case of arraylist,a new array list is created once the old arraylist is completely filled.
						  		
		*/
		
		//parent is Set interface
		
		HashSet hs1=new HashSet(100);//here loadfactor is 0.75
		HashSet hs2=new HashSet(100,(float) 0.95);//our own load factor i.e., 0.95
		
		HashSet <Integer> hi=new HashSet <Integer>();
		
		hi.add(5);
		hi.add(25);
		hi.add(2885);
		hi.add(29);
		hi.add(95);
		hi.add(7895);
		hi.add(23225);
		hi.add(6);
		hi.add(6); //will not be added to hi,bcz duplicate not allowed.
		
		System.out.println(hi);   //  [5, 6, 25]
		hi.remove(5);
		//   hi.removeAll(AL);
		
		System.out.println(hi.contains(5));
		// containsAll
	
		System.out.println(hi.isEmpty());
		System.out.println(hi);
		
		// direct sort or shuffle not possible.
		//to sort,convert this hashset into array list and then sort it.

	}

}
