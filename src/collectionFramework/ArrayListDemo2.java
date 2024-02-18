package collectionFramework;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {

		ArrayList<String> loc=new ArrayList<String>();
		loc.add("Pune");
		loc.add("Mumbai");
		
		System.out.println("Total locations: "+loc.size());
		System.out.println(loc);
		
		System.out.println("************************");
		
		ArrayList<Double> marks=new ArrayList<Double>();
		marks.add(88.67);
		marks.add(45.66);
		marks.add(67.77);
		
		System.out.println("Total Marks: "+marks.size());

		System.out.println(marks);
		System.out.println("****************************");
		ArrayList<Object> empdata=new ArrayList<Object>();
		empdata.add("Sarang");
		empdata.add("pune");
		empdata.add('M');
		empdata.add(33);
		empdata.add(7868765557L);
		
		System.out.println(empdata);
		
		
		
		
		
		
		
		

	}

}
