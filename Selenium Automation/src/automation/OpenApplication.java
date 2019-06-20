package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Besant Java class\\selenium libraries\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		
		d.get("https://www.flipkart.com/");
		//d.get("https://www.seleniumhq.org/download/");
		//d.findElement(By.id("email"));
		d.findElement(By.className("_2zrpKA"));

	}

}
