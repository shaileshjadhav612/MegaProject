package TestPackages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class newWindow {
	
	WebDriver driver;
	
	
	@Test
	public void multipleWindow() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".//MyDrivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(.,'SwitchTo')]")).click();
		driver.findElement(By.xpath("//a[contains(.,'Windows')]")).click();
		
		//first window
//		driver.findElement(By.xpath("//a[contains(.,'Open New Tabbed Windows ')]")).click();
//		driver.findElement(By.xpath("//button[contains(.,'    click   ')]")).click();
//		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
//		driver.switchTo().window(tabs.get(1));
//		System.out.println("*********"+driver.getTitle());
//		driver.findElement(By.xpath("//h3[contains(.,' Java')]")).click();  
		
		//second window
		driver.findElement(By.xpath("//a[contains(.,'Open New Seperate Windows')]")).click();
		driver.findElement(By.xpath("//button[contains(@class,'btn btn-primary')]")).click();
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));	
		System.out.println("*********"+driver.getTitle());
		driver.findElement(By.xpath("//h3[contains(.,' Java')]")).click();   
		
		
		//third window
//		driver.findElement(By.xpath("//a[contains(.,'Open Seperate Multiple Windows')]")).click();
//		driver.findElement(By.xpath("//button[contains(@onclick,'multiwindow()')]")).click();
//		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
//		driver.switchTo().window(tabs.get(1));	
//		System.out.println("*********"+driver.getTitle());
//		driver.findElement(By.xpath("//h3[contains(.,' Java')]")).click();

		
		
		
		
		
		driver.quit();
	}

}
