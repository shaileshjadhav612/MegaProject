package mavenTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstClass {
	
	@Test(enabled=true,priority=0)
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C://Users//shailesh.jadhav//git//MegaProject//mavenTest//DriversExecutebleFiles//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://testing-mpt.realitypremedia.co.in/?lang=en");
		driver.manage().window().maximize();
		driver.quit();
	}
	@Test(enabled=true,priority=1)
	public void closebrowser() {
		
		System.out.println("TESTCASE COMPLTE");
	}

}
