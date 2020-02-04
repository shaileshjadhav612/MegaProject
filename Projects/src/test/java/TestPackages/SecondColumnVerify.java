package TestPackages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class SecondColumnVerify {
	
	WebDriver driver;
	SoftAssert sr = new SoftAssert();
	public void serchcontext(String text,String columnname)
	{
				//int count=0;
		if(columnname.equalsIgnoreCase("position"))
		{
			
			List<WebElement> myList = driver.findElements(By.xpath("//table[@id='example']//tr//td[2]"));
			System.out.println(myList.get(3).getText());
			int count=0;
		
			for (WebElement webElement : myList) {
				
				//sr.assertEquals(webElement.getText(), text, "verifying your Text");
				if(webElement.getText().equals(text))
				{
					count++;
				}
			} {System.out.println(text+" is "+count+" number of times in columnlabel");}
			
			if(count!=0)
				System.out.println("Given text is not in column");
		}
		
		 if (columnname.equalsIgnoreCase("Name")) {

			System.out.println("*****************Namecolumn");
			List<WebElement> myList2 = driver.findElements(By.xpath("//table[@id='example']//tr//td[1]"));
			System.out.println(myList2.get(3).getText());
			int count;
			count=0;
			
			for (WebElement webElement : myList2) {
				
				//sr.assertEquals(webElement.getText(), text, "verifying your Text");
				if(webElement.getText().equalsIgnoreCase(text))
				{
					count++;
				}
			}System.out.println(count+ "is count");System.out.println(text+" is "+count+" number of times in columnlabel");
			
			if(count!=0)
				System.out.println("Given text is not in column");
		}
		
		else if (columnname.equalsIgnoreCase("Office")) {
		
			List<WebElement> myList = driver.findElements(By.xpath("//table[@id='example']//tr//td[3]"));
			System.out.println(myList.get(3).getText());
			int count=0;
		
			for (WebElement webElement : myList) {
				
				//sr.assertEquals(webElement.getText(), text, "verifying your Text");
				if(webElement.getText().equals(text))
				{
					count++;
				}
			}System.out.println(text+" is "+count+" number of times in columnlabel");
			
			if(count!=0)
				System.out.println("Given text is not in column");
		}
		else if (columnname.equalsIgnoreCase("Age")) {
	
			List<WebElement> myList = driver.findElements(By.xpath("//table[@id='example']//tr//td[4]"));
			System.out.println(myList.get(3).getText());
			int count=0;
			
			for (WebElement webElement : myList) {
				
				//sr.assertEquals(webElement.getText(), text, "verifying your Text");
				if(webElement.getText().equals(text))
				{
					count++;
				}
			}System.out.println(text+" is "+count+" number of times in columnlabel");
			
			if(count!=0)
				System.out.println("Given text is not in column");
		}
		
		
	}
	@Test
	public void VerifyColumnData()
	{
		
		System.setProperty("webdriver.chrome.driver",".//DriverExecutables//chromedriver.exe");
		driver=new ChromeDriver();

		driver.get("https://datatables.net/");
		driver.manage().window().maximize();
		
	System.out.println(driver.getTitle());
		List<WebElement> myList = driver.findElements(By.xpath("//table[@id='example']//tr//td[3]"));
		System.out.println(myList.get(3).getText());
		int count=0;
		for (WebElement webElement : myList) {
			
			if(webElement.getText().equals("New York"))
			{
				count++;
			}
		}
		System.out.println(count);
	
	//serchcontext("Unity Butler","Name");
		driver.quit();
		
	}

}
