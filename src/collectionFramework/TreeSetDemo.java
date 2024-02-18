package collectionFramework;

import java.util.ArrayList;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) 
	{

		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(7);
		ts.add(13);
		ts.add(3);
		ts.add(9);
		ts.add(1);
		ts.add(18);
		ts.add(5);
		
		System.out.println(ts);
		System.out.println("Total Elements: "+ts.size());
		
		System.out.println("Is 50 available: "+ts.contains(50));
		System.out.println("Is 18 available: "+ts.contains(18));

		
		//convert treeset to integer array
		
		ArrayList<Integer> a1=new ArrayList<Integer>(ts);
		
		System.out.println(a1);
		
		
		System.out.println("*****************");
		ArrayList<Integer> a2=new ArrayList<Integer>();
		a2.addAll(ts);
		System.out.println(a2);
		
	}

}
