package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"E:\\Besant Java class\\selenium libraries\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();

		d.get("https://www.facebook.com/");
		WebElement user_id = d.findElement(By.id("email"));
		user_id.sendKeys("charuag94@gmail.com");
		WebElement user_pwd = d.findElement(By.id("pass"));
		user_pwd.sendKeys("CrazyAngel93");
		// WebElement click = d.findElement(By.id("u_0_3"));
		// click.click();
		WebElement click2 = d.findElement(By.xpath("//input[@value='Log In']"));
		click2.click();

	}

}
