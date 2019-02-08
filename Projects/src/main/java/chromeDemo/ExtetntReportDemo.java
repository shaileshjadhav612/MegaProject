package chromeDemo;

import static org.testng.Assert.assertTrue;


import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;



public class ExtetntReportDemo {
	
	
	
	 
	@Test
	public void loginTest()
	{
	
	ExtentHtmlReporter reporter=new ExtentHtmlReporter("./Reports/report.html");
	ExtentReports extent = new ExtentReports();
	extent.attachReporter(reporter);
	
	 ExtentTest logger=extent.createTest("LoginTest");
	 
	 logger.log(Status.INFO,"Login informations");
	 logger.log(Status.PASS,"Title verifired");
	 
	 
	 extent.flush();
	}
	@Test
	public void second()
	{
		ExtentHtmlReporter reporter=new ExtentHtmlReporter("./Reports/report.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		
		 ExtentTest logger2=extent.createTest("second");
		 assertTrue(false);
		 
		
	}
	
	

}
