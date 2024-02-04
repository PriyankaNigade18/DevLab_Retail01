package oop.Encapsulation;

public class Employee 
{
	private int id=101;
	private String name="Seema";
	
	//public method for data-setter and getter
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}

	
	
	//business logic
	public void display()
	{
		System.out.println("Employee id: "+id);
		System.out.println("Employee name: "+name);
	}



	
}
