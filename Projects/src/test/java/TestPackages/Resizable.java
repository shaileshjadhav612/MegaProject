package TestPackages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Resizable {
	
	WebDriver driver;
	
	
	@Test
	public void ResizableElement()
	{
		System.setProperty("webdriver.chrome.driver", ".//MyDrivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Resizable.html");
		driver.manage().window().maximize();
		WebElement Resizablparameter=driver.findElement(By.xpath("//div[contains(@id,'resizable')]"));

		
		
		
		
		
		
		driver.quit();
	}

}
