package controlFlowStatements;

import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args)
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a performance number from 1 to 5");
		int num=sc.nextInt();
		//Key==value
		switch(num)//key
		{
		case 1://value
			System.out.println("Poor performance");
			break;//exit from switch
		case 2:
			System.out.println("Need To Improve performance");
			break;//exit from switch
		case 3:
			System.out.println("Good performance");
			break;//exit from switch
		case 4:
			System.out.println("Excellent performance");
			break;//exit from switch
		case 5:
			System.out.println("Employee of the Year!");
			break;//exit from switch
			default:
				System.out.println("Invalid Performance Number!");
			
		}
		
		
		
		
		
		
		
		
		
	}

}
