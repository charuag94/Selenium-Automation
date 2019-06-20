package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"E:\\Besant Java class\\selenium libraries\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.google.com/");
		
		WebElement search=d.findElement(By.cssSelector("input.gLFyf.gsfi"));
		search.sendKeys("besant technologies");
		
		WebElement select=d.findElement(By.cssSelector("li.sbct.sbhl"));
		select.click();
		
		WebElement google_search=d.findElement(By.name("btnK"));
		google_search.click();
		
	}

}
