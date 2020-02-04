package TestPackages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DesiredCapabilities {
	
	public WebDriver driver;
	@Test
	public void Capabilities()
	{
		System.setProperty("webdriver.chrome.driver",".//MyDrivers//chromedriver.exe");
		
		DesiredCapabilities cs = new DesiredCapabilities();
		cs.
		driver=new ChromeDriver();
		
		
		
	}

}
