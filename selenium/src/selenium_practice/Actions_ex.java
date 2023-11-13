package selenium_practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_ex {
	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver",
				
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		
	//	WebElement a = driver.findElement(By.xpath("//a[@data-pid='23'][1]"));
		WebElement a = driver.findElement(By.xpath("//a[@data-pid='2'][1]"));
		
		Actions ax = new Actions(driver);
		
	//	ax.click(a).build().perform();
		
		
		ax.contextClick(a).build().perform();
		
		
		
		
		Robot r = new Robot();
		
		
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
	}

}
