package TestPackages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Accortion {
	
	WebDriver driver;
	
	SearchForNoDataFound sf =new SearchForNoDataFound();
	@Test
	public void demo() throws IOException
	{
		
		System.setProperty("webdriver.chrome.driver",".//MyDrivers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/WebTable.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Widgets']")).click();
		driver.findElement(By.xpath("//a[text()=' Accordion ']")).click();
		driver.findElement(By.xpath("//h4[contains(.,' Collapsible Group 2 - Single Line Coding')]")).click();
		WebElement pessage2 = driver.findElement(By.xpath("//div[contains(@class,'panel-body')]//preceding::div[contains(@id,'collapse2')]"));
		String text2=pessage2.getText();
		System.out.println("**************"+text2+"********************************");
		Assert.assertEquals(text2,sf.getValue("Passage2"));
		System.out.println("*******************"+sf.getValue("Passage2"));
		
		
		
		
		
		
		
		
		
		driver.quit();
	}

}
