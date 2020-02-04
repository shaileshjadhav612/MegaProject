package TestPackages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.CopyUtils;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class takescreenshot {
	
	public WebDriver driver;
	public void takesscreenshot(String filepaths) throws IOException
	{
		TakesScreenshot tcs = (TakesScreenshot)driver;
		File scr = tcs.getScreenshotAs(OutputType.FILE);
		File dst = new File(filepaths);
		FileUtils.copyFile(scr, dst);
	}

	@Test
	public void screenshot() throws IOException
	{   System.setProperty("webdriver.gecko.driver",".\\MyDrivers\\geckodriver.exe");
	   driver= new FirefoxDriver();
	   driver.get("https://www.seleniumhq.org/");
	   driver.manage().window().maximize();
	   takesscreenshot("D:\\scrrenshots\\sr.png");
	   
	   
	   
	   driver.quit();
	}
}
