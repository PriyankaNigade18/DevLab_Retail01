package helper;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility {

	//*****************Explicit Wait****************************
	public static WebElement waitForPresenceOfElement(WebDriver driver,By loc)
	{
		WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(10));
		return wait1.until(ExpectedConditions.presenceOfElementLocated(loc));
	}
	
	
	public static WebElement waitForVisibilityOfElement(WebDriver driver,By loc)
	{
		WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(10));
		return wait1.until(ExpectedConditions.visibilityOfElementLocated(loc));
	}
	
	public static WebElement waitForElementToClick(WebDriver driver,By loc)
	{
		WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(10));
		return wait1.until(ExpectedConditions.elementToBeClickable(loc));
	}
	//********************Dropdown****************************
	public static void dynamicDropdown(WebDriver driver,By loc,String value)
	{
		//list of options
				List<WebElement> allOptions=driver.findElements(loc);
				
				System.out.println("Total Options are: "+allOptions.size());
				
				for(WebElement i:allOptions)
				{
					System.out.println(i.getText());
					if(i.getText().contains(value))
					{
						i.click();
						break;
					}
				}
				
	}
	
	
	
	//Select Based Drop down
	
	public static void selectWithIndex(WebElement ele,int index)
	{
		Select s1=new Select(ele);
		s1.selectByIndex(index);
		
	}
	
	public static void selectWithValue(WebElement ele,String value)
	{
		Select s1=new Select(ele);
		s1.selectByValue(value);
		
	}
	
	public static void selectWithText(WebElement ele,String text)
	{
		Select s1=new Select(ele);
		s1.selectByVisibleText(text);
		
	}
	
	
	
	public static void selectBasedDropdown(WebElement ele,String value)
	{
		//select class
				Select dd=new Select(ele);
				
				System.out.println("Is dropdown support multiple selection?: "+dd.isMultiple());
				
				List<WebElement> allOptions=dd.getOptions();
				System.out.println("Total Options are: "+allOptions.size());
				
				for(WebElement i:allOptions)
				{
					System.out.println(i.getText());
					if(i.getText().contains(value))
					{
						i.click();
						break;
					}
				}
	}
}
