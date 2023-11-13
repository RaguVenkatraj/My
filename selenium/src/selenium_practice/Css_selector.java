package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_selector {
	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver",
				
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demo.guru99.com/test/newtours/");
        Thread.sleep(3000);
//		driver.findElement(By.cssSelector("#email")).sendKeys("1234@gmail.com");
//		driver.findElement(By.cssSelector("[type=password]")).sendKeys("asdfgh");
//		
		driver.findElement(By.linkText("REGISTER")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
