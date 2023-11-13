package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_dropdown {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Change-This-Username\\eclipse-workspace\\selenium\\chrome101\\chromedriver.exe");
				
				
				
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/dropdowns");
		
		
		
		WebElement hero = driver.findElement(By.id("superheros"));
		
		
		
	Select s = new Select(hero);
	
		Thread.sleep(7000);
		
		Boolean  b = s.isMultiple();
		
	    System.out.println(b);
		
		System.out.println("yes multiple");
		
		
java.util.List<WebElement> sp =	s.getOptions();
		
		for (WebElement print : sp) {
			System.out.println(print.getText());
			
		}
		
		
		int size = sp.size();
	System.out.println(size);
		
		//System.out.println("select index");
		Thread.sleep(3000);
		for (int i = 0; i <=size; i++)
		{
			if (i==10 || i==15 || i==20)
			{
				s.selectByIndex(i);
		
			}
			
			}
	System.out.println("get all selected options");
	
	java.util.List<WebElement> a = s.getAllSelectedOptions();
	Thread.sleep(3000);
	for (WebElement we : a) {
		System.out.println(we.getText());
	}
	
	
	WebElement first = s.getFirstSelectedOption();
	
	String text = first.getText();
	
	System.out.println(text);
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
