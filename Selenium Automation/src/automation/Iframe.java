package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"E:\\Besant Java class\\selenium libraries\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("file:///E:/Besant%20Java%20class/iframe.html");
		d.manage().window().maximize();
		//d.manage().window().fullscreen();
		d.switchTo().frame("iframe_b");
		WebElement user = d.findElement(By.name("a"));
		user.sendKeys("charu");
		WebElement pswd = d.findElement(By.name("b"));
		pswd.sendKeys("Charu123");
		d.switchTo().defaultContent();

		WebElement userid = d.findElement(By.name("a"));
		userid.sendKeys("charu");
		WebElement pswd2 = d.findElement(By.name("b"));
		pswd2.sendKeys("Charu123");
		
	}

}
