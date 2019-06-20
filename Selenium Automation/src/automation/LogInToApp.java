package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInToApp {
	
	WebDriver driver;
	
	@Test
	public void testCaseVerifyHomePage() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Besant Java class\\selenium libraries\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("http://google.com");
		String actual=driver.getTitle();
/*		if(actual.equals("Google1")) {
			System.out.println("Test case passed");
		}
		else {
			System.out.println("Test case failed");
		}
*/		
	//	Assert.assertEquals(actual,"Google1");
		Assert.assertEquals(actual,"Google1", "Test case Failed");
		
		
	}
	
	@Test(priority=0)
	public void verifyHomePage() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Besant Java class\\selenium libraries\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("First started");
		driver.navigate().to("http://google.com");
		Assert.assertEquals("Google", driver.getTitle(),"I am haerd failed");
		
		System.out.println("Hard assert success1");
		Assert.assertEquals("Google", driver.getTitle());
		System.out.println("Hard assert failed");
		System.out.println("Test caseone executed sucessfully");
		driver.close();
	}
}
