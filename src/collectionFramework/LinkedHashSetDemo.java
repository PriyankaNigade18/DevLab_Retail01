package collectionFramework;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args)
	{

		LinkedHashSet<Integer> ls=new LinkedHashSet<Integer>();
		ls.add(100);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		ls.add(40);
		ls.add(80);
		
		System.out.println(ls);
		
		
		
		String test="aaabbcc";
		
		
		LinkedHashSet<Character> l1=new LinkedHashSet<Character>();
		l1.add(test.charAt(0));
		l1.add(test.charAt(1));
		l1.add(test.charAt(2));
		l1.add(test.charAt(3));
		l1.add(test.charAt(4));
		l1.add(test.charAt(5));
		l1.add(test.charAt(6));
		
		System.out.println(l1);
		
		
		
		
		
		
		
		
		
		
	
	}

}
