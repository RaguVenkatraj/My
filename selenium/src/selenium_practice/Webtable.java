package selenium_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Change-This-Username\\eclipse-workspace\\selenium\\chrome101\\chromedriver.exe" );
				
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
		
		System.out.println("----------to print all data--------");
		
		List<WebElement> alldata = driver.findElements(By.xpath("//table/tbody/tr/td"));
		
		
		for (WebElement data : alldata) {
			String all = data.getText();
			System.out.println(all);
		}
		
		System.out.println("---------size--------");
		int size = alldata.size();
		System.out.println(size);
		
		
		
		System.out.println("--------rowdata----------");
		
		
		List<WebElement> rowdata = driver.findElements(By.xpath("//table/tbody/tr[5]/td"));
		
		for (WebElement row : rowdata) {
			String onlyrow = row.getText();
			System.out.println(onlyrow);
		}
		
		
		System.out.println("------------columndata--------------");
		
		List<WebElement> columndata = driver.findElements(By.xpath("//table/tbody/tr/td[4]"));
		
		
		for (WebElement column : columndata) {
			String onlycolumn = column.getText();
			System.out.println(onlycolumn);
		}
		System.out.println("----------size------------");
		int size2 = columndata.size();
		System.out.println(size2);
		
		
		System.out.println("-----------particular-------------");
		
		List<WebElement> rc = driver.findElements(By.xpath("//table/tbody/tr[2]/td[4]"));
		
		for (WebElement only : rc) {
			String parti = only.getText();
			System.out.println(parti);
			
		}
		
		
		
		
		
		
		
		
	}

}
