package automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"E:\\Besant Java class\\selenium libraries\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("file:///E:/Besant%20Java%20class/iframe.html");
		
		WebElement month= d.findElement(By.xpath("//button[text()='Month']"));
/*		Actions a=new Actions(d);
		a.moveToElement(month).perform();
*/		WebElement value=d.findElement(By.xpath("//a[text()='February']"));
//		value.click();
		
		Actions builder=new Actions(d);
		Action act=builder.moveToElement(month).moveToElement(value).click().build();
		act.perform();

		WebElement double_click=d.findElement(By.id("dblClkButton_01"));
		builder.doubleClick(double_click).perform();
		
		Alert alt=d.switchTo().alert();
		alt.accept();
		
	
	}

}
