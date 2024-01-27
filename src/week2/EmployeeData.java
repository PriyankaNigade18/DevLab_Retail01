package week2;

public class EmployeeData 
{
	//data-instance
	int empId;
	String empName;
	
	
	//method instance
	public void display()
	{
		System.out.println("Employee Id is: "+empId);
		System.out.println("Employee Name is: "+empName);
	}
	
	
	public static void main(String[] args)
	{
		//object
		EmployeeData e1=new EmployeeData();
		e1.empId=101;
		e1.empName="Sagar";
		
		e1.display();
		
		
		EmployeeData e2=new EmployeeData();
		e2.display();//default value
		e2.empId=102;
		e2.empName="Kim";
		e2.display();
		
		
		
		
		
		

	}

}
