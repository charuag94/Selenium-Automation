package automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ThrowsExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties pro=new Properties();
		File f=new File("C:\\Users\\charu.agrawal\\eclipse-workspace\\Selenium Automation\\data.properties");
		FileInputStream s=new FileInputStream(f);
		pro.load(s);
		System.out.println(pro.getProperty("name"));
		
		
	}

}
