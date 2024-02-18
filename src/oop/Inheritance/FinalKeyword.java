package oop.Inheritance;


//final class Demo
class Demo
{
	
	final int price=2000;
	
	public final void display()
	{
		System.out.println("Product price is: "+price);
	}
	
}


//The type FinalKeyword cannot subclass the final class Demo
public class FinalKeyword extends Demo
{
//	@Override
//	public void display()//Cannot override the final method from Demo
//	{
//		System.out.println("Updated Product price is: "+(price+1000));
//	}
	public static void main(String[] args)
	{
		FinalKeyword f1=new FinalKeyword();
		System.out.println("Old price: "+f1.price);
		//f1.price=4000;
		System.out.println("Updated one: "+f1.price);
		f1.display();


	}

}
