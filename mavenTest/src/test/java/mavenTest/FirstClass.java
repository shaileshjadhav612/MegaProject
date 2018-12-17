package mavenTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstClass {
	
	@Test(enabled=true,priority=0)
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "\\DRIVERS\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");driver.quit();
	}
	@Test(enabled=true,priority=1)
	public void closebrowser() {
		
		System.out.println("TESTCASE COMPLTE");
	}

}
