package TestPackages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;




public class SummerNote {

	WebDriver driver;
	
	
	
	@Test
	public void Summer()
	{
		
		System.setProperty("webdriver.chrome.driver",".//MyDrivers//chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Accordion.html");
		
		
		
		
	}
}
