package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dropdown {
	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver",
				
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/drop.html");
		
		
	//	driver.manage().window().maximize();
		
		
        WebElement drag = driver.findElement(By.id("draggable"));
		Thread.sleep(3000);
		
        WebElement drop = driver.findElement(By.id("droppable"));	
        Thread.sleep(3000);
		
		
		Actions a = new Actions(driver);
		a.clickAndHold(drag).moveToElement(drop).release().build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
