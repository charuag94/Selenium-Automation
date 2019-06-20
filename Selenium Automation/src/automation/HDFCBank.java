package automation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HDFCBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"E:\\Besant Java class\\selenium libraries\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();

		try {

			WebElement popUp = driver.findElement(By.className("popupCloseButton"));

			if (popUp.isEnabled()) {

				popUp.click();
			}


		} catch (

		Exception e) {
			System.out.println(e);
		}
		
		finally
		{
			WebElement login = driver.findElement(By.id("loginsubmit"));

			login.click();
			String parent = driver.getWindowHandle();
			System.out.println("parent window session id is " + parent);

			Set<String> childs = driver.getWindowHandles();

			for (String window : childs) {

				driver.switchTo().window(window);
				System.out.println(window);
			}
			System.out.println(driver.getTitle());
			driver.close();
			driver.switchTo().window(parent);
			System.out.println(driver.getTitle());
		}

	}
}
