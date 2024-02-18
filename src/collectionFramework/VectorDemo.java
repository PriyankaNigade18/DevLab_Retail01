package collectionFramework;

import java.util.Vector;

public class VectorDemo 
{

	/*
	 * Vector is class implement List interface
	 * Underline data structure is Dynamic array
	 * Perform wise vector slow
	 * Vector is synchronized
	 * 
	 */
	public static void main(String[] args)
	{

		Vector<Integer> v1=new Vector<Integer>();
		System.out.println("Is list empty?: "+v1.isEmpty());//true
		
		v1.add(10);
		v1.add(20);
		v1.add(30);
		v1.add(40);
		
		System.out.println("Is list empty?: "+v1.isEmpty());//false
		
		System.out.println("Total elements: "+v1.size());
		
		
		System.out.println(v1);
		
		
		System.out.println("******Iteration*********");
		
		for(Integer i:v1)
		{
			System.out.println(i);
		}
		
		
		
		

	}

}
