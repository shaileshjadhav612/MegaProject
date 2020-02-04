package TestPackages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Episerver {
	
	
	
	
	
WebDriver driver;
	
	
public static Map<String,Map<String,String>> LoadExcel() throws IOException
{
	
	File file = new File("D://loadingExcel.xls");
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
//		DataFormatter formatter = new DataFormatter();
//		String key = formatter.formatCellValue(sheet.getRow(i).getCell(2));
//		String value = formatter.formatCellValue(sheet.getRow(i).getCell(4));
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
	


@Test
public void episerverFunction() throws IOException
{
	System.out.println(getValue("a"));
}

}
