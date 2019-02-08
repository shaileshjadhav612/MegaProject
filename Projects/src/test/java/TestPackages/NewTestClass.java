package TestPackages;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.beust.jcommander.Parameters;

import chromeDemo.BrowserSelect;

public class NewTestClass {
	
	
     WebDriver driver;
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
    
    
    
    
//   @BeforeTest
//   public void setup() throws Exception{
//		//Check if parameter passed from TestNG is 'firefox'
//		
//		System.out.println("********values for BrowserNames**********");    	
//		System.out.println("1>firefox");
//		System.out.println("2>chrome");   
//		
//		Scanner input = new Scanner(System.in);
//		System.out.println("**************Enter browser : ");
//		int browser = input.nextInt();
//			if(browser==1){
//			//create firefox instance
//				System.setProperty("webdriver.gecko.driver", "C://Users//shailesh.jadhav//eclipse-workspace//Projects//DriversExecutebleFiles//geckodriver.exe");
//				driver = new FirefoxDriver();
//				
//			}
//			//Check if parameter passed as 'chrome'
//			else if(browser==2){
//				//set path to chromedriver.exe
//				System.setProperty("webdriver.chrome.driver","C://Users//shailesh.jadhav//eclipse-workspace//Projects//DriversExecutebleFiles//chromedriver.exe");
//				//create chrome instance
//				driver = new ChromeDriver(); driver.get("https://testing-mpt.realitypremedia.co.in/?lang=en");
//			}
//			//Check if parameter passed as 'Edge'
//					else if(browser==3){
//						//set path to Edge.exe
//						System.setProperty("webdriver.edge.driver","C://Users//shailesh.jadhav//eclipse-workspace//Projects//DriversExecutebleFiles//MicrosoftWebDriver.exe");
//						//create Edge instance
//						driver = new EdgeDriver();
//					}
//			else{
//				//If no browser passed throw exception
//				throw new Exception("Browser is not correct");
//			}
//			driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		}
   
  // @Parameter("browser")
   
  //  public void setup () throws Exception{
       
    	// System.setProperty("webdriver.gecko.driver","C://Users//shailesh.jadhav//eclipse-workspace//Projects//DriversExecutebleFiles//geckodriver.exe");
     //  
//        System.out.println("*****************");		
		
