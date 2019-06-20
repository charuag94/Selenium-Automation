package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTesting {

	@Test
	public void firstSession() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Besant Java class\\selenium libraries\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/?gws_rd=ssl");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("rahul1");
	}
	
	@Test
	public void secondSession() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Besant Java class\\selenium libraries\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/?gws_rd=ssl");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("rahul2");
	}
	@Test
	public void thirdSession() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Besant Java class\\selenium libraries\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/?gws_rd=ssl");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("rahul3");
	}
}
