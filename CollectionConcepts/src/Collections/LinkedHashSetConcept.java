package Collections;

import java.util.LinkedHashSet;

public class LinkedHashSetConcept {

	public static void main(String[] args) {
		// SAME AS HASHSET
		
		//only diffrence is
		
		//duplicates not allowed {same as hashset}
		// but,insertion order is preserved {opp of hashset}
		
		
		//Declaration
		LinkedHashSet <Integer> lset=new LinkedHashSet <Integer>();
		
		lset.add(2);
		lset.add(4);
		lset.add(6);
		lset.add(8);
		lset.add(10);
		lset.add(12);
		lset.add(14);
		lset.remove(12);
		lset.remove(14);

	
		System.out.println(lset);

	}

}
