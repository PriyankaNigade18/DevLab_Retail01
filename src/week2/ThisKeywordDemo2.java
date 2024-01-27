package week2;

public class ThisKeywordDemo2 

{
	public ThisKeywordDemo2()
	{
		this("Hi!");
		System.out.println("Default constructor");
	}
	
	
	public ThisKeywordDemo2(String msg)
	{
		//to call constructor use this() constructor
		//this();//default
		System.out.println("Parameterized constructor msg is: "+msg);
		
	}
	
	

	public static void main(String[] args)
	{

		ThisKeywordDemo2 t1=new ThisKeywordDemo2();

	}

}
