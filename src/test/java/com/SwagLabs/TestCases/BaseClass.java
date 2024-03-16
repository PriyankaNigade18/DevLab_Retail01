package com.SwagLabs.TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.SwagLabs.Pages.*;

public class BaseClass
{
	public WebDriver driver;
	public LoginPage lp;
	public InventoryPage  ip;
	public AddToCartPage ap;
	
	
	@BeforeTest
	public void browserSetup()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
		lp=new LoginPage(driver);
		ip=new InventoryPage(driver);
		ap=new AddToCartPage(driver);
		
			
	}
	

	public void addWait()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@BeforeClass
	public void pageSetUp()
	{
		System.out.println("*****Login********");
		System.out.println("Title is: "+lp.getAppTitle());
		lp.doLogin("standard_user","secret_sauce");
		addWait();
		System.out.println("******Inventory Page*****");
		System.out.println("Total Products are: "+ip.getProductCount());
		addWait();
		ip.getProductName();
		ip.addProductToCart("Sauce Labs Bolt T-Shirt");
		addWait();
		System.out.println("*******Cart Page*********");
		
		
		
		
		
	}
}
