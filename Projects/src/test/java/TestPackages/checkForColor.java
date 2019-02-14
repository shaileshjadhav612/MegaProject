package TestPackages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class checkForColor {
	
	
	public void SelectBrands(String BrandName) throws InterruptedException
	{
		Mp.driver.findElement(By.xpath("//div[contains(@id,'brandsWrapper')]//span[contains(.,'Brands')]")).click();
		
		Thread.sleep(4000);
		
		Reporter.log("clicking on brand name");
		List<WebElement> BrandNames = Mp.driver.findElements(By.xpath("//li[contains(@class,'ng-scope')]"));
		
		List<WebElement> Brands = Mp.driver.findElements(By.xpath("//li[contains(@class,'ng-scope')]//input[contains(@type,'checkbox')]"));
		
		
		int count=Brands.size();
		
		int count2 = BrandNames.size();
		
		
		for (int i=0;i<count2;i++) {
			
			WebElement Brand = Brands.get(i);
			WebElement BrandNam = BrandNames.get(i);
			String BrandedNammeText = BrandNam.getText();
			
			
			
			if(BrandedNammeText.equalsIgnoreCase(BrandName))
			
			{    //Brands.get(i).click();
			System.out.println("**************"+BrandedNammeText);
			for (int j=0;j<count;j++) {
				if(j==i)
				{
					
					Brand.click();
					
				    Mp.driver.findElement(By.xpath("//input[contains(@class,'filter_submit fl')]")).click();	
				}
				
				
			}
			}
				
			
//			else
//				break;
			
		}
	}
	
	public static Map<String,Map<String,String>> LoadExcel() throws IOException
	{
		
		File file = new File("C://Users//shailesh.jadhav//Documents//StringPass.xls");
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
	
		mpt Mp = new mpt();
		@Test
		public void chckColor() throws Exception
		{
			
			Mp.setup();
			
		Mp.driver.get("http://192.168.101.35/Vinay/job%20tracker%20git/Reality.JobTrackingUtility/jobTrackerUI/#/loginpage");
		Mp.driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Mp.driver.findElement(By.xpath("//input [@name='username']")).sendKeys("admin@realitypremedia.com");
		Mp.driver.findElement(By.xpath("//input [@name='password']")).sendKeys("Pass#123");
		Mp.driver.findElement(By.xpath("//button[@class='login-btn']")).click();
		WebDriverWait wait=new WebDriverWait(Mp.driver, 30);
		SelectBrands("Robert Mondavi");
		
		String color = Mp.driver.findElement(By.xpath("(//li[@class='half_width td']//span[contains(@class,'upload_status_orange upload_status_green')])[1]")).getCssValue("background-color");
		
		System.out.println("************"+color);
		Assert.assertEquals(color, getValue("greencolour"));
		System.out.println("*******colour is verified ");Mp.driver.quit();
		
		
		}

}
