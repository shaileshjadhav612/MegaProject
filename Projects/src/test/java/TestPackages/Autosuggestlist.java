package TestPackages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class Autosuggestlist {
	
	mpt Mp = new mpt();
	checkForColor cp= new checkForColor();
	@Test
	public void autosuggest() throws Exception
	{
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("./MyReports/myreport.html");
		 
		// create ExtentReports and attach reporter(s)
		ExtentReports extent = new ExtentReports();
		
		extent.attachReporter(htmlReporter);
 
		// creates a toggle for the given test, adds all log events under it    
		ExtentTest test = extent.createTest("autosuggest");
 
		
 
		// log(Status, details)
		//test.log(Status.INFO, "Chrome Browser Launched Successfully");
 
	//	Mp.driver.get("http://total-qa.com");
		//test.log(Status.INFO,"Navigated to URL");
 
		//String actual = Mp.driver.getTitle();
		//test.log(Status.INFO, "Actual Title returned :: " + actual);
 
		String expected = "TotalQA - Future of Software Testing";
		//test.log(Status.INFO, "Expected Title returned:: "+ expected);
 
	//	Assert.assertEquals(actual,expected);
 
		// log with snapshot
		test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
 
		// test with snapshot
		test.addScreenCaptureFromPath("screenshot.png");
 
		// calling flush writes everything to the log file
		extent.flush();
		Mp.setup();
		Mp.driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		Actions action = new Actions(Mp.driver);
		JavascriptExecutor js = (JavascriptExecutor) Mp.driver;
		Mp.driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobile");
		Thread.sleep(3000);
		List<WebElement> options = Mp.driver.findElements(By.xpath("//div[@id='suggestions-template']"));
		checkForColor.takeSnapShot(Mp.driver, "D://screenshot/a.png");
		for (int i=0;i<options.size();i++) {
			
			System.out.println("***********"+options.get(i).getText());
			//WebElement option = options.get(i);
			Thread.sleep(2000);
			if(options.get(i).getText().equals("redmi note 7 pro mobiles 2018"))
			{
				System.out.println("****************"+options.get(i).getText());
				options.get(i).click();
				break;
			}
				
			
			}
		checkForColor.takeSnapShot(Mp.driver, "D://screenshot/a1.png");
		js.executeScript("window.scrollBy(0,900)", ""); 
		Thread.sleep(6000);
		
		Mp.driver.quit();
	}
	
	
	
	@Test
	public void display()
	{
	
		Assert.assertEquals("wow", "wooow", "woooooooow");
		System.out.println("*****************excellent******************");
	}

}
