package TestPackages;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class Alert {
	
public void screenshotImage() throws IOException
{
	Screenshot ImageCaptured= new AShot().takeScreenshot(driver);
	
	ImageIO.write(ImageCaptured.getImage(), "PNG",new File("D:\\scrrenshots\\pic5.png"));
	
}




public void elementscreenshot(WebElement element) throws IOException
{
	
	
	
	Screenshot ImageCapture=new AShot().takeScreenshot(driver, element);
	ImageIO.write(ImageCapture.getImage(),"PNG",new File("D:\\scrrenshots\\pic55.png") );
}
	WebDriver driver;
	@Test
	public void alertbox() throws IOException, InterruptedException, AWTException
	
	{
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		Actions ac=new Actions(driver);
		WebElement target = driver.findElement(By.xpath("//a[text()='SwitchTo']"));
		ac.moveToElement(target).build().perform();
		Thread.sleep(3000);
		WebElement alertskey = driver.findElement(By.xpath("//a[text()='Alerts']"));
		alertskey.click();
		WebElement site =  driver.findElement(By.xpath("//img[@alt='image not displaying']"));
		elementscreenshot(site);
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		org.openqa.selenium.Alert alert = driver.switchTo().alert();		
		alert.accept();
		driver.findElement(By.xpath("//a[.='Alert with OK & Cancel ']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		System.out.println("*********************"+alert.getText());
		alert.dismiss();
		driver.findElement(By.xpath("//a[.='Alert with Textbox ']")).click();
		driver.findElement(By.xpath("//button[.='click the button to demonstrate the prompt box ']")).click();
		StringSelection stringselection = new StringSelection("shailesh");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselection,null);
		 Robot robot = new Robot();
			robot.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
			robot.keyPress(java.awt.event.KeyEvent.VK_V);
			robot.keyRelease(java.awt.event.KeyEvent.VK_V);
			robot.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);Thread.sleep(3000);		
		alert.accept();
		System.out.println("*********************"+driver.findElement(By.xpath("//p[@id='demo1']")).getText());	
		
		
		WebElement slider = driver.findElement(By.xpath("//a[contains(@class,'ui-slider-handle ui-state-default ui-corner-all')]"));
	   
	    screenshotImage();
	    
	     
	    
	   WebElement sliders = driver.findElement(By.xpath("//a[.='Widgets']"));   
	   ac.moveToElement(sliders).build().perform();
	   driver.findElement(By.xpath("//a[.=' Slider ']")).click();
	    
	    ac.dragAndDropBy(slider, 100, 0).build().perform();
		
		
		driver.quit();
	}

}
