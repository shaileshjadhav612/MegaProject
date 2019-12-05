package TestPackages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class UITestingClass {
	public static WebDriver driver;
	
	@Test
	public static void UITestingMethod() throws Exception
	{
	
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
	mpt Mp =new mpt();
	Mp.setup();
	mpt.driver.get("https://testing-mpt.realitypremedia.co.in/?lang=en");
	// Log.info("Web application launched");
	  Reporter.log("Sign In Successful | " );
	  js.executeScript("window.scrollBy(0,1000)", "");
	WebElement image=  driver.findElement(By.xpath("(//img[contains(@class,'attachment-woocommerce_thumbnail size-woocommerce_thumbnail ')])[13]"));
	int imageWidth=image.getSize().width;
	int imageHeight= image.getSize().getHeight();
	System.out.println("*********************imageWidth : "+imageWidth +" & imageHeight : "+imageHeight);
	 WebElement arrow = Mp.driver.findElement(By.xpath("//li[@id='menu-item-2342']//span[contains(.,'BOOKS')]"));
	 arrow.click();
	Assert.assertTrue(Mp.driver.findElement(By.xpath("//a[contains(@class,'next page-numbers')]")).isDisplayed(),"*******************Next arrow is displayed***********************");
	Reporter.log("********************************Application is shutting***************************************");
	
	Mp.driver.quit();

	}
}
