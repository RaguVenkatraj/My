package selenium_practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hiturlwithoutget {
	
	public static void main(String[] args) {
		String url = "https://www.google.com";
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Change-This-Username\\eclipse-workspace\\selenium\\chrome101\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	//	"window.location='https://www.google.com'"
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.location=\'"+url+"\'");
		
		
	}

}
