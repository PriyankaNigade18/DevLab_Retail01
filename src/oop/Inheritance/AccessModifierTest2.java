package oop.Inheritance;

import week2.AccessModifierTest1;

public class AccessModifierTest2 extends AccessModifierTest1 
{

	public static void main(String[] args) 
	{
		AccessModifierTest1 a1=new AccessModifierTest1();
		System.out.println(a1.name);//public
		/*
		 * Protected modifier you can access data in different package only with subclass
		 */
		
		AccessModifierTest2 t1=new AccessModifierTest2();
		System.out.println(t1.acno);//protected
		System.out.println(t1.name);//public
	}

}
