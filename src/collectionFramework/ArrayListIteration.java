package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIteration {

	public static void main(String[] args)
	{

		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(78);
		al.add(10);
		al.add(67);
		al.add(20);
		al.add(99);
		al.add(30);
		
		System.out.println(al);
		System.out.println("**********For loop*************");
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("**********For each loop*************");

		for(Integer i:al)
		{
			System.out.println(i);
		}
		
		System.out.println("****************Iterator()************");
		/*
		 * iterator() is collection framework method
		 * 
		 * iterator() return Iterator<Object>
		 * Iterator interface
		 * 1.hasNext()
		 * 2.next()
		 * 
		 */
		
			Iterator<Integer> ir=al.iterator();
			
			while(ir.hasNext())
			{
				System.out.println(ir.next());
			}
			
		System.out.println("*********ListIterator()**********");	
		/*
		 * listIterator() is only for list interface and classes
		 */
		ListIterator<Integer> lr=al.listIterator();
		
		while(lr.hasNext())
		{
			System.out.println(lr.next());
		}
		
		
		System.out.println("********Sort the Elements of list****");
		/*
		 * collections is class in java and it has static method
		 */
		System.out.println("Original list: "+al);
		Collections.sort(al);
		System.out.println("Sorted list: "+al);

		
		System.out.println("Max Element:"+Collections.max(al));
		System.out.println("Min Element:"+Collections.min(al));

		
		
		
			
			
			
			
		
		
		
		
		
		
		

	}

}
