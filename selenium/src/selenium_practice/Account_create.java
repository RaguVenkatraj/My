package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Account_create {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Change-This-Username\\eclipse-workspace\\selenium\\chrome101\\chromedriver.exe");
			
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
	
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("ragu");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("ragu");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("8438904340");
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("12345678asdfgf");
		Thread.sleep(2000);
		
		
	    WebElement day = driver.findElement(By.id("day"));
		Select s = new Select(day);
		s.selectByValue("26");
		Thread.sleep(2000);
		
        WebElement month =  driver.findElement(By.id("month"));
		Select s2 = new Select(month);
		s2.selectByVisibleText("Apr");
		Thread.sleep(2000);
		
	    WebElement year =	driver.findElement(By.id("year"));
		Select s3 = new Select(year);
		s3.selectByValue("1996");
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("websubmit")).click();
     	Thread.sleep(2000);
	
	}
}
