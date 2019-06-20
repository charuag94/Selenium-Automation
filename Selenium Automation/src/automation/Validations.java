package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"E:\\Besant Java class\\selenium libraries\\chromedriver_win32\\chromedriver.exe");
		//WebDriver d = new ChromeDriver();
		ChromeDriver d=new ChromeDriver();
		

		d.get("https://www.facebook.com/");
		String expected="facebook";
		String actual=d.getTitle();
		if(expected.equals(actual)) {
			System.out.println("Testcase passed");
			System.out.println("expected output is "+expected);
		}
		else {
			System.out.println("Testcase failed");
			System.out.println("actual output is : " +actual );
		}
	}

}
