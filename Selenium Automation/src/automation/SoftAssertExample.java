package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {
	
	WebDriver driver;
	
	@Test
	public void verifyHomePage() {
		
		SoftAssert softAssert=new SoftAssert();
		System.setProperty("webdriver.chrome.driver",
				"E:\\Besant Java class\\selenium libraries\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("First started");
		driver.navigate().to("http://google.com");
		softAssert.assertEquals("Google", driver.getTitle(),"I am hard failed");
		
		System.out.println("Hard assert success1");
		softAssert.assertEquals("Google", driver.getTitle());
		System.out.println("Hard assert failed");
		System.out.println("Test caseone executed sucessfully");
		softAssert.assertAll();
		driver.close();
	}

	
}
