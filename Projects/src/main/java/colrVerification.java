import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class colrVerification {
	
	@Test
	public void color() throws IOException
	{
		
		
		
		
		
		System.setProperty("webdriver.chrome.driver", ".//MyDrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.guru99.com/top-100-selenium-interview-questions-answers.html");
		driver.manage().window().maximize();
		WebElement java = driver.findElement(By.xpath("(//a[contains(@href,'/java-tutorial.html')])[2]"));
		String colorElement = java.getCssValue("color"); 
		System.out.println("*********"+colorElement);
		String hexcolor = org.openqa.selenium.support.Color.fromString(colorElement).asHex();
		System.out.println("************"+hexcolor);
//		File file = new File("D:\\myExcel.xls");
//		FileInputStream fis = new FileInputStream(file);
//		HSSFWorkbook wb = new HSSFWorkbook(fis);
//		HSSFSheet sheet = wb.getSheet("Sheet1");
//		System.out.println(sheet.getRow(0).getCell(0));
		
		
		
		
		
		driver.close();
	}

}
