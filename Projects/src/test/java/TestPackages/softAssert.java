package TestPackages;

import javax.xml.validation.Validator;
import javax.xml.validation.ValidatorHandler;

import org.jsoup.helper.Validate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.google.common.base.Verify;

public class softAssert {
mpt Mp = new mpt();
@Test(priority=0)
public void softAssert() {
	
	SoftAssert sq= new SoftAssert();   sq.assertTrue(true, "softAssert is failure");sq.assertAll();
}
	@Test
	public void soft() throws Exception
	{
		String tina="tina"; 
		String mina="mina";
		SoftAssert sf = new SoftAssert();
		sf.assertTrue(true,"assertion got failed its true");
		Assert.assertEquals(5,5,"assertion got true its true");
		sf.assertEquals(true, false);
System.out.println("**************u r hero");
sf.assertEquals(5,7);
System.out.println("**************u got it");
sf.assertEquals("tina","tinas");
System.out.println("**************manali");
Mp.setup();
Mp.driver.get("https://www.seleniumhq.org/download/");Thread.sleep(3000);
Thread.sleep(3000);
Mp.driver.findElement(By.xpath("//td[contains(.,'C#')]/following::a[contains(.,'Download')][1]")).click();
Mp.driver.quit();
sf.assertAll();
	}
}
