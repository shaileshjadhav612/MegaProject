package TestPackages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import edu.emory.mathcs.backport.java.util.TreeMap;
import gherkin.formatter.model.Row;

public class WriteExcel {

	
	WebDriver driver;

//	public static Map<String,Map<String,String>> LoadExcel() throws IOException
//	{
//		
//		File file = new File("D:\\NewWorkBook.xlsm");
//		FileInputStream fis = new FileInputStream(file);
//		HSSFWorkbook wb = new HSSFWorkbook(fis);
//		HSSFSheet sheet = wb.getSheet("Sheet1");
//		int RowCount = sheet.getLastRowNum()+1;
//		Map<String,Map<String,String>> supermap = new HashMap<String,Map<String,String>>();
//		Map <String,String> map =new HashMap<String,String>();
//		
//		for(int i=0;i<RowCount;i++)
//		{
//			sheet.getRow(i).getCell(0).setCellValue("nila");
//			sheet.getRow(i).getCell(1).setCellValue("Vanila");
//			map.keySet(key,value);
//		} 			
//		 supermap.put("superkey",map);
//		return supermap;
//	}
//	public static String getValue(String key) throws IOException
//	{
//		Map <String,String> myvalue = LoadExcel().get("superkey");
//		String value = myvalue.get(key);
//		return value;
//	}
//	
	
	
	
	
	@Test
	public void Write() throws IOException {

//		File file = new File("D:\\NewWorkBook.xlsm");
//		FileInputStream fis = new FileInputStream(file);
//		XSSFWorkbook wb = new XSSFWorkbook(fis);
//		XSSFSheet sheet = wb.getSheet("Sheet1");
//		 XSSFRow row = sheet.createRow(1);
//		 Cell cell = row.createCell(1);		
//		
//		 cell.setCellType(cell.CELL_TYPE_STRING);
//		 cell.setCellValue("SoftwareTestingMaterial.com");
//		 FileOutputStream fos = new FileOutputStream("D:\\NewWorkBook.xlsm");
//		 wb.write(fos);
//		 fos.close();
//		 System.out.println("END OF WRITING DATA IN EXCEL");
		
		
		
		   XSSFWorkbook workbook = new XSSFWorkbook(); 
		   
	        // Create a blank sheet 
	        XSSFSheet sheet = workbook.createSheet("student Details"); 
	  
	        // This data needs to be written (Object[]) 
	        Map<String, Object[]> data = new TreeMap(); 
	        data.put("1", new Object[]{ "ID", "NAME", "LASTNAME" }); 
	        data.put("2", new Object[]{ 1, "Pankaj", "Kumar" }); 
	        data.put("3", new Object[]{ 2, "Prakashni", "Yadav" }); 
	        data.put("4", new Object[]{ 3, "Ayan", "Mondal" }); 
	        data.put("5", new Object[]{ 4, "Virat", "kohli" }); 
	  
	        // Iterate over data and write to sheet 
	        Set<String> keyset = data.keySet(); 
	        int rownum = 0; 
	        for (String key : keyset) { 
	            // this creates a new row in the sheet 
	            org.apache.poi.ss.usermodel.Row row = sheet.createRow(rownum++); 
	            Object[] objArr = data.get(key); 
	            int cellnum = 0; 
	            for (Object obj : objArr) { 
	                // this line creates a cell in the next column of that row 
	                Cell cell = row.createCell(cellnum++); 
	                if (obj instanceof String) 
	                    cell.setCellValue((String)obj); 
	                else if (obj instanceof Integer) 
	                    cell.setCellValue((Integer)obj); 
	            } 
	        } 
	        try { 
	            // this Writes the workbook gfgcontribute 
	            FileOutputStream out = new FileOutputStream(new File("gfgcontribute.xlsx")); 
	            workbook.write(out); 
	            out.close(); 
	            System.out.println("gfgcontribute.xlsx written successfully on disk."); 
	        } 
	        catch (Exception e) { 
	            e.printStackTrace(); 
			}}

}
