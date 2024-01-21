package week1;

public class VariableDemo 
{
	/*
	 * instance variable get the memory at the time object create
	 * instance variable get the separate memory for every separate object
	 */
	int id=101;//instance
	String name="Priynka";
	
	static String cname="AISSPMS";
	
	/*
	 * static keyword use for memory management
	 * -----------------------------------------
	 * anything common to all objects then declare data as static
	 * static data gets the memory inside class load area only one time 
	 * & same memory it will share with all object
	 * 
	 * inside meta space
	 * 
	 */
	
	
	
	//instance method=object
	public void show()
	{
		int marks=90;//local variable
		System.out.println("Marks from show(): "+marks);
		
	}
	
	//instance method=object
	public void display()
	{
		int marks=80;//local variable
		System.out.println("Marks from display(): "+marks);
	}
	
	

	public static void main(String[] args)
	{
		int marks=100;//local variable
		System.out.println("Marks from main(): "+marks);
		
			
		//calling function
		VariableDemo v1=new VariableDemo();
		System.out.println("College name for first object: "+cname);
		//calling instance method
		v1.show();
		v1.display();
		
		System.out.println(v1.id);

		System.out.println(v1.name);
		
		System.out.println("********************");
		
		VariableDemo v2=new VariableDemo();
		System.out.println("College name for second object: "+cname);

		v2.show();
		v2.display();
		System.out.println(v2.name);
		System.out.println(v2.id);
		
		
		
		



	}

}
