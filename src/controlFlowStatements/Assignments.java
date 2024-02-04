package controlFlowStatements;

import java.util.Scanner;

public class Assignments {

	public static void main(String[] args)
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(num*i);
		}
		
		System.out.println("*************************");
		
		
		
		for(int no=1;no<=10;no++)
		{
			for(int i=1;i<=10;i++)
			{
				System.out.print(no*i+"\t");// \t tab
			}
			System.out.println();//next row
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
