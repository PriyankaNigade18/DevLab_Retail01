package oop.Encapsulation;

public class AmazonLoginTest {

	public static void main(String[] args)
	{
		LoginPage sarang=new LoginPage();
		sarang.setUsername("Sarang123");
		sarang.setPassword("test123");
		sarang.doLogin(sarang.getUsername(), sarang.getPassword());
	
		System.out.println("*******************************");
		
		LoginPage tom=new LoginPage();
		tom.setUsername("Tom12");
		tom.setPassword("test122");
		tom.doLogin(tom.getUsername(),tom.getPassword());

	}

}
