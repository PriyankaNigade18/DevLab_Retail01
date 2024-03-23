package stepdef;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class RegisterSteps 
{

	WebDriver driver;
@Given("Launch Opencart Register page")
public void launch_opencart_register_page() {
    
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
}

@When("I enter required field is form")
public void i_enter_required_field_is_form(DataTable table) {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
    // Double, Byte, Short, Long, BigInteger or BigDecimal.
    //
    // For other transformations you can register a DataTableType.

	List<List<String>> data=table.cells();
	driver.findElement(By.id("input-firstname")).sendKeys(data.get(1).get(0));
	driver.findElement(By.id("input-lastname")).sendKeys(data.get(1).get(1));
	driver.findElement(By.id("input-email")).sendKeys(data.get(1).get(2));
	driver.findElement(By.id("input-telephone")).sendKeys(data.get(1).get(3));
	driver.findElement(By.id("input-password")).sendKeys(data.get(1).get(4));
	driver.findElement(By.id("input-confirm")).sendKeys(data.get(1).get(5));
	
	
	
	
}

@When("I click on yes radio button")
public void i_click_on_yes_radio_button() {
   driver.findElement(By.xpath("//label[normalize-space()='Yes']//input[@name='newsletter']")).click();
}

@When("I click on Privacy policy")
public void i_click_on_privacy_policy() {
   
	driver.findElement(By.name("agree")).click();
}

@When("I click on Continue button")
public void i_click_on_continue_button() {
    driver.findElement(By.xpath("//input[@value='Continue']")).click();
}

@Then("I should able to Register into application")
public void i_should_able_to_register_into_application() {
    
	Assert.assertTrue(driver.getCurrentUrl().contains("account/success"),"Register Fail");
	System.out.println("Register completed!");
	String text=driver.findElement(By.xpath("//h1[normalize-space()='Your Account Has Been Created!']")).getText();
	System.out.println(text);
}

}
