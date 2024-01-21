package week1;

public class StudentData 
{
	
	int id=101;
	
	//instance method-To call this method we need object  
	void show()
	{
		System.out.println("This is instance method");
	System.out.println(id);	
	}
	
	//static method-To call static method we don't need any object
	//static method always gets executed by its class name
	static void display()
	{
		System.out.println("This is static method");
	}
	
	//calling function
	public static void main(String args[])
	{
		//show();
		
		//To call instance variable /method object create
		StudentData s1=new StudentData();
		s1.show();
		System.out.println(s1.id);
		//The static method display() from the type StudentData should be accessed in a static way
		//s1.display();
		
		//static method
		display();
		StudentData.display();
		
	}

}
