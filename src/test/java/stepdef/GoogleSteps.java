package stepdef;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class GoogleSteps
{
	WebDriver driver;
	List<WebElement> list;
	String atitle;
	@Given("Open Google application")
	public void open_google_application()
	{
		 driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
		

	}

	@When("Get the actual title and compare with expected title")
	public void get_the_actual_title_and_compare_with_expected_title() {
	   
		atitle =driver.getTitle();
	   System.out.println("Title is: "+atitle);
//	   Assert.assertTrue(atitle.contains("Google"),"Title not matched!");
//	   System.out.println("Title Matched!");
	}

	@Then("Google page title should be Google only")
	public void google_page_title_should_be_google_only() {
	    
		Assert.assertTrue(atitle.contains("Google"),"Title not matched!");
		System.out.println("Title Matched!");
	}
	@When("I search with valid keyword in google")
	public void i_search_with_valid_keyword_in_google()
	{
	    driver.findElement(By.name("q")).sendKeys("Cucumber");
	    list=driver.findElements(By.xpath("//ul[@class='G43f7e']//li"));
	}

	@Then("I should ge valid search result")
	public void i_should_ge_valid_search_result() {
	    
		System.out.println("Search result is:");
		for(WebElement i:list)
		{
			System.out.println(i.getText());
		}
	}

}
