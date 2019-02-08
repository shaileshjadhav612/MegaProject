package newPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class newClass {

	 public  static Map<String,Map<String,String>> loadExcel() throws IOException {
			
			
		 File file=new File("D:/myExcel.xls");
		 FileInputStream fis=new FileInputStream(file);
		 HSSFWorkbook wb=new HSSFWorkbook(fis);
		 HSSFSheet sheet1=wb.getSheetAt(0);
		 int RowCount=sheet1.getLastRowNum()+1;
		 System.out.println("***Loading Excel****************");
		 
		 Map<String,Map<String,String>> supermap=new HashMap<String,Map<String,String>>();
		 Map<String,String> map=new HashMap<String,String>();
		 for(int i=0;i<RowCount;i++)
		 {
			 
			 
			 String key=sheet1.getRow(i).getCell(0).getStringCellValue();
			 String value=sheet1.getRow(i).getCell(1).getStringCellValue();
			 map.put(key, value);
		 }
		 supermap.put("superkey",map);
		 return supermap;	 
			 
			 
			 
		 }
	public static String values(String key) throws IOException
	 {
		 Map<String,String> getvalue=loadExcel().get("superkey");
		 String value=getvalue.get(key);
		 return value;
	 }
	
}
 