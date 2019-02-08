package chromeDemo;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserSelect {
	
	public WebDriver driver;
	
	public void setup() throws Exception{
		//Check if parameter passed from TestNG is 'firefox'
		
		
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
						driver = new ChromeDriver(); driver.get("https://testing-mpt.realitypremedia.co.in/?lang=en");
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

}
