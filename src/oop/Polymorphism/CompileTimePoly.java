package oop.Polymorphism;

public class CompileTimePoly 
{
	/*
	 * Method overloading
	 * When same name method we reuse in same class with different signature
	 * 1.Number of parameters
	 * 2.Type of parameter
	 * 3.Order of parameters
	 */

	public void add()//0 parameter
	{
		int a=100,b=20;
		
		System.out.println("Addition is: "+(a+b));
		
	}
	
	//number of parameters
	public void add(int a,int b)
	{
		System.out.println("Addition is: "+(a+b));
	}
	
	//type of parameters
	public void add(double a,int b)
	{
		System.out.println("Addition is: "+(a+b));
	}
	
	//change the order of parameters
	public void add(int a,double b)
	{
		System.out.println("Addition is: "+(a+b));
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args)
	{
		CompileTimePoly c1=new CompileTimePoly();
		c1.add();
		c1.add(100.22,100);
		c1.add(200,100.220);
		c1.add(1000,1000);

	}

}
