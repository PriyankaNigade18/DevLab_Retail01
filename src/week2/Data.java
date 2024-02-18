package week2;

public class Data
{
	//data
	int id;//0
	
	
	//constructor-by default it get called by jvm
	Data()
	{
		System.out.println("This is default constructor calling!");
		System.out.println("Value of id is: "+id);
	}
	
	//parameterized 
	Data(int i)//i=101
	{
		System.out.println("This is parameterized constructor calling!");
		//assign data to instance variable
		//current class variable or method we use in java this keyword
		this.id=i;
		System.out.println("Current value of id is: "+id);
	}
	
	//method
	public void show()
	{
		System.out.println("This is method calling!");
	}
	
	
	
	
	public static void main(String[] args)
	{

		System.out.println("This is main() calling!");

		Data d1=new Data();//call default constructor-JVM
		d1.show();//calling method
		
		
		//parameterized
		Data d2=new Data(101);//call
		
		/*
		 * this keyword help us to call method/constructor
		 * this keyword help us to understand difference between local variable and instance variable 
		 */
		
		
		AccessModifierTest1 a2=new AccessModifierTest1();
		
		System.out.println("I am same package in different class");
		
	System.out.println(a2.id);//default
	System.out.println(a2.name);//public
	System.out.println(a2.acno);//protected
	
		
		
		
		
		
		
		
		
		
	}

}
