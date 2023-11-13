package selenium_practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicxpathMeesho{

	public static void main(String [] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Change-This-Username\\eclipse-workspace\\selenium\\chrome101\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.myntra.com/men-casual-shirts");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		List<WebElement> allprices = driver.findElements(By.xpath("//span[@class='product-strike']//preceding-sibling::span"));
		ArrayList<Integer> a = new ArrayList<Integer>();
		for (int i = 0; i < allprices.size(); i++) {
			String replaceAll = allprices.get(i).getText().replaceAll("Rs. ", "");
			int parseInt = Integer.parseInt(replaceAll);
			a.add(parseInt);

			
		}
		
		int size = a.size();
		System.out.println(size);
		
		System.out.println(Collections.min(a));
		System.out.println(Collections.max(a));
	}
	}


