package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"E:\\Besant Java class\\selenium libraries\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		
		d.get("https://www.flipkart.com/");
		/*WebElement cancel=d.findElement(By.className("_2AkmmA _29YdH8"));
		cancel.click();  //org.openqa.selenium.InvalidSelectorException: invalid selector: Compound class names not permitte
		*/
		/*WebElement ID= d.findElement(By.className("_2zrpKA"));
		ID.sendKeys("charuag94@gmail.com");
		WebElement pswd= d.findElement(By.xpath("//input[@type='password']"));
		pswd.sendKeys("CrazyAngel93");
		WebElement submit=d.findElement(By.className("_2AkmmA _1LctnI _7UHT_c"));
		submit.click();
*/
		WebElement cancel= d.findElement(By.cssSelector("button._2AkmmA._29YdH8"));
		cancel.click();
		

	}

}
