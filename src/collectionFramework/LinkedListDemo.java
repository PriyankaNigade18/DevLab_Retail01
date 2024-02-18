package collectionFramework;

import java.util.LinkedList;

public class LinkedListDemo {

	/*
	 * LinkedList is class implements List interface
	 * Underline data structure is Doubly LinkedList
	 * frequent operation is data insertion and deletion
	 * 
	 * 
	 */
	public static void main(String[] args) 
	{
		LinkedList<Integer> ls=new LinkedList<Integer>();
		ls.add(20);
		ls.add(10);
		ls.add(10);
		ls.add(30);
		ls.add(40);
		
		
		System.out.println("Total Elements are: "+ls.size());
		
		System.out.println(ls);
		ls.addFirst(100);
		ls.addLast(888);
		
		System.out.println(ls);
		System.out.println(ls.getFirst());
		System.out.println(ls.getLast());
		
		ls.add(2,88);
		
		System.out.println(ls);
		
		
		
		ls.remove(2);
		
		
		System.out.println(ls);//88

		

	}

}
