package TestPackages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssert {
mpt Mp = new mpt();
	@Test
	public void soft() throws Exception
	{
		
		SoftAssert sf = new SoftAssert();
		sf.assertTrue(true,"assertion got failed its true");
		Assert.assertEquals(5,5);
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
sf.assertAll();
	}
}
