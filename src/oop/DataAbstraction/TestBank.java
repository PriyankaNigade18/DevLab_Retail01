package oop.DataAbstraction;

public class TestBank {

	public static void main(String[] args)
	{
		//parent class ref and child class object=parent
		RBI r1=new HDFC();
		r1.withdraw();
		r1.deposite();
		r1.rateOfInterest();
		
		System.out.println("********************");

		
		HDFC cust1=new HDFC();
		cust1.custDetails();//individual
		cust1.withdraw();//inehrited abstract method
		cust1.deposite();
		cust1.rateOfInterest();
		
	}

}
