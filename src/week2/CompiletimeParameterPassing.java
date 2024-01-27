package week2;

public class CompiletimeParameterPassing 
{
	public void add()//0 parameter method
	{
		int a=100,b=20;//local variable
		System.out.println("Addition is: "+(a+b));
	}
	
	
	public void sub(int a,int b)// 2 parameters a=800 b=300 variable=parameters
	{
		System.out.println("Subtraction is: "+(a-b));//500
		
	}
	
	public void prod(int a,int b)//a=10 b=20
	{
		System.out.println("Multiplication is: "+(a*b));
	}
	
	/*
	 * return is keyword in java
	 * returns value from the method to calling function
	 * void as return type-->return keyword need to define return type
	 */
	public String info(String msg)//msg=Hello Everyone!
	{
		return msg;//return to calling function
	}
	
	public int div(int a,int b)
	{
		return a/b;
	}

	public static void main(String[] args)
	{
		CompiletimeParameterPassing c1=new CompiletimeParameterPassing();
		c1.add();
		
		//compile time parameter passing without return
		c1.sub(800,300);//passing 2 arguments(real data)
		
		c1.prod(10,20);
		
		//call
		String res=c1.info("Hello everyone!");
		System.out.println(res);
		
		int di=c1.div(100,10);
		System.out.println("Division is: "+di);
		
		
		
		

	}

}
