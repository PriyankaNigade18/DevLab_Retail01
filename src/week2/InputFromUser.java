package week2;

import java.util.Scanner;

public class InputFromUser 
{	
	public void add(int a,int b)
	{
		System.out.println("Addition is :"+(a+b));
	}

	public int sub(int a,int b)
	{
		return a-b;
	}
	
	public static void main(String[] args)
	{
		/*
		 * Scanner is predefined class in java
		 * System.in is input stream to read data
		 * 
		 */

		InputFromUser i1=new InputFromUser ();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		//run time parameter passing without return
		i1.add(a,b);
		
		//run time parameter passing with return
		int res=i1.sub(a, b);
		System.out.println("Subtraction is: "+res);
		
		
		
		
		
		
		
		
		/*
		System.out.println("Enter your name");
		String name=sc.nextLine();
		System.out.println("Hello "+name);
		
		System.out.println("Enter your age: ");
		int age=sc.nextInt();
		System.out.println("Your age is: "+age);
		
		*/
		
		

	}

}
