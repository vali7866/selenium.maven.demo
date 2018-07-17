package selenium.maven.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class facebook {

	@Test
	public void TestFireFox(){
	 
		System.setProperty("webdriver.chrome.driver", "D:\\T\\chromedriver.exe");
		
		
		
		WebDriver driver=new ChromeDriver();
	 
	
	
	driver.manage().window().maximize();
	 
	driver.get("http://www.facebook.com");
	String s=driver.getTitle();
	System.out.println(s);
	
	driver.quit();
}
}