package collectionFramework;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	/*
	 * Set is interface 
	 * unique element + not ordered collection
	 */
	public static void main(String[] args) 
	{

		Set<Integer> set1=new HashSet<Integer>();
		System.out.println("Is set empty?: "+set1.isEmpty());//true
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.add(40);
		set1.add(20);
		set1.add(null);
		
		System.out.println("After adding elements is set empty?: "+set1.isEmpty());//false
		
		System.out.println("Total Elements are: "+set1.size());
		
		System.out.println(set1);
		
		
	}

}
