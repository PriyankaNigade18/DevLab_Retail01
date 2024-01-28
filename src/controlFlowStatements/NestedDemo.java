package controlFlowStatements;

import java.util.Scanner;

public class NestedDemo {

	public static void main(String[] args)
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your marks for Grade");
		int marks=sc.nextInt();
		
		
		if(marks>=90)
		{
			if(marks>=95)
			{
				System.out.println("Grade is: A++");
			}else
			{
				System.out.println("Grade is: A");
			}
		}else
		{
			System.out.println("Grade is: B" );
		}

	}

}
