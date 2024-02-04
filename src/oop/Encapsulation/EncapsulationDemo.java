package oop.Encapsulation;

public class EncapsulationDemo {

	//data+Method
	
	public static void main(String[] args)
	{

		Employee emp1=new Employee();
		emp1.display();
//		emp1.id=201;
//		emp1.name="Siya";
		
		emp1.setId(301);
		
		emp1.display();

	}

}
