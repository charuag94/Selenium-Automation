package automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReadConfig {

	public static void main(String[] args) throws IOException, AWTException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\charu.agrawal\\eclipse-workspace\\Selenium Automation\\src\\com.config.properties");
		Properties p = new Properties();
		p.load(fis);
		String s = p.getProperty("browser");
		System.out.println(s);
		String s2 = p.getProperty("url");
		System.out.println(s2);
		System.setProperty("webdriver.chrome.driver",
				"E:\\Besant Java class\\selenium libraries\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get(s2);

		WebDriverWait wait = new WebDriverWait(d, 20);
		WebElement id = d.findElement(By.id("email"));
		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(id));
		ele.sendKeys(p.getProperty("username"));
		// id.sendKeys(p.getProperty("username"));

		WebElement pswd = d.findElement(By.id("pass"));
		pswd.sendKeys(p.getProperty("password"));
		WebElement click = d.findElement(By.xpath("//input[@value='Log In']"));
		click.sendKeys(Keys.ENTER);

		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);

		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement settings = d.findElement(By.id("userNavigationLabel"));
		settings.click();

		// WebElement logout=d.findElement(By.xpath("//span[text()='Log Out']"));
		WebElement logout = d.findElement(By.xpath("//span[@class='_54nh'][text()='Log Out'"));
		logout.click();
		


	}

}
