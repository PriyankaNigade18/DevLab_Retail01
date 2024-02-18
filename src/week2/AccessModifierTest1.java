package week2;

public class AccessModifierTest1
{
	//data=instance type
	int id=101;//default
	public String name="Sarang";
	private long phno=987654478;
	protected int acno=656576;
	

	public static void main(String[] args)
	{
		//object of a class
		AccessModifierTest1 a1=new AccessModifierTest1();
		System.out.println("Winthin a same class");
		System.out.println(a1.id);
		System.out.println(a1.name);
		System.out.println(a1.phno);
		System.out.println(a1.acno);


	}

}
