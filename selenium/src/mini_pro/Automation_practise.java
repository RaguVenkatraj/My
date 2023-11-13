package mini_pro;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;

public class Automation_practise {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		
		System.setProperty("webdriver.chrome.driver",
				
		
		
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(80,TimeUnit.MILLISECONDS);
		driver.get("http://automationpractice.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@title='Log in to your customer account']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("email")).sendKeys("raguvenkat1996@gmail.com");
		Thread.sleep(3000);
		
		driver.findElement(By.id("passwd")).sendKeys("ragu1996");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[@class='icon-lock left']")).click();
		
		
		WebElement women = driver.findElement(By.xpath("//a[text()='Women'][1]"));
		Thread.sleep(3000);
		
		Actions s = new Actions(driver);
		s.contextClick(women).build().perform();
		
		Robot r = new Robot();
		Thread.sleep(3000);
		
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		driver.findElement(By.xpath("//a[text()='Tops'][1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@class='replace-2x img-responsive'][1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Add to cart']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@name='processAddress']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@name='processCarrier']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title='Pay by bank wire']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']")).click();
		
		//screenshot
	 	
     	TakesScreenshot ts = (TakesScreenshot) driver;
     	
     	File source = ts.getScreenshotAs(OutputType.FILE);
     	
     	File destination = new File("C:\\Users\\Change-This-Username\\eclipse-workspace\\selenium\\screenshot\\conform.png");
     	
     	FileUtils.copyFile(source, destination);
     	
     	
		
		
		
		
	}

}
