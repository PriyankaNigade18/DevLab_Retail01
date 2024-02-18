package oop.Inheritance;

public class ChildSuper extends ParentSuper
{
	int cid=201;
	
	public void childIncome()
	{
		System.out.println("Parent id is: "+super.pid);
		super.parentIncome();
		System.out.println("Child id is: "+cid);
		System.out.println("Child income is: $80000 ");
	}
	
	public ChildSuper()
	{
		super();//to call parent constructor
		System.out.println("Default child constructor calling!");
	}
	

	public static void main(String[] args)
	{
		ChildSuper c1=new ChildSuper();
		c1.childIncome();

	}

}
