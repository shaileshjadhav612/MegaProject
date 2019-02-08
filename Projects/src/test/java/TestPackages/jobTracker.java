package TestPackages;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import newPackage.newClass;

public class jobTracker {
	
	public void SearchValue(String SearchValue)
	{
	Mp.driver.findElement(By.xpath("//input[contains(@ng-model,'search_input')]")).sendKeys(SearchValue);
	
	}
	
	public void CountNew()
	{
	List<WebElement> DesignStatus = Mp.driver.findElements(By.xpath("//span[contains(@ng-model,'DesignStat')]"));
	
	int size=DesignStatus.size();
	int count=0;
	for(int i=0;i<size;i++)
	{
		WebElement status = DesignStatus.get(i);
		String statusValue = status.getText();
		System.out.println("**************"+statusValue);
		if(statusValue.contains("New"))
		{
			
			count++;
		}
		else
		
			break;
		
	}
	
	System.out.println("************************New repeated ****** "+count +" *********number of times");   
	}	 
	
	mpt Mp = new mpt();
	@Test
	public void ImportExcelFile() throws Exception
	{
		
		Mp.setup();
		
	Mp.driver.get("http://192.168.101.35/Vinay/job%20tracker%20git/Reality.JobTrackingUtility/jobTrackerUI/#/loginpage");
	Mp.driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	Mp.driver.findElement(By.xpath("//input [@name='username']")).sendKeys("admin@realitypremedia.com");
	Mp.driver.findElement(By.xpath("//input [@name='password']")).sendKeys("Pass#123");
	Mp.driver.findElement(By.xpath("//button[@class='login-btn']")).click();
	WebDriverWait wait=new WebDriverWait(Mp.driver, 30);
	
//	Thread.sleep(6000);
	WebElement element = Mp.driver.findElement(By.xpath("//a[contains(@class,'btn_default fl')]"));
	//WebElement element =  wait.until(ExpectedConditions.visibilityOf(element));
			element.click();
	Mp.driver.findElement(By.xpath("//div[contains(@class,'fsp-select-labels')]")).click();
	//Mp.driver.findElement(By.xpath("//div[contains(@class,'fsp-select-labels')]")).sendKeys("\"C:\\Users\\shailesh.jadhav\\Downloads\\1 (1).tsv\"");
//	File source = new File("\"C:\\Users\\shailesh.jadhav\\Downloads\\1 (1).tsv\"");
//	String snew= source.toString();
	StringSelection stringselection = new StringSelection("C:\\Users\\shailesh.jadhav\\Downloads\\1 (1)");
	
	
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselection,null);
	Thread.sleep(3000);
	//Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
	
   Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	//Thread.sleep(6000);
	
	
	Mp.driver.findElement(By.xpath("//span[@title='Upload']")).click();
	
//	Mp.driver.findElement(By.xpath("//input[contains(@class,'fl ng-pristine ng-valid ng-empty ng-touched')]")).sendKeys("2232325");
//	Mp.driver.findElement(By.xpath("//input[contains(@class,'filter_submit fl')]")).click();
	
//	Scanner input = new Scanner(System.in);
//	System.out.println("**************Enter Search Value : ");
//	String SearchValue = input.nextLine();
	Thread.sleep(5000);
	SearchValue("2213232");
	Thread.sleep(3000);
	Mp.driver.findElement(By.xpath("//input[contains(@class,'filter_submit fl')]")).click();
	Thread.sleep(6000);
	
	CountNew();

	
	
	
	Mp.driver.quit();
	}

}
