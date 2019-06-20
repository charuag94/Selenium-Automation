package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"E:\\Besant Java class\\selenium libraries\\chromedriver_win32\\chromedriver.exe");
		// WebDriver d = new ChromeDriver();
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.facebook.com/");
		WebElement first = d.findElement(By.id("u_0_j"));
		first.sendKeys("charu");
		WebElement last = d.findElement(By.id("u_0_l"));
		last.sendKeys("Agrawal");
		WebElement gender = d.findElement(By.id("u_0_9"));
		gender.click();
		if (gender.isSelected()) {
			System.out.println("click has happened for male" + gender);
		}

		else {

			System.out.println("Click didn't work for male");
		}                                                     

		WebElement gender2 = d.findElement(By.id("u_0_a"));
		gender2.click();

		if (gender2.isSelected()) {
			System.out.println("click has happened for female" + gender + "......." + gender2);
		}

		else {

			System.out.println("Click didn't work for female");
		}

		WebElement day = d.findElement(By.id("day"));
		Select s = new Select(day);
		s.selectByValue("3");
		WebElement month = d.findElement(By.id("month"));
		Select s2 = new Select(month);
		s2.selectByIndex(4);
		WebElement year = d.findElement(By.id("year"));
		Select s3 = new Select(year);
		s3.selectByVisibleText("2019");

		// WebElement signup = d.findElement(By.className("_6j mvm _6wk _6wl _58mi _3ma
		// _6o _6v"));
		// WebElement signup =d.findElement(By.xpath("//button[text()='Sign Up']"));
		// WebElement signup =d.findElement(By.xpath("//button[@class='_6j mvm _6wk _6wl
		// _58mi _3ma _6o _6v']"));
		// WebElement signup =d.findElement(By.xpath("//button[@id='u_0_11']"));
		// WebElement signup=
		// d.findElement(By.cssSelector("button._6j.mvm._6wk._6wl._58mi._3ma._6o._6v"));
		WebElement signup = d.findElement(By.cssSelector("button[name='websubmit']"));
		signup.click();

	}

}
