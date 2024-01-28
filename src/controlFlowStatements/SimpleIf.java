package controlFlowStatements;

import java.util.Scanner;

public class SimpleIf {

	public static void main(String[] args)
	{
		//Simple if test for true condition


		//Accept age of user and validate for voting age>=18
		
		System.out.println("Program starts!");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		
		
		if(age>=18)
		{
			System.out.println("Valid user");
		}
		
		
		System.out.println("Program ends!");
		
		
		
		
		
		
		

	}

}
