package TestPackages;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import javax.xml.validation.Validator;

import org.jsoup.helper.Validate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class JavaExamples {

	
	mpt Mp = new mpt();
	
	 @Test
	 public void Books() throws Exception
	 {
		 
		
		 Mp.setup();
		 Mp.driver.get("https://testing-mpt.realitypremedia.co.in/?lang=en");
		 String tile=Mp.driver.getTitle();
		 System.out.println("**************************Title: "+tile);
	  WebDriverWait wait = new WebDriverWait(Mp.driver, 10);
	 // WebElement menu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(@class,'menu-title')]/following::li[contains(@id,'menu-item-2342')]")));	  
		 Thread.sleep(3000);
		 Mp.driver.findElement(By.xpath("//span[contains(@class,'menu-title')]/following::li[contains(@id,'menu-item-2342')]")).click();
		 WebElement itom= Mp.driver.findElement(By.xpath("//span[contains(@id,'item_xxx')]"));
		 String itoms=itom.getText();
		 //String 
		 System.out.println("***************itoms = "+itoms);
		 System.out.println("***************itoms = "+itoms.substring(3));
		 System.out.println("***************itoms = "+itoms.substring(3,7));
		 System.out.println("***************itoms = "+itoms.substring(9,14));
		 System.out.println("****************compare to : "+itoms.compareTo("82 ITEMS FOUND"));
		Assert.assertTrue(itoms.contains("ITEMS"), "String contains specified value");
		 Mp.driver.quit();
		 
	 }
}
