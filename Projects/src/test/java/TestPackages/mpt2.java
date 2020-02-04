package TestPackages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.model.Sheet;
import org.apache.poi.hssf.model.Workbook;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class mpt2 {
	
	public static Map<String,Map<String,String>> LoadExcel() throws IOException
	{
		
		File file = new File("D:\\MPT sheet.xls");
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
	
	public WebDriver driver;
	@Test
	public void mpt() throws InterruptedException, IOException
	{
		
		
		System.setProperty("webdriver.chrome.driver", ".//MyDrivers//chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://testing-mpt.realitypremedia.co.in/?lang=en");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(4000);
		WebElement english = driver.findElement(By.xpath("//span[text()='ျမန္မာ']"));
		SoftAssert sr = new SoftAssert();
		WebElement button = driver.findElement(By.xpath("//li[@class='lang-my']//span"));
		button.click();
		//sr.assertEquals(english.getText(), "ျမန္မာ","English text verification");
		WebElement Book = driver.findElement(By.xpath("(//li[@id='menu-item-2342']//span)[1]"));
		Actions ac= new Actions(driver);
		ac.moveToElement(Book).build().perform();
	//	List<WebElement> MenuList = driver.findElements(By.xpath("//ul[contains(@id,'menu-main-menu')]//li[@data-depth='0']"));
//		for (int k=0;k<MenuList.size();k++) {
//			
//			
//			WebElement options = MenuList.get(k);
//			String MenuText = options.getText();
//			System.out.println("***********////////////////******"+MenuText);
//			
//		}
		String [] Booksoptions = {"BOOKS","GENRE","Romance","Biography & Autography","Action, Adventure & Horror","Sports & Health","Travel & Cooking","Arts & Satire","Business & Economy","History & Geography","Politics & Social Sciences","More"};
		for (String string : Booksoptions) {
			
			
			System.out.println(string);
			
		}
		String[] Booksops= {"စာအုပ္မ်ား","အမ်ဳိးအစား","အခ်စ္၀တၳဳ","အထၱဳပၸတိ ႏွင့္ ကုိယ္တုိင္ေရးအတၳဳပၸတၱိ","အက္ရွင္၊ စြန္႔စားခန္း ႏွင့္ ထိတ္လန္႔ဖြယ္ရာ  ","အားကစားႏွင့္ က်န္းမာေရး","ခရီးသြားျခင္းႏွင့္ အစားအစာ","အႏုပညာႏွင့္ သေရာ္စာ","စီးပြားေရးႏွင့္ အလုပ္အကုိင္","သမုိင္းႏွင့္ ဘူမိေဘတ","ႏုိင္ငံေရးႏွင့္ လူမႈသိပၸံ","ပုိမုိ၍"};
	
		List<WebElement> textoptions= driver.findElements(By.xpath("//li[@id='menu-item-2342']//span[@class='menu-title']"));
		for (int i=0;i<textoptions.size();i++) {
			
			
			WebElement es = textoptions.get(i);
			String text = es.getText();
			sr.assertEquals(Booksops[i], text," Checking of "+Booksoptions[i]);
		//	Thread.sleep(2000);
			//System.out.println("************"+text);
		}	
			List<WebElement> JOURNALS_Menu = driver.findElements(By.xpath("//li[@id='menu-item-2296']//span[@class='menu-title']"));
			for (int i=0;i<JOURNALS_Menu.size();i++) {
				
				
				WebElement JOURNALS_MenuList = JOURNALS_Menu.get(i);
				String JOURNALS_MenuText = JOURNALS_MenuList.getText();
				sr.assertEquals(Booksops[i], JOURNALS_MenuText," Checking of "+Booksoptions[i]);
	
		}
		//System.out.println("********///////////***********"+getValue("Books"));
		sr.assertAll();
		
		driver.quit();
		
		
	}

}
