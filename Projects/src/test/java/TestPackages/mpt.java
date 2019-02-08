package TestPackages;


import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import javax.xml.validation.Validator;

import org.jsoup.helper.Validate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.google.common.base.Verify;

public class mpt {
	
    public WebDriver driver;
   public WebDriverWait wait;
	
	 public void setup() throws Exception{
			//Check if parameter passed from TestNG is 'firefox'
			
			System.out.println("********values for BrowserNames**********");    	
			System.out.println("1>firefox");
			System.out.println("2>chrome");   
			
			Scanner input = new Scanner(System.in);
			System.out.println("**************Enter browser : ");
			int browser = input.nextInt();
				if(browser==1){
				//create firefox instance
					System.setProperty("webdriver.gecko.driver", "C://Users//shailesh.jadhav//eclipse-workspace//Projects//DriversExecutebleFiles//geckodriver.exe");
					driver = new FirefoxDriver();
					
				}
				//Check if parameter passed as 'chrome'
				else if(browser==2){
					//set path to chromedriver.exe
					System.setProperty("webdriver.chrome.driver","C://Users//shailesh.jadhav//eclipse-workspace//Projects//DriversExecutebleFiles//chromedriver.exe");
					//create chrome instance
					driver = new ChromeDriver();
				}
				//Check if parameter passed as 'Edge'
						else if(browser==3){
							//set path to Edge.exe
							System.setProperty("webdriver.edge.driver","C://Users//shailesh.jadhav//eclipse-workspace//Projects//DriversExecutebleFiles//MicrosoftWebDriver.exe");
							//create Edge instance
							driver = new EdgeDriver();
						}
				else{
					//If no browser passed throw exception
					throw new Exception("Browser is not correct");
				}
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			}
	     

	 
	 @Test
	 public void checkBooks() throws Exception
	 {
		 
		
		 setup();
		 driver.get("https://testing-mpt.realitypremedia.co.in/?lang=en");
		 String tile=driver.getTitle();
		 System.out.println("**************************Title: "+tile);
		 driver.findElement(By.xpath("//span[contains(@class,'menu-title')]/following::li[contains(@id,'menu-item-2342')]")).click();
		 WebElement itom=driver.findElement(By.xpath("//span[contains(@id,'item_xxx')]"));
		 String itoms=itom.getText();
		 System.out.println("***************itoms = "+itoms);
		// SoftAssert softAssert = new SoftAssert();
		// softAssert.assertEquals(itoms, "1 ITEMS FOUND");
		// Assert.assertEquals(itoms, "81 ITEMS FOUND");
		String Text=driver.findElement(By.xpath("(//span[contains(.,'10 per page')])[1]")).getText();
		System.out.println("**************************"+Text);
		//Assert.assertTrue(Text.contains("10 per page"), "message is passed");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		WebElement checkbox = driver.findElement(By.xpath("(//ul[contains(@id,'left_filter_genre')]//div//li//input)[1]"));
//		checkbox.click();
//	  System.out.println("**********************"+checkbox);
		Assert.assertEquals(itoms, "80 ITEMS FOUND");
		Thread.sleep(3000);
		
		List<WebElement> options = driver.findElements(By.xpath("//ul[contains(@id,'left_filter_genre')]//div//li//input[contains(@class,'filters_value')]"));
		for(int i=0;i<19;i++)
		{
			WebElement option=options.get(i);
			WebElement item=driver.findElement(By.xpath("//span[contains(@id,'item_xxx')]"));
			//option.click();
			if(i==0)
			{
				
				Thread.sleep(3000);
				//driver.findElement(By.xpath("(//ul[contains(@id,'left_filter_genre')]//div//li//input)[1]")).click();
				System.out.println("***************"+option.getText());
				option.click();
				Thread.sleep(6000);
				System.out.println("***********************"+item.getText());
				Assert.assertEquals(item.getText(), "1 ITEMS FOUND");
				option.click();
		
			}
			else if(i==1)
			{
				
				//driver.navigate().refresh();
				Thread.sleep(6000);
				option.click();
				Thread.sleep(6000);	
				
				Assert.assertEquals(item.getText(), "3 ITEMS FOUND");
				option.click();
			
			}
			else if(i==2)
			{
				option.click();
				Thread.sleep(6000);
				Assert.assertEquals(item.getText(), "9 ITEMS FOUND");
				option.click();
				
			}
			else if(i==3)
			{
				option.click();
				Thread.sleep(6000);
				Assert.assertEquals(item.getText(), "4 ITEMS FOUND");
				option.click();
				
			}
			else if(i==4)
			{
				option.click();
				Thread.sleep(6000);
				Assert.assertEquals(item.getText(), "1 ITEMS FOUND");
				option.click();
				
			}
			else if(i==5)
			{
				option.click();
				Thread.sleep(6000);
				Assert.assertEquals(item.getText(), "2 ITEMS FOUND");
				option.click();
			
			}
			else if(i==6)
			{
				option.click();
				Thread.sleep(6000);
				Assert.assertEquals(item.getText(), "2 ITEMS FOUND");
				option.click();
				driver.navigate().refresh();
				break;
				
			}
			else if(i==7)
			{
				option.click();
				Thread.sleep(6000);
				//driver.navigate().refresh();
				Assert.assertEquals(item.getText(), "8 ITEMS FOUND");
				option.click();
				
			}
			else if(i==8)
			{
				option.click();
				Thread.sleep(6000);
				Assert.assertEquals(item.getText(), "24 ITEMS FOUND");
				option.click();
				
			}
			else if(i==9)
			{
				option.click();
				Thread.sleep(6000);
				Assert.assertEquals(item.getText(), "1 ITEMS FOUND");
				option.click();
				
			}
			else if(i==10)
			{
				
				driver.navigate().refresh();
				Thread.sleep(6000);
				option.click();
				Thread.sleep(6000);
				Assert.assertEquals(item.getText(), "16 ITEMS FOUND");
				option.click();
			}
			else if(i==11)
			{
				option.click();
				Thread.sleep(6000);
				Assert.assertEquals(item.getText(), "76 ITEMS FOUND");
				option.click();
				
			}
			else if(i==12)
			{
				option.click();
				Thread.sleep(6000);
				Assert.assertEquals(item.getText(), "2 ITEMS FOUND");
				option.click();
				
			}
			
			
			else if(i==13)
			{
				option.click();
				Thread.sleep(6000);
				Assert.assertEquals(item.getText(), "1 ITEMS FOUND");
				System.out.println("*****************"+item.getText());
				option.click();
				
			
			}
			
		}
		 
		 
		 
		 
		 
		 
		 
		 driver.quit();
		 
		 
		 
		 
	 }
}
