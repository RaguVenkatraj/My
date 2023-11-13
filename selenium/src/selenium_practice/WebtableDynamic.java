package selenium_practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableDynamic {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Change-This-Username\\eclipse-workspace\\selenium\\chrome101\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/table.html");

		List<WebElement> columns = driver.findElements(By.tagName("th"));
		int columncount = columns.size();
		System.out.println("no of columns " + columncount);

		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		int rowcount = rows.size();
		System.out.println("no of rows " + rowcount);
		WebElement percent = driver
				.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
		String text = percent.getText();
		System.out.println(text);
		List<WebElement> allprogress = driver.findElements(By.xpath("//td[2]"));
		List<Integer> numberList = new ArrayList<Integer>();
		for (WebElement webElement : allprogress) {
			String individualvalue = webElement.getText().replace("%", "");

			numberList.add(Integer.parseInt(individualvalue));

		}
		System.out.println(numberList);
		int smallvalue = Collections.min(numberList);
		System.out.println(smallvalue);

		String smallvaluestring = Integer.toString(smallvalue) + "%";
		String finalXpath = ("//td[normalize-space()=" + "\"" + smallvaluestring + "\"" + "]" + "//following::td[1]");
		System.out.println(finalXpath);
		WebElement findElement = driver.findElement(By.xpath(finalXpath));
		findElement.click();
		System.out.println("task done");

	}

}
