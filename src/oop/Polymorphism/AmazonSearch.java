package oop.Polymorphism;

public class AmazonSearch 
{
	public void search(String pname)
	{
		System.out.println("Search by product name:"+pname );
	}
	
	public void search(String bname,String pname)
	{
		System.out.println("Search by brand name:"+bname+" & product name : "+pname );

	}
	
	public void search(int price)
	{
		System.out.println("Search by product price: "+price);
	}

	public void search(String pname,int price)
	{
	System.out.println("Search by product name:"+pname+" & product price: "+price );	
	}
	
	
}
