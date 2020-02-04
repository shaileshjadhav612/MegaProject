package TestPackages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OnlyNumbers {
	
	WebDriver driver;
	
	
	
	@Test
	public void GetNumbers()
	{
		
		
		System.setProperty("webdriver.chrome.driver",".\\MyDrivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/WebTable.html");
		driver.manage().window().maximize();
		List< WebElement> colomn = driver.findElements(By.xpath("//div[contains(@class,'ui-grid-cell-contents ng-binding ng-scope')]"));
		
		
		System.out.println("************"+colomn.get(5).getText());
	//	System.out.println("***************"+colomn.get(5).getText().replaceAll("[^0-9]",""));
	//	System.out.println("******#################*********"+colomn.get(5).getText().replaceAll("\\D+",""));
		System.out.println("******#################*********"+colomn.get(5).getText().substring(10,12));
		
		
		
		
		
		
		
		
		
		
		driver.quit();
	}

}
