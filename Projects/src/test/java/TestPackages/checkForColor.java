package TestPackages;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.maven.shared.utils.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.assertthat.selenium_shutterbug.core.Shutterbug;
import com.assertthat.selenium_shutterbug.utils.web.ScrollStrategy;
import com.google.common.base.Verify;

import net.bytebuddy.build.HashCodeAndEqualsPlugin.WithNonNullableFields;
import ru.yandex.qatools.ashot.AShot;

public class checkForColor {
	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	mpt Mp = new mpt();
    public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

                File DestFile=new File(fileWithPath);

                //Copy file at destination

                FileUtils.copyFile(SrcFile, DestFile);

    }
	
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
	
	
		
		@Test
		public void chckColor() throws Exception
		{
			
        	Mp.setup();
	//		FlashObjectWebDriver flashApp = new FlashObjectWebDriver(Mp.driver, "myFlashMovie");
		Mp.driver.get("http://192.168.101.35/Vinay/job%20tracker%20git/Reality.JobTrackingUtility/jobTrackerUI/#/loginpage");
		Mp.driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Mp.driver.findElement(By.xpath("//input [@name='username']")).sendKeys("admin@realitypremedia.com");
		Mp.driver.findElement(By.xpath("//input [@name='password']")).sendKeys("Pass#123");
		Mp.driver.findElement(By.xpath("//button[@class='login-btn']")).click();
		WebDriverWait wait=new WebDriverWait(Mp.driver, 30);
		takeSnapShot(Mp.driver, "D://screenshot/s.png") ;
		SelectBrands("Robert Mondavi");
	     
		String color = Mp.driver.findElement(By.xpath("(//li[@class='half_width td']//span[contains(@class,'upload_status_orange upload_status_green')])[1]")).getCssValue("background-color");
		
		System.out.println("************"+color);
		Assert.assertEquals(color, getValue("greencolour"));
		takeSnapShot(Mp.driver, "D://screenshot/s.png") ;
		js.executeScript("window.scrollBy(0,1000)", "");
		System.out.println("*******colour is verified ");Mp.driver.quit();
		
		
		}

}
