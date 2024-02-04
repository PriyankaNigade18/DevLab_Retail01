package oop.Inheritance;

public class TestCar {

	public static void main(String[] args)
	{

		BMW b1=new BMW();
		b1.autoEngine();//individual 
		b1.start();//inherited method
		b1.refule();//inherited method
		b1.stop();//inherited method
		b1.autoBreak();
		b1.price();

System.out.println("*****************************");

		Car c1=new Car();
		c1.start();//individual 
		c1.refule();//individual 
		c1.start();//individual 
		c1.autoBreak();
		
		c1.price();
		System.out.println("*****************************");

		Audi a1=new Audi();
		a1.autoGear();//individual
		a1.start();//inherited
		a1.refule();//inherited
		a1.stop();//inherited
		a1.autoBreak();
		a1.price();

	}

}
