package selenium_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Printgooglesuggestions {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Change-This-Username\\eclipse-workspace\\selenium\\chrome101\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.get("http://www.google.com");
		WebElement findElement = driver.findElement(By.name("q"));
		findElement.sendKeys("game of thrones");
		List<WebElement> findElements = driver.findElements(By.xpath("//ul[@role='listbox']//following::li"));
		for (WebElement webElement : findElements) {
			System.out.println(webElement.getText());
			
		}
	}

}
