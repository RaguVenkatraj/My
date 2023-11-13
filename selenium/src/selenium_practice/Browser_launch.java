package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class Browser_launch {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Change-This-Username\\eclipse-workspace\\selenium\\chrome101\\chromedriver.exe");
			
		
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://www.gmail.com/");
		
	   Thread.sleep(5000);
		driver.manage().window().maximize();
		
		String a =driver.getTitle();
		System.out.println(a);
		
	    String b =	driver.getCurrentUrl();
		
        System.out.println(b);
    
      //  driver.navigate().to("http:www.facebook.com/");
        
		
//		
//		
//	WebElement email =	driver.findElement(By.name("email"));
//	email.sendKeys("wertufhfjj");	
//	WebElement password = driver.findElement(By.name("pass"));
//	password.sendKeys("12345678");
//	
//	WebElement login = driver.findElement(By.name("login"));
//	login.click();
//	
WebElement box = driver.findElement(By.name("identifier"));
JavascriptExecutor jse = (JavascriptExecutor) driver;

//highlighting and drawing border
//jse.executeScript("arguments[0].setAttribute('style','background: yellow; border:2px brown');", box);



//drawing border
//jse.executeScript("arguments[0].style.border='3px solid red'", box);

	
	}
	

	
	

}
