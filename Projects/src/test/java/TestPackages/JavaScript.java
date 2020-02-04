package TestPackages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class JavaScript {
	
	public static WebDriver driver;
	
	public static void Takescreenshot() throws IOException
	{
		TakesScreenshot tcs = (TakesScreenshot)driver;
		File scr = tcs.getScreenshotAs(OutputType.FILE);
		File dst = new File("D:\\scrrenshots\\w.png");
		FileUtils.copyFile(scr, dst);
	}
	@Test()
	@Parameters({"showdata"})	
	public static void JavaScriptMethods(@Optional ("Reality") String showdata) throws InterruptedException, IOException
	{
		
		System.setProperty("webdriver.gecko.driver", ".//MyDrivers//geckodriver.exe");
		
		
		
		driver=new FirefoxDriver();
		driver.get("http://testingpool.com/data-types-in-java/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;

		js.executeScript("alert('********Welcome shailesh********');");   		
		Thread.sleep(6000);			
		driver.switchTo().alert().accept();
		js.executeScript("window.scrollBy(0,900)", "");		
		Takescreenshot();
		System.out.println("***********"+showdata);
		
		
		
		
		
		
		driver.quit();
	}

}
