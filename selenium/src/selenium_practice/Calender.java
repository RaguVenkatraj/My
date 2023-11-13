package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Change-This-Username\\eclipse-workspace\\selenium\\chrome101\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Calendar.html");
		WebElement box = driver.findElement(By.xpath("//input[@id='datepicker']"));
		box.click();
		
		WebElement next = driver.findElement(By.xpath("//span[text()='Next']"));
		next.click();
		
		WebElement date = driver.findElement(By.xpath("//a[text()=10]"));
		date.click();
	}

}
