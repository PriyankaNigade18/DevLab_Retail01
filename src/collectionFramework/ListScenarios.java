package collectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ListScenarios {

	public static void main(String[] args)
	{

		ArrayList<Integer> l1=new ArrayList<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		
		System.out.println("List1: "+l1);
		
		ArrayList<Integer> l2=new ArrayList<Integer>();
		l2.add(40);
		l2.add(50);
		
		System.out.println("List2: "+l2);

		ArrayList<Integer> flist=new ArrayList<Integer>();
		flist.addAll(l1);
		flist.addAll(l2);
		
		System.out.println("Final List: "+flist);

		
		
		System.out.println("*****************");
		
		//delete duplicate elements from the list
		List<Integer> ls=Arrays.asList(1,2,3,1,2,3);
		
		System.out.println(ls);
		
		HashSet<Integer> hs=new HashSet<Integer>(ls);
		System.out.println(hs);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
