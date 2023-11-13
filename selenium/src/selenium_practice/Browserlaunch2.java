package selenium_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetTitle;

public class Browserlaunch2 {
	
	public static void main(String[] args) {
		
		
	System.setProperty("webdriver.chrome.driver", 
			
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
		
	String a =	driver.getTitle();
		System.out.println(a);
		
		
		
		
		
		
		
		
		
	}

}
