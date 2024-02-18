package collectionFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) 
	{

		HashMap<String,Integer> map=new HashMap<String,Integer>();
		map.put("Lohegaon", 411047);
		map.put("Viman Nagar", 411014);
		map.put("Wadgaonsheri", 411014);
		map.put("Kharadi", 411044);
		
		System.out.println("Total Elements: "+map.size());
		
		System.out.println(map);
		
		System.out.println(map.get("Kharadi"));
		
		System.out.println("Check for key =Kaharadi?: "+map.containsKey("Kharadi"));
		
		//to remove key and value
		map.remove("Kharadi");
		
		System.out.println(map);
		
		//Iteration -Entry interface
		
		for(Map.Entry<String,Integer> i:map.entrySet())
		{
			//System.out.println(i);
			System.out.println(i.getKey()+" : "+i.getValue());
		}
		
		
		/*
		 * Convert values of map to list
		 */
		
		System.out.println("Converting map values to list");
		ArrayList<Integer> ls=new ArrayList<Integer>();
		
		for(Map.Entry<String,Integer> i:map.entrySet())
		{
			ls.add(i.getValue());
			
		}
		
		System.out.println(ls);
		
		
		
		
		
		
		}

}
