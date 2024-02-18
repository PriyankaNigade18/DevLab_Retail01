package oop.DataAbstraction;

public class ChildClass extends AbstrctClass
{
	/*
	 * Child has to implement all the abstract method from parent
	 */

	public void add()
	{
		System.out.println("Addition is: "+(10+10));
	}
	public static void main(String[] args) 
	{
		System.out.println("Scenario 1: Child class ref and child class Object");
		ChildClass c1=new ChildClass();
		c1.accept();//inherited
		c1.add();//individual
		c1.show();//inherited abstract 
		
		System.out.println("Scenario 2: Parent class ref and child class Object");
		AbstrctClass a1=new ChildClass();
		a1.accept();
		a1.show();
		
	}

	@Override
	public void show() {

		System.out.println("This is Implemented by child");
		
	}

}
