package automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"E:\\Besant Java class\\selenium libraries\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.easemytrip.com/");
		WebElement search = d.findElement(By.className("src_btn"));
		search.click();
		Alert alt=d.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		
	}

}
