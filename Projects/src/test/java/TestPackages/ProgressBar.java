package TestPackages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProgressBar {
	WebDriver driver;
	
	
	
	@Test
	public void ProgressBarDispaly() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", ".//MyDrivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/JqueryProgressBar.html");
		driver.manage().window().maximize();
		WebElement button1 = driver.findElement(By.xpath("//button[contains(@id,'downloadButton')]"));
		button1.click();
		WebElement ProgressBar = driver.findElement(By.xpath("//div[contains(@style,'width: 102%;')]"));
		Assert.assertTrue(ProgressBar.isDisplayed());
		
		
		Thread.sleep(3000);
		driver.quit();
	}

}
