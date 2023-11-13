package selenium_practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser { 
	public static void main(String[] args) throws IOException {
		
		
		System.setProperty("webdriver.chrome.driver", 
				
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");

	WebElement email =	driver.findElement(By.name("email"));
	email.sendKeys("1234@gmail.com");
		
		
	WebElement passwd =	driver.findElement(By.id("pass"));
	passwd.sendKeys("123456778");
		
		
		
	WebElement login =	driver.findElement(By.name("login"));
	login.click();
		
		
		

 	TakesScreenshot ts = (TakesScreenshot) driver;
 	
 	File source = ts.getScreenshotAs(OutputType.FILE);
 	
 	File destination = new File("C:\\Users\\Change-This-Username\\eclipse-workspace\\selenium\\screenshot\\fbdemo1.png");
 	
 	FileUtils.copyFile(source, destination);
 	
 	
 
		
		
		
		
		
	}

}
