package TestPackages;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ArrayLit {
	
	
	
	WebDriver driver;
	@Test(priority=0)
	public void araays()
	{
		Collection values =  new ArrayList();
		
		values.add(55);
		values.add(77);
		values.add(99);
		java.util.Iterator it = values.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	@Test(priority=1)
	public void arra()
	{
		System.setProperty("webdriver.chrome.driver", ".\\DriverExe\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://selenium.dev/downloads/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		List<WebElement> options = driver.findElements(By.xpath("//table[@class='data-list']//tr//td[1]"));
		java.util.Iterator<WebElement> it = options.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().getText());
			
		}
		driver.close();
	}

}
