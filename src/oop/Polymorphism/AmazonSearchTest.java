package oop.Polymorphism;

public class AmazonSearchTest {

	public static void main(String[] args) 
	{

		AmazonSearch a=new AmazonSearch();
		a.search("Iphone 15");
		a.search("bag", 30000);
		a.search(8000);
		a.search("Hp","laptop");

	}

}
