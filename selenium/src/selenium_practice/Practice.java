package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
	
	
	public static void main(String[] args) {
		
		
   System.setProperty("webdriver.chrome.driver",
		  
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");

		
		
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("addddd@gmail.com");
		
		
		WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
		password.sendKeys("hshshsh");
		
		
		WebElement login = driver.findElement(By.xpath("//button[contains(@name,'login')]"));
		login.click();
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
