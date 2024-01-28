package controlFlowStatements;

import java.util.Scanner;

public class EvenOrOddNumberTest {

	public static void main(String[] args)
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num1=sc.nextInt();
		
		if(num1%2==0)
		{
			System.out.println(num1+" is even number");
		}else
		{
			System.out.println(num1 +" is odd number");
		}

	}

}
