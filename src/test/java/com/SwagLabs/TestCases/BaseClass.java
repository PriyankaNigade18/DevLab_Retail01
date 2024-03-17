package com.SwagLabs.TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.SwagLabs.Pages.*;
import com.SwagLabs.Utility.PropertiesFile;

public class BaseClass
{
	public WebDriver driver;
	public LoginPage lp;
	public InventoryPage  ip;
	public AddToCartPage ap;
	public CheckOutPage cp;
	public OverviewPage op;
	public PropertiesFile ps;
	
	
	@BeforeTest
	public void browserSetup()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
		ps=new PropertiesFile("Config.properties");
		lp=new LoginPage(driver);
		ip=new InventoryPage(driver);
		ap=new AddToCartPage(driver);
		cp=new CheckOutPage(driver);
		op=new OverviewPage(driver);
		
			
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
		lp.doLogin(ps.getData("un"),ps.getData("psw"));
		addWait();
		System.out.println("******Inventory Page*****");
		System.out.println("Total Products are: "+ip.getProductCount());
		addWait();
		ip.getProductName();
		ip.addProductToCart(ps.getData("pname1"));
		addWait();
		System.out.println("*******Cart Page*********");
		ap.getCartPage();
		addWait();
		ap.doRemoveProduct();
		addWait();
		ap.doContinueshopping();
		addWait();
		ip.addProductToCart(ps.getData("pname2"));
		addWait();
		ap.getCartPage();
		addWait();
		ap.doCheckout();
		System.out.println("*******Checkout Page*********");
		cp.doContinue(ps.getData("fn"),ps.getData("ln"),ps.getData("zc"));
		System.out.println("*******Overview Page*********");

		
		
		
		
	}
}
