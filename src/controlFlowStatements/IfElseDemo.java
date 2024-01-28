package controlFlowStatements;

import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) 
	{
		//If else for validating true and false both conditions
		//Accept two numbers from user and find the largest one

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();	
		
		if(num1>num2)
		{
			System.out.println(num1+" is largest than "+num2);
		}else
		{
			System.out.println(num2+" is largest than "+num1);

		}

	}

}
