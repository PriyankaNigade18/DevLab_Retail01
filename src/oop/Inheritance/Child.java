package oop.Inheritance;

public class Child extends Parent
{
/*
 * Run time polymorphism
 * child class override parent class methods
 */
	
	@Override
	public void color()
	{
		System.out.println("Yellow");
	}
	public static void main(String[] args) 
	{

			//parent ref and Parent object
		Parent p1=new Parent();
		p1.color();//red
		
		//child class ref and child class object
		Child c1=new Child();
		c1.color();//yellow
		
		
		//parent class ref and child class object
		Parent p2=new Child();
		p2.color();//yellow
		
		
		
		
		
		

	}

}
