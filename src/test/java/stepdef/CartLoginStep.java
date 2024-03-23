package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class CartLoginStep
{
	WebDriver driver;
	
	@Given("Launch OpenCart login page")
	public void launch_open_cart_login_page() {
	    driver=new ChromeDriver();
	    driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	}

	@When("I enter valid email {string} and valid password {string}")
	public void i_enter_valid_email_and_valid_password(String email, String pwd) {
	    
		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-password")).sendKeys(pwd);
	}

	@When("I click on Login button from opencart login page")
	public void i_click_on_login_button_from_opencart_login_page() 
	{
	    driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	@Then("I should be able to login into cart application")
	public void i_should_be_able_to_login_into_cart_application()
	{
	    System.out.println("With Invalid data I will not able to login!");
	}




}
