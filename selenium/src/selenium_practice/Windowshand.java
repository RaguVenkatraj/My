package selenium_practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windowshand {
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", 
				
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement bs = driver.findElement(By.xpath("//a[text()='Best Sellers'][1]"));
		
		Actions a = new Actions(driver);
		a.contextClick(bs).build().perform();
		Thread.sleep(3000);
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		WebElement mob = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		
		Actions a1 = new Actions(driver);
		a1.contextClick(mob).build().perform();
		
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		WebElement cs = driver.findElement(By.xpath("//a[text()='Customer Service'][1]"));
		
		Actions a2 = new Actions(driver);
		a1.contextClick(cs).build().perform();
		
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		WebElement deals = driver.findElement(By.xpath("//a[text()='Fashion'][1]"));
		
		Actions a3 = new Actions(driver);
		a1.contextClick(deals).build().perform();
		
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		 int size = driver.getWindowHandles().size();
	     System.out.println(size);	
		
		
		
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
		
		Set<String> allid = driver.getWindowHandles();
		
		//System.out.println(allid);

		
		
		for (String cw : allid) {
			String title = driver.switchTo().window(cw).getTitle();
			System.out.println(title);
		}
		
		//to change to window
		String actualtitle = "Amazon.in Bestsellers: The most popular items on Amazon";
		
		for (String cw : allid) {
			if (driver.switchTo().window(cw).getTitle().equals(actualtitle)) {
				//break;
				
			}
			System.out.println();
		}
		
//		for (String cw : allid) {
//			if (cw.equals(parent)) {
//				driver.switchTo().window(cw);
//			}
//		}
//		
		
		
		
	}

}
