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
import org.openqa.selenium.support.ui.Select;

public class Screenshot {
	
	
public static void main(String[] args) throws InterruptedException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver",
				
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("ragu");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("ragu");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("8438904340");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("12345678asdfgf");
		Thread.sleep(3000);
		
		
	    WebElement day = driver.findElement(By.id("day"));
		Select s = new Select(day);
		s.selectByValue("26");
		Thread.sleep(3000);
		
        WebElement month =  driver.findElement(By.id("month"));
		Select s2 = new Select(month);
		s2.selectByVisibleText("Apr");
		Thread.sleep(3000);
		
	    WebElement year =	driver.findElement(By.id("year"));
		Select s3 = new Select(year);
		s3.selectByValue("1996");
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.name("websubmit")).click();
     	Thread.sleep(1000);
		
     	
     	
     	TakesScreenshot ts = (TakesScreenshot) driver;
     	
     	File source = ts.getScreenshotAs(OutputType.FILE);
     	
     	File destination = new File("C:\\Users\\Change-This-Username\\eclipse-workspace\\selenium\\screenshot\\fbdemo5.png");
     	
     	FileUtils.copyFile(source, destination);
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
		
	}	

}
