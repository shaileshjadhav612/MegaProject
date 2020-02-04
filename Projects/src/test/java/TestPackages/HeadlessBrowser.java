package TestPackages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class HeadlessBrowser {
	
	
	public WebDriver driver;
	
	@Test
	public void HeadlessBR()
	{
		
		
		System.setProperty("webdriver.chrome.driver",".//MyDrivers//chromedriver.exe");		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		driver= new ChromeDriver(options);
		driver.get("https://www.keycdn.com/blog/headless-browsers");
		driver.manage().window().maximize();
		
		
		System.out.println("************************"+driver.getTitle());
		driver.quit();
		
		
	}
	
	
	
	
	

}
