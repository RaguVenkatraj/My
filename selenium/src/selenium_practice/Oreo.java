package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Oreo {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Change-This-Username\\eclipse-workspace\\selenium\\chrome101\\chromedriver.exe");
		
	
		WebDriver driver = new ChromeDriver();
		Thread.sleep(5000);
		driver.get("https://www.oreo.com/");
		driver.findElement(By.cssSelector("[stroke-linecap='round']")).click();
		
	}

}
