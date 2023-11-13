package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver",
				
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor a = (JavascriptExecutor) driver;
		a.executeScript("window.scroll(0,3000)","");
		Thread.sleep(5000);
		a.executeScript("window.scroll(0,-3000)","");
		
		
	WebElement button =	driver.findElement(By.xpath("//a[text()='Canada']"));
	//button.click();
	Thread.sleep(6000);	
		
//	JavascriptExecutor amazon = (JavascriptExecutor) driver;	
	a.executeScript("arguments[0].scrollIntoView(true)",button);
//	Thread.sleep(5000);	
		
	a.executeScript("arguments[0].click()", button);
//	Thread.sleep(5000);	
//	amazon.executeScript("location.reload();");
//		
	
		
		
		
		
		
		
		
		
		
	}

}
