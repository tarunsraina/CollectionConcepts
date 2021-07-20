package Collections;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
		// Almost same as HashMap
		/*  
		 * 
		 * HashMap                                             HashTable
		 * 
		 * I)Not Synchronized                                I)Synchronized
		 * II)Multiple threads allowed						II)One thread at a time
		 * III)Not thread safe								III)Thread safe 
		 * IV)Greater Performance							IV)poor/low performance
		 * V)Null key is accepted{once},					V)Nulls not allowed neither as key nor
		 * Null values allowed any number of times				as value.
		 * 
		 * 
		 */
		
		Hashtable ht=new Hashtable();//capacity=11,load factor=0.75
		Hashtable ht1=new Hashtable(100);//initial capacity will be 100
		Hashtable ht2=new Hashtable(100,(float)0.50);//initial capacity will be 100,load factor is 0.50
		Hashtable <Integer,Integer> ht3=new Hashtable <Integer,Integer>();
		
		ht.put(100,"Tarun");
		ht.put(101,102);
		ht.put(100,"Teja"); //rewritten i.e.,"Tarun" will be replaced with "teja"
		//ht.put(null,null);--->Throws Exception
		System.out.println(ht);//{101=102, 100=Teja}
		
		
		//containsKey,containsValue

	}

}
