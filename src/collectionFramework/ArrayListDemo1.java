package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {

	/*
	 * ArrayList is class and implements List interface
	 * Underline data Structure for arraylist is Dynamic array
	 */
	public static void main(String[] args)
	{

		//Generic way
		List<Integer> list1=new ArrayList<Integer>();
		System.out.println("Is list is empty before adding elements?: "+list1.isEmpty());//true
		
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		
		System.out.println("Is list is empty after adding elements?: "+list1.isEmpty());//false

		System.out.println(list1);
		
		System.out.println("Total Elements are: "+list1.size());//4
		
		System.out.println("Check 50 is available?: "+list1.contains(50));//false
		
		System.out.println("Check 10 is available?: "+list1.contains(10));//true

		//add one more element/object at certain position 1st 200?
		list1.add(1,200);
		
		
		System.out.println(list1);
		
		//remove any object from list 40
		
		list1.remove(4);
		System.out.println("After removing element from 4th index final list is");
		System.out.println(list1);
		
		//to clear complete list
		
		list1.clear();
		System.out.println("After clear list: ");
		System.out.println(list1);
		
		list1.add(null);
		
		System.out.println(list1);
		list1.add(20);
		list1.add(20);
		list1.add(30);
		list1.add(10);
		
		System.out.println(list1);
		
		
		
		
		
		
		
		
		

	}

}
