package oop.DataAbstraction;

public abstract class AbstrctClass
{
	/*
	 * This is a class can have 
	 * 1.implemented method
	 * 2.Abstract method-Method without body
	 * 
	 * Class object we can't create 
	 * All the abstract methods implemented by the child class
	 * 
	 * Partial abstraction is possible
	 */
	
	public void accept()
	{
		System.out.println("Fully implemented method");
	}
	
	
	//abstract method
	public abstract void show();
	
	

	public static void main(String[] args)
	{
		//AbstrctClass a1=new AbstrctClass();
		//Cannot instantiate the type AbstrctClass

	}

}
