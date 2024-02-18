package exceptionHandling;

import java.util.Scanner;

public class RuntimeException 
{
	//instance
	int id=101;

	public static void main(String[] args)
	{
		
		RuntimeException  r1=new RuntimeException ();
		r1=null;
		try {
		System.out.println(r1.id);//NullPointerException
		}catch(Exception e)
		{
			System.out.println("Check Object is Null");
			
		}
		
		
		/*
		//NumberFormatException - if the string does not contain a parsable integer.
		String s1="100ABC";
		System.out.println(s1+100);//100100
		//wrapper class
		try {
		int num=Integer.parseInt(s1);//NumberFormatException
		System.out.println(num+100);//200
		}catch(Exception e)
		{
			System.out.println("Check String data is Parsable/valid!");
		}
		
		*/
		
		
		/*
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter index between 0 to 4");
		int index=sc.nextInt();
		
		int arr[]= {10,20,30,40,50};
		try {
		System.out.println("Value at index"+index+":="+arr[index]);
		}catch(ArrayIndexOutOfBoundsException b)
		{
			System.out.println("Please enter valid index position!");
		}
		*/
		
		
		
		
		
		
		
		
		
				/*
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		System.out.println("Addition is: "+(num1+num2));
		System.out.println("Subtraction is: "+(num1-num2));
		//exception handling
		try {
		System.out.println("Division is: "+(num1/num2));//AritmeticException
		}catch(ArithmeticException a)
		{
			System.out.println("Please enter number other than 0 for division");
		}
		System.out.println("Multiplication is: "+(num1*num2));
		*/
		
		
		
		
		



		
		
		
		
	}

}
