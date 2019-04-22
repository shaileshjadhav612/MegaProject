package TestPackages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NewTab {
	
	@Test
	public void switchtoNewTab() throws Exception
	{
		
		
		mpt Mp = new mpt();
		Mp.setup();
		Mp.driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
		String ParentWindow = Mp.driver.getWindowHandle();
		System.out.println("********************ParentWindow : "+ParentWindow);
		Mp.driver.findElement(By.xpath("//button[contains(.,'New Browser Window')]")).click();
        Thread.sleep(3000);
        
        
       // Set<String> windowsoption = Mp.driver.getWindowHandles();
       // System.out.println("****************"+windowsoption);
        Mp.driver.findElement(By.xpath("//button[contains(.,'New Browser Tab')]")).click();
        Set<String> AllWindows = Mp.driver.getWindowHandles();
        int count = AllWindows.size();
        Iterator<String> itr=AllWindows.iterator();
        System.out.println("*************AllWindows : "+AllWindows);
      
        for (String windows:AllWindows) {
//      if(!ParentWindow.equals(windows))  	
//      {	
//    	  itr.
//			Mp.driver.switchTo().window(windows);
//			Mp.driver.manage().window().maximize();
//			Thread.sleep(6000);
//			System.out.println("**********currentwindow: "+windows);
//			break;
//		}
        	 
     
//        System.out.println("*************New Tab : "+AllWindows);
//        System.out.println("****************New "+Mp.driver.getWindowHandle());
       
	}
        Mp.driver.quit();
	}
}
