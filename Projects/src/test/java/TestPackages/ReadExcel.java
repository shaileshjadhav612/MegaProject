package TestPackages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.poi.hssf.model.Sheet;
import org.apache.poi.hssf.model.Workbook;
import org.apache.poi.hssf.record.formula.functions.Cell;
import org.apache.poi.hssf.record.formula.functions.Row;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ReadExcel {
	
	
	
	
	WebDriver driver;

	public static Map<String,Map<String,String>> LoadExcel() throws IOException
	{
		
		File file = new File("D://Readdata.xls");
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
	
	
	SoftAssert sf = new SoftAssert();
	
	
	@Test()
	public void integrationTest() throws IOException, AWTException, InterruptedException
	{
//		String [] Bookoptions = {"BOOKS","GENRE","Romance","Biography & Autography","Action, Adventure & Horror"};
//		
////		for(int i=0;i<Bookoptions.length;i++)
////		{
////		System.out.println("************** "+Bookoptions[i]);
////		
////		}
//		for(int i=0;i<Bookoptions.length;i++)
//		{
//		System.out.println("************** "+getValue(Bookoptions[i]));
//		
//		}
		System.setProperty("webdriver.chrome.driver",".\\driversexe\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://epi.alpha.southwestvacations.com/reality-sandbox/shaileshnew/swav_reality_test/destination-landing-template-page/");
		driver.manage().window().maximize();
		WebElement title=driver.findElement(By.xpath("//a[@class='block-buttontext']//preceding::p"));
		
		String text = title.getText();
		System.out.println("*************checking Hero block description************");
		System.out.println("From Webpage : ["+text+"]          From Excelsheet: ["+getValue("a")+"]\n");
		sf.assertEquals(text,  getValue("a"), "Compairision got failure on Hero Block description");
		
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("window.scrollBy(0,4000)");
		Thread.sleep(4000);
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_DOWN);
//		
//		Thread.sleep(9000);
//			robot.keyRelease(KeyEvent.VK_DOWN);
		
		WebElement ClicableBannerHeading=driver.findElement(By.xpath("(//h3[@class='block-title'])[4]"));
		String ClicableBannerHeadingText = ClicableBannerHeading.getText();
		WebElement ClicableBannerHeading2=driver.findElement(By.xpath("(//h3[@class='block-title'])[5]"));
		String ClicableBannerHeadingText2 = ClicableBannerHeading2.getText();
		WebElement ClicableBannerHeading3=driver.findElement(By.xpath("(//h3[@class='block-title'])[6]"));
		String ClicableBannerHeadingText3 = ClicableBannerHeading3.getText();
		
		WebElement CliclcableBanner = driver.findElement(By.xpath("(//div[@class='block-textblock'])[3]"));
		String text1=CliclcableBanner.getText();
		WebElement CliclcableBanner1=driver.findElement(By.xpath("(//div[@class='block-textblock'])[4]"));
		String text2=CliclcableBanner1.getText();
		WebElement CliclcableBanner2=driver.findElement(By.xpath("(//div[@class='block-textblock'])[5]"));
		String text3=CliclcableBanner2.getText();
		
		System.out.println("From Webpage :[ "+ClicableBannerHeadingText+" ]        From Excelsheet: ["+getValue("g")+"]");
		sf.assertEquals(ClicableBannerHeadingText, getValue("g"), "Compairision got failure on ClicableBannerHeadingText First\n");
		
//		Properties data = new Properties();
//		
//		String text55=data.getProperty("First");
//		
//		System.out.println(text55);
		
		System.out.println("From Webpage : ["+text1+"]       From Excelsheet: ["+getValue("y")+"]\n");
		sf.assertEquals(text1, getValue("y"), "Compairision got failure on ClicableBannerContentText First\n");
		
		
		System.out.println("From Webpage :[ "+ClicableBannerHeadingText2+"] From Excelsheet: ["+getValue("i")+"]");
		sf.assertEquals(ClicableBannerHeadingText2, getValue("i"), "Compairision got failure on ClicableBannerHeadingText Second\n");
		
		System.out.println("From Webpage : ["+text2+"]        From Excelsheet:[ "+getValue("b")+"]\n");
		sf.assertEquals(text2, getValue("b"), "Compairision got failure on ClicableBanner content text2");
		
		System.out.println("From Webpage :[ "+ClicableBannerHeadingText3+"]         From Excelsheet:[ "+getValue("k")+"]");
		sf.assertEquals(ClicableBannerHeadingText3, getValue("k"), "Compairision got failure on ClicableBannerHeadingText Third\n");
		
		System.out.println("From Webpage :[ "+text3+"]       From Excelsheet: ["+getValue("f")+"]\n");
		sf.assertEquals(text3, getValue("f"), "Compairision got failure on ClicableBanner content text3\n");
		
	sf.assertAll();
		
		
		
		
		
		
		driver.quit();
	}
	
	
	
	
	

}
