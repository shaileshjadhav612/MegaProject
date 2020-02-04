package TestPackages;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Automate {
	
	
	WebDriver driver;
	compairingcolumn cc = new compairingcolumn();
	
	public static Map<String,Map<String,String>> LoadExcel() throws IOException
	{
		
		File file = new File("C:\\Users\\shailesh.jadhav\\Documents\\DemoTesting.xls");
		FileInputStream fis = new FileInputStream(file);
		HSSFWorkbook wb = new HSSFWorkbook(fis);
		HSSFSheet sheet = wb.getSheet("Sheet1");
		int RowCount = sheet.getLastRowNum()+1;
		Map<String,Map<String,String>> supermap = new HashMap<String,Map<String,String>>();
		Map <String,String> map =new HashMap<String,String>();
		
		for(int i=0;i<RowCount;i++)
		{
			String key=sheet.getRow(i).getCell(0).getStringCellValue();
			String value=sheet.getRow(i).getCell(1).getStringCellValue();
			map.put(key,value);
		} 			
		 supermap.put("superkey",map);
		return supermap;
	}
	public static String getValue(String key) throws IOException
	{
		Map <String,String> myvalue = LoadExcel().get("superkey");
		String value = myvalue.get(key);
		return value;
	}
	
	@Test
	public void automationWebsite() throws IOException, InterruptedException
	{
		//System.setProperty("webdriver.chrome.driver",".//MyDrivers//chromedriver.exe");
		System.setProperty("webdriver.gecko.driver",".//MyDrivers//chromedriver.exe");
//		driver=new ChromeDriver();
//		driver.get("https://accounts.google.com/ServiceLogin/identifier?passive=1209600&continue=https%3A%2F%2Faccounts.google.com%2FManageAccount&followup=https%3A%2F%2Faccounts.google.com%2FManageAccount&flowName=GlifWebSignIn&flowEntry=AddSession");
//		driver.manage().window().maximize();
//		//driver.findElement(By.xpath("//button[@id='submitbtn']")).click();
//		driver.findElement(By.xpath("//span[contains(.,'Next')]")).click();
//		  
//		String gettext=driver.findElement(By.xpath("//div[contains(@class,'GQ8Pzc') and contains (.,'Enter an email or phone number')]")).getText();
//		System.out.println("**********"+gettext);
//		System.out.println("**********"+getValue("MyText"));
//		assertEquals(gettext, getValue("MyText"));
		


 WebDriver driver = new FirefoxDriver();
 
 driver.get("http://toolsqa.com/iframe-practice-page/");
 driver.manage().window().maximize();
 //First find the element using any of locator stratedgy
 JavascriptExecutor js = (JavascriptExecutor) driver;
 js.executeScript("window.scrollBy(0,1000)","");
 //now use the switch command
 driver.switchTo().frame(0);
 Thread.sleep(3000);
 
// WebElement iframeElement = driver.findElement(By.id("IF1"));
//
// System.out.println("***********"+iframeElement.getText());
 
 //Do all the required tasks in the frame 0
 //Switch back to the main window
 driver.switchTo().defaultContent();
 //System.out.println("*****************************"+getValue("MyText"));
 
 System.out.println("*****************************"+getValue("BOOKS"));
 driver.quit();
		
		
		
		
		
		
		
		
		
		driver.quit();
	}

}
