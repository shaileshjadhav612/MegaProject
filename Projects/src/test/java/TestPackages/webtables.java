package TestPackages;



import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public class webtables {
	
	
	public WebDriver driver;
	@Test
	public void readingvalues() throws IOException, InterruptedException
	{
		//Headless Browser
	//System.setProperty("webdriver.chrome.driver",".//MyDrivers//chromedriver.exe");		
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--headless");
//		driver= new ChromeDriver(options);
		
//		FirefoxOptions options = new FirefoxOptions();
//		options.addArguments("--headless");
		System.setProperty("webdriver.gecko.driver",".//MyDrivers//geckodriver.exe");
//		driver = new FirefoxDriver(options);
//	driver= new ChromeDriver();
		
		driver=new FirefoxDriver();
		driver.get("http://testingpool.com/data-types-in-java/");
		driver.manage().window().maximize();
	//	options.getCapability("webdriver.load.strategy");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
				js.executeScript("alert('********Welcome shailesh********');");   
				Thread.sleep(6000);
				driver.switchTo().alert().accept();
				
				File fs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				File Des = new File("d://screenshots//w.png");
				FileUtils.copyFile(fs, Des);
				
		List<WebElement> ele = driver.findElements(By.xpath("//div[@class='su-table']//tr//td[2]"));
		for (WebElement webElement : ele) {
			
			System.out.println(webElement.getText());
			
		}
		
		
		
		driver.quit();
	}

}
