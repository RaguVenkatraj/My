package selenium_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_ex {
	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver",
				
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		driver.manage().window().maximize();
		
		
		List<WebElement> frames =
				driver.findElements(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[1]/a"));
		Thread.sleep(3000);
		int size = frames.size();
		System.out.println(size);
		
		//WebElement findElement = driver.findElement(By.xpath("//*[@id=\"singleframe\"]"));
		
		
		driver.switchTo().frame("singleframe");
		
		 WebElement findElement1 = driver.findElement(By.xpath("//input[@type='text'][1]"));
	
		findElement1.sendKeys("singleframe");
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		

		driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();
		
		List<WebElement> frame2 = driver.findElements(By.className("analystic"));
		Thread.sleep(3000);
		int size2 = frame2.size();
		System.out.println(size2);
		
		WebElement outer = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		
		driver.switchTo().frame(outer);
		Thread.sleep(3000);
		
		WebElement inner = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html'][1]"));
		driver.switchTo().frame(inner);
		Thread.sleep(3000);
		
	   WebElement text =	driver.findElement(By.xpath("//input[@type='text'][1]"));
		
	   text.sendKeys("multiplrframes");	
		
		
		
		
		
		
		
		
	}

}
