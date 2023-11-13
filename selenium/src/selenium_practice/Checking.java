package selenium_practice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checking {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Change-This-Username\\eclipse-workspace\\selenium\\chrome101\\chromedriver.exe");
				
		
		WebDriver driver = new ChromeDriver();
		  Thread.sleep(3000);
		driver.get("https://www.instagram.com/");

       Thread.sleep(5000);		
		
//		String a =	driver.getCurrentUrl();
//		System.out.println(a);
//		  Thread.sleep(3000);
//		String b = driver.getTitle();
//		System.out.println(b);
//		  Thread.sleep(3000);
//		 WebElement header = driver.findElement(By.xpath("//p[text()='Get the app.']"));
//		String text = header.getText();
//        System.out.println(text);
//	
	
		
//		email.sendKeys("raguvenkat1996@gmail.com");
//		 Thread.sleep(3000);
	WebElement password =	driver.findElement(By.xpath("//input[@name='password']"));
      boolean displayed = password.isDisplayed();
      System.out.println(displayed);
//		password.sendKeys("ragu1996");
//		 Thread.sleep(3000);
//	WebElement login =	driver.findElement(By.xpath("//button[@type='submit']"));
//		login.click();
	}

}
