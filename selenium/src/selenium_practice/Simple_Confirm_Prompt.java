package selenium_practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simple_Confirm_Prompt {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", 
				
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		//simple
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Alert a = driver.switchTo().alert();
		a.accept();
		Thread.sleep(4000);
		
		//confirm
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']")).click();
		Thread.sleep(3000);
		Alert b = driver.switchTo().alert();
		//b.accept();
		b.dismiss();
		//prompt
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Thread.sleep(4000);
		
		Alert c = driver.switchTo().alert();
        String text =	c.getText();
        c.sendKeys("ragu");
        System.out.println(text);
		c.accept();
		
	}

}
