package selenium_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortablepractice {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Change-This-Username\\eclipse-workspace\\selenium\\chrome101\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/sortable.html");
		List<WebElement> elements = driver.findElements(By.xpath("//ul[@id='sortable']/li"));
		WebElement fromElement = elements.get(6);
		WebElement toeElement = elements.get(0);
		Actions actions = new Actions(driver);
		actions.clickAndHold(fromElement).moveToElement(toeElement).release(toeElement).build().perform();
		
	}

}
