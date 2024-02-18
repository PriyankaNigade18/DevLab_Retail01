package exceptionHandling;

public class FinallyBlock {
/*
 * Finally is special block 
 * to run script with or without exception
 * 
 * finally block used to write special script
 */
	public static void main(String[] args)
	{
		System.out.println("Program started!");
		try {
			System.out.println(9/3);
		}catch(Exception e)
		{
			
			System.out.println("Please Enter valid number for Division!");
		}
		finally
		{
			System.out.println("Hello I am Finally block!\nI am not for exception handling!");
			
		}
		
		System.out.println("Program ends!");


	}

}
