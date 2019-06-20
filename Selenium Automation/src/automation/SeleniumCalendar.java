package automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumCalendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"E:\\Besant Java class\\selenium libraries\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.redbus.in/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
Thread.sleep(10000);
		
		try {
			Robot r= new Robot();
			r.keyPress(KeyEvent.VK_TAB);
			r.keyPress(KeyEvent.VK_TAB);
			r.keyPress(KeyEvent.VK_ENTER);
		} 
		
		catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		WebElement source = driver.findElement(By.xpath("//label[text()='FROM']"));
		source.click();
		source.sendKeys("Delhi");
		Thread.sleep(5000);
		source.sendKeys(Keys.ENTER);

		WebElement destination = driver.findElement(By.xpath("//label[text()='TO']"));
		destination.click();
		destination.sendKeys("Bangalore");
		Thread.sleep(5000);
		destination.sendKeys(Keys.ENTER);

		WebElement date = driver.findElement(By.xpath("//label[text()='Onward Date']"));
		date.click();

		String month = "Oct 2019";
		

		WebElement exact_date=driver.findElement(By.xpath("//div[@class='rb-calendar']/table/tbody/tr/td[text()='19']"));
		WebElement mon=driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[2]"));
		
		while(true) {
			if(mon.getText().contains(month)) {
				break;
			}
			
			else {
				exact_date.click();
			}
				
		}
		

	}

}
