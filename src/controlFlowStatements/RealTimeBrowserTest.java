package controlFlowStatements;

import java.util.Scanner;

public class RealTimeBrowserTest {

	public static void main(String[] args)
	{
		/*
		 * Operators we can use only for primitive data
		 * To perform operations on String/Object we use Methods
		 * 
		 * 
		 * 
		 * To test equality of a string 
		 * 1.equals()-case sensitive
		 * 2.equalsIgnoreCase()-not case sensitive
		 

		
		String s1="Hello";
		String s2="HELLO";
		System.out.println(s1.equals(s2));//false
		System.out.println(s1.equalsIgnoreCase(s2));//true
		*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a browser name");
		String bname=sc.nextLine();
		
		if(bname.equalsIgnoreCase("chrome"))
		{
			System.out.println("Test case is executing on Chrome");
		}else if(bname.equalsIgnoreCase("firefox"))
		{
			System.out.println("Test case is executing on Firefox");

		}else if(bname.equalsIgnoreCase("edge"))
		{
			System.out.println("Test case is executing on Edge");

		}else
		{
			System.out.println("Invalid browser!");
		}
			 
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
