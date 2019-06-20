package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "E:\\Besant Java class\\selenium libraries\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.amazon.in/");
		
		WebElement mousehover=d.findElement(By.id("nav-link-yourAccount"));
		Actions builder=new Actions(d);
		builder.moveToElement(mousehover).perform();
		
		WebElement signIn=d.findElement(By.className("nav-action-inner"));
		signIn.click();
	}

}
