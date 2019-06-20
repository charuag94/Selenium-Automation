package automation;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ComboClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Besant Java class\\selenium libraries\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.get("file:///C:/Users/charu.agrawal/Downloads/combo.html");
		
		List<WebElement> wb=d.findElements(By.tagName("option"));
		ArrayList<String> as=new ArrayList<String>();
		
		for(WebElement s:wb) {
			
			as.add(s.getText());
		}
		
		for(String items:as)
			System.out.println(items);
		
		Select se=new Select(d.findElement(By.name("cars")));
		se.selectByVisibleText(as.get(1));
		se.selectByVisibleText(as.get(2));
		se.selectByVisibleText(as.get(3));
		se.selectByVisibleText(as.get(4));
		se.selectByVisibleText(as.get(5));
		se.deselectAll();

		
		
	}

}