	   //  
	        
//Scanner input = new Scanner(System.in);
    	
//System.out.println("********values for Browser**********");    	
//System.out.println("1>chrome Browser ");
//System.out.println("2>Firefox Browser ");
//System.out.println("3>Edge Browser ");
//System.out.print("Enter an number : ");
    //	int number = input.nextInt();
    	
//    	BrowserSelect.setup("chrome");
//	       driver.get("https://testing-mpt.realitypremedia.co.in/books/?category=152&lang=en");Thread.sleep(3000);
//	       driver.close();     
 //   @BeforeTest
   // @Parameters("browser")
//public void setup(String browser) throws Exception{
//	//Check if parameter passed from TestNG is 'firefox'
//	if(browser.equalsIgnoreCase("firefox")){
//	//create firefox instance
//		System.setProperty("webdriver.gecko.driver", "C://Users//shailesh.jadhav//eclipse-workspace//Projects//DriversExecutebleFiles//geckodriver.exe");
//		driver = new FirefoxDriver();
//	}
//	//Check if parameter passed as 'chrome'
//	else if(browser.equalsIgnoreCase("chrome")){
//		//set path to chromedriver.exe
//		System.setProperty("webdriver.chrome.driver","C://Users//shailesh.jadhav//eclipse-workspace//Projects//DriversExecutebleFiles//chromedriver.exe");
//		//create chrome instance
//		driver = new ChromeDriver();
//	}
//	//Check if parameter passed as 'Edge'
//			else if(browser.equalsIgnoreCase("Edge")){
//				//set path to Edge.exe
//				System.setProperty("webdriver.edge.driver","C://Users//shailesh.jadhav//eclipse-workspace//Projects//DriversExecutebleFiles//MicrosoftWebDriver.exe");
//				//create Edge instance
//				driver = new EdgeDriver();
//			}
//	else{
//		//If no browser passed throw exception
//		throw new Exception("Browser is not correct");
//	}
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//}
//       
       
//    }
	   
	
	@Test(priority=0)
	public void mymethods() throws Exception {
		
	   
	   setup();
//		System.out.println("********values for BrowserNames**********");    	
//		System.out.println("1>chrome");
//		System.out.println("2>firefox");
//		
//		Scanner input = new Scanner(System.in);
//		System.out.println("**************Enter browser : ");
//		int browser = input.nextInt();
//			if(browser==1){
//			//create firefox instance
//				System.setProperty("webdriver.gecko.driver", "C://Users//shailesh.jadhav//eclipse-workspace//Projects//DriversExecutebleFiles//geckodriver.exe");
//				driver = new FirefoxDriver();
//				 driver.get("https://testing-mpt.realitypremedia.co.in/?lang=en");
//			}
//			//Check if parameter passed as 'chrome'
//			else if(browser==2){
//				//set path to chromedriver.exe
//				System.setProperty("webdriver.chrome.driver","C://Users//shailesh.jadhav//eclipse-workspace//Projects//DriversExecutebleFiles//chromedriver.exe");
//				//create chrome instance
//				driver = new ChromeDriver(); driver.get("https://testing-mpt.realitypremedia.co.in/?lang=en");
//			}
//			//Check if parameter passed as 'Edge'
//					else if(browser==3){
//						//set path to Edge.exe
//						System.setProperty("webdriver.edge.driver","C://Users//shailesh.jadhav//eclipse-workspace//Projects//DriversExecutebleFiles//MicrosoftWebDriver.exe");
//						//create Edge instance
//						driver = new EdgeDriver();
//					}
//			else{
//				//If no browser passed throw exception
//				throw new Exception("Browser is not correct");
//			}
//			driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		Scanner input = new Scanner(System.in);
//		System.out.println("**************Enter browser : ");
//		String Browser = input.nextLine();
	//	System.out.println(newClass.values("password1"));
	 //    setup();
		
		// driver=new ChromeDriver();
		//driver=new FirefoxDriver();
		//driver.get("https://www.seleniumhq.org/");
//		 driver.get("https://testing-mpt.realitypremedia.co.in/?lang=en");
//		 driver.manage().window().maximize();
		// wait = new WebDriverWait(driver,15);
		// driver=this.driver;
		
		 driver.get("http://192.168.101.34/AZURE%20Projects/Reality.JobTrackingUtility/jobTrackerUI/#/loginpage");
		 String tile=driver.getTitle();
		 System.out.println("**************************Title: "+tile);
		 driver.findElement(By.xpath("//li[@id='menu-item-2342']//span[contains(.,'BOOKS')]")).click();
		 String itoms=driver.findElement(By.xpath("//span[contains(@id,'item_xxx')]")).getText();
		 System.out.println("***************itoms = "+itoms);
		 SoftAssert softAssert = new SoftAssert();
		 softAssert.assertEquals("81 ITEMS FOUND", "81 ITEMS FOUND");
		
////		   WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
////		  
////		   username.sendKeys("admin@realitypremedia.com");      
////		   
////		   WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
////		   //password.click();
////		   password.sendKeys("Pass#123");    //button[contains(.,'Login')]
////		 
////		
////		WebElement Loginbutton=driver.findElement(By.xpath("//button[contains(.,'Login')]"));
//		//WebElement element = driver.findElement(By.id("gbqfd"));
////		JavascriptExecutor executor = (JavascriptExecutor)driver;
////		executor.executeScript("arguments[0].click();", Loginbutton);
////		Assert.assertTrue(Loginbutton.isDisplayed());
////	Actions action=new Actions(driver);
////         action.moveToElement(Loginbutton).click().build().perform();
//		Thread.sleep(3000);
//	//	Assert.assertEquals(actual, expected, "books in gener are numbers");
//		Assert.assertTrue(false);
//		//Loginbutton.click();	
//		
//		Thread.sleep(3000);
//		 
//		// assert.assertEquals(actual, 50);
		 driver.close();
	}
	
	@Test(priority=1)
	public void test2() throws Exception
	{
		
//		Scanner input = new Scanner(System.in);
//		String Browser = input.nextLine();
	//	System.out.println(newClass.values("password1"));
		  setup();
		
		System.out.println("******test2 execution");
//		 System.setProperty("webdriver.gecko.driver","C://Users//shailesh.jadhav//eclipse-workspace//Projects//DriversExecutebleFiles//geckodriver.exe");
//		driver=new FirefoxDriver();		
		//driver.get("https://www.seleniumhq.org/");
		 driver.get("https://testing-mpt.realitypremedia.co.in/?lang=en");
		 System.out.println("Title of page is :"+driver.getTitle());
		 driver.manage().window().maximize();  driver.close();
		 SoftAssert softAssert = new SoftAssert();
		 softAssert.assertTrue(false, "bes");
	}
	
	
//	 @AfterTest
//	    public void teardown () throws IOException, InterruptedException {
//		 
//		 Thread.sleep(6000);
//	        driver.quit();
//	    }
}
