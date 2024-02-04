package oop.Inheritance;

class A
{
	public void m1()
	{
		System.out.println("M1 is calling!");
	}
}

class B extends A//A is parent and B is child -Single level inheritance
{
	public void m2()
	{
		System.out.println("M2 is calling!");
	}
}

class C extends B//B is parent and C is child-Multilevel Inheritance
{
	public void m3()
	{
		System.out.println("M3 is calling!");
	}
}

class D extends A//A parent and D is child-Hierarchical
{
	public void m4()
	{
		System.out.println("M4 is calling!");
	}
}
/*
 * Multiple inheritance and Hybrid inheritance we can achieve in java using interface
 */

//class x extends B,D
//{
//	
//}

public class InheritanceDemo {

	public static void main(String[] args) 
	{
		System.out.println("Scenario1: Parent class ref and parent class object->Parent class");
		A a1=new A();
		a1.m1();
	//for C class B
//		B b3=new B();
//		b3.m1();
//		b3.m2();
		
		
		System.out.println("Scenario2: child class ref and child class object->Parent class+Child class");

		
		
		D d1=new D();
		d1.m1();
		d1.m4();
//		C c1=new C();
//		c1.m1();
//		c1.m2();
//		c1.m3();
		
//		B b1=new B();
//		b1.m2();
//		b1.m1();
		
		System.out.println("Scenario3: Parent class ref and child class object->Parent class");
		
//		A a2=new B();
//		a2.m1();
		
//		B b2=new C();
//		b2.m1();
//		b2.m2();
//		
		
		A a2=new D();
		a2.m1();
		
		/*
		System.out.println("Scenario4: child class ref and parent class object->Invalid");
		
		//B b2=new A();
		
*/
		


	}

}
