package TestPackages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import javax.imageio.ImageIO;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class compairingcolumn {
	
	screenshot sc = new screenshot();
	mpt sj = new mpt();
	
	public static Map<String,Map<String,String>> LoadExcel() throws IOException
	{
		
		File file = new File("C:\\Users\\shailesh.jadhav\\Documents\\StringPass.xls");
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
	
	public void checkcolumndata(String value)
	{
		List<WebElement> listcolumndata= sj.driver.findElements(By.xpath("//div[contains(@class,'ui-grid-cell ng-scope ui-grid-coluiGrid-0009')]//div[contains(@class,'ui-grid-cell-contents ng-binding ng-scope')]"));
		int count = listcolumndata.size();
		for (WebElement lists : listcolumndata) {
			
			System.out.println("*****"+lists.getText());
			
		}
		for (int i=0;i<count;i++) {
			
			WebElement column = listcolumndata.get(i);
			String columnValues = column.getText();
			//System.out.println("*******"+columnValues);
			if(columnValues.contains(value))
			{
				System.out.println("column is contains value***********=> "+columnValues);
			}
			
			
			
		}
	}
	
	public void screenshot(WebDriver driver,WebElement element,String path) throws IOException
	{
		Screenshot ImageCaptured = new AShot().takeScreenshot(driver,element);
		ImageIO.write(ImageCaptured.getImage(), "PNG" , new File(path));
		
	}
	
	
	@Test
	public void compairingcolumnvalue() throws Exception
	{
		
		sj.setup();
		
		sj.driver.get("http://demo.automationtesting.in/WebTable.html");
		sj.driver.manage().window().maximize();
		
		checkcolumndata("3168228424");
		
		
		Actions action= new Actions(sj.driver);
		WebElement tablename= sj.driver.findElement(By.xpath("//a[contains(.,'WYSIWYG')]"));
		action.moveToElement(tablename).build().perform();
		WebElement columnsfist= sj.driver.findElement(By.xpath("//a[contains(.,'TinyMCE')]"));
		columnsfist.click();
		Thread.sleep(3000);
		WebElement IMAGE =sj.driver.findElement(By.xpath("//a//img[contains(@alt,'image not displaying')]"));
		screenshot(sj.driver,IMAGE,"D:\\scrrenshots\\i.png");
		System.out.println("******"+getValue("ErrorMessage"));
		
		
		
		
		sj.driver.quit();
	}

}
