package automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseHover2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"E:\\Besant Java class\\selenium libraries\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/Besant%20Java%20class/iframe.html");
		driver.manage().window().maximize();
		
		Actions s=new Actions(driver);
		
		//  Action hover=s.moveToElement(driver.findElement(By.className("dropdown"))).build();
		
		Action hover=s.moveToElement(driver.findElement(By.className("dropdown"))).moveToElement(driver.findElement(By.xpath("//a[text()='Holi']"))).click().build();
		
		
		
		hover.perform();
		
		Action d=s.doubleClick(driver.findElement(By.id("dblClkButton_01"))).build();
		d.perform();
		
		Alert a=driver.switchTo().alert();
		a.dismiss();
		
		Action ast=s.click(driver.findElement(By.name("a"))).keyDown(driver.findElement(By.name("a")),Keys.SHIFT).sendKeys("charu").contextClick().keyUp(Keys.SHIFT).build();
		ast.perform();
		
		
		
	}

}
