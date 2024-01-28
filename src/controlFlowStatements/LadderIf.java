package controlFlowStatements;

import java.util.Scanner;

public class LadderIf {

	public static void main(String[] args) {

		/*
		 * Collection of characters are simply defined as String
		 * to read single character first read data as String then 
		 * use charAt(index) and read single character
		 */
		//Multiple conditions
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character");
		char ch=sc.nextLine().charAt(0);
		
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			System.out.println(ch+" is a vowel");

		}else
		{
			System.out.println(ch+" is not a vowel");

		}
		
		
		
		/* ladder if logic
		if(ch=='a')
		{
			System.out.println(ch+" is a vowel");
		}else if(ch=='e')
		{
			System.out.println(ch+" is a vowel");

		}else if(ch=='i')
		{
			System.out.println(ch+" is a vowel");

		}else if(ch=='o')
		{
			System.out.println(ch+" is a vowel");

		}else if(ch=='u')
		{
			System.out.println(ch+" is a vowel");

		}else
		{
			System.out.println(ch+" is not a vowel");
		}
		
		*/
		
		
		
		
		
		
		
		
		
		

	}

}
