package TestPackages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
		 Mp.driver.findElement(By.xpath("//span[contains(@class,'menu-title')]/following::li[contains(@id,'menu-item-2342')]")).click();
		 WebElement itom= Mp.driver.findElement(By.xpath("//span[contains(@id,'item_xxx')]"));
		 String itoms=itom.getText();
		 //String 
		 System.out.println("***************itoms = "+itoms.substring(3));
		 System.out.println("***************itoms = "+itoms.substring(3,7));
		 System.out.println("***************itoms = "+itoms.substring(9,14));
		 Mp.driver.quit();
		 
	 }
}
