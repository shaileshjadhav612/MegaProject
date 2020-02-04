package TestPackages;

import javax.xml.validation.Validator;

import org.apache.maven.surefire.shade.booter.org.apache.commons.lang3.Validate;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CountOfIndex {
	
	WebDriver driver;
	
	@Test
	public void Index() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", ".//MyDrivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/WebTable.html");
		driver.manage().window().maximize();
		WebElement countNumber= driver.findElement(By.xpath("//span[contains(@class,'ui-grid-pager-max-pages-number ng-binding')]"));
		Assert.assertTrue(countNumber.getText().endsWith("100"),"*************Index ends with 100");
		Validate.isTrue(countNumber.getText().endsWith("100"));
		WebElement triangle = driver.findElement(By.xpath("//div[contains(@class,'first-bar')]"));
		String Text = triangle.getText();
		System.out.println("****************"+Text);
		System.out.println("******************"+countNumber.getText());
		WebElement secodArrow = driver.findElement(By.xpath("//div[contains(@class,'last-triangle next-triangle')]"));
		secodArrow.click();
		System.out.println("********************"+secodArrow.getText());
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2000)", "");
		js.executeScript("window.scrollBy(0,-2000)", "");
		
		Thread.sleep(3000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		//driver.quit();
		
	}

}
