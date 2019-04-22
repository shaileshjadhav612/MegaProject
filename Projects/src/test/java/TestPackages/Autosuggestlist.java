package TestPackages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Autosuggestlist {
	
	mpt Mp = new mpt();
	checkForColor cp= new checkForColor();
	@Test
	public void autosuggest() throws Exception
	{
		Mp.setup();
		Mp.driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		Actions action = new Actions(Mp.driver);
		
		Mp.driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobile");
		Thread.sleep(3000);
		List<WebElement> options = Mp.driver.findElements(By.xpath("//div[@id='suggestions-template']"));
		checkForColor.takeSnapShot(Mp.driver, "D://screenshot/a.png");
		for (int i=0;i<options.size();i++) {
			
			System.out.println("***********"+options.get(i).getText());
			//WebElement option = options.get(i);
			Thread.sleep(2000);
			if(options.get(i).getText().equals("redmi note 7 pro mobiles 2018"))
			{
				System.out.println("****************"+options.get(i).getText());
				options.get(i).click();
				break;
			}
				
			
			}
		checkForColor.takeSnapShot(Mp.driver, "D://screenshot/a1.png");
		Mp.driver.quit();
	}

}
