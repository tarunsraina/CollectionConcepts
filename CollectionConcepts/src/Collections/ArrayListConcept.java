package Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class ArrayListConcept {
	public static void main(String[] args) {	
		// insertion order is preserved
		//duplicates are allowed 
		//Growable in nature->{not possible in arrays}
		
		ArrayList al=new ArrayList();
		al.add("hello");
		al.add("hi");
		al.add(1,1);  //add at specific index
		al.add(true);
		
		al.remove(2); //remove from index 2
		
		System.out.println(al.get(2)); //get from index 2
		
		al.set(1,"bye"); //store 'bye' at position 1
		
		System.out.println(al);
		
		//Array list where only a string is accepted
		ArrayList <String> al1=new <String> ArrayList();
		
		al1.add("tarun");  
		al1.add("teja");  
		al1.add("varun");
		System.out.println(al1);
		
		//removes all elements in al1
		al1.removeAll(al1);
		
		//Size of array list
		System.out.println(al.size());
		
		//adding two list into one
		al.addAll(al1);
		
		System.out.println(al);
		
		System.out.println(al.contains("hello"));//returns true since 'hello' is present in al
		System.out.println(al.contains("hel"));//returns false since 'hello' is NOT present in al
		
		//Traversing through all elements of a list
		for(int t=0;t<al.size();t++) {
			System.out.print(" "+al.get(t));
		}     
		
		
		//OR
		
		for(Object t:al) {
			System.out.print(" "+t);
		}
		
		//OR
		
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			System.out.print(" "+it.next());
		}
		
		Collections.sort(al1); //Sort
		
		Collections.sort(al1,Collections.reverseOrder()); //Reverse Sort
		
		Collections.shuffle(al1); //shuffle list
		
		System.out.println(" "+al1);
	}

}
