package oop.Encapsulation;

public class LoginPage
{
	//data
	private String username;
	private String password;
	
	//methods
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	//Business logic
	
	public void doLogin(String un,String psw)
	{
		
		System.out.println("Hello "+un);
		System.out.println("Login completed with Username: "+un);
	}
	

}
