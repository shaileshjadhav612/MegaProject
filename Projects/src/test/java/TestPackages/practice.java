package TestPackages;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class practice {
	
	mpt sj = new mpt();
	
	public void Takescreenshot(WebDriver driver,String path) throws IOException
	{
		Screenshot ImageCaptured = new AShot().takeScreenshot(driver);
		
	     ImageIO.write(ImageCaptured.getImage(),"PNG",new File(path));
	
		
	}
	@Test
	public void practiceTutorial() throws Exception
	{
		sj.setup();
		sj.driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		WebElement radiobutton = sj.driver.findElement(By.xpath("//input[@id='exp-3']"));
		radiobutton.click();
		
		Takescreenshot(sj.driver, "D:\\\\scrrenshots\\\\tools.jpg");
		JavascriptExecutor js = (JavascriptExecutor) sj.driver;
		js.executeScript("window.scrollBy(0,3000)");
		Takescreenshot(sj.driver, "D:\\\\scrrenshots\\\\tools2.jpg");
		js.executeScript("window.scrollBy(0,5000)");
		sj.driver.findElement(By.xpath("//nav//span[@class='menu-text' and text()= 'Tutorial']")).click();
		sj.driver.findElement(By.xpath("(//ul[@class='sub-nav level-arrows-on']//span//span[contains(.,'Web Automation Tools')])[1]")).click();
		Takescreenshot(sj.driver, "D:\\\\scrrenshots\\\\tools3.jpg");
		sj.driver.findElement(By.xpath("//input[@id='photo']")).click();
		StringSelection stringselection = new StringSelection("C:\\Users\\shailesh.jadhav\\Desktop\\UI Templates\\Skill Set");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselection,null);
		 Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
		 
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(6000);
			Takescreenshot(sj.driver, "D:\\\\scrrenshots\\\\tools5.jpg");
		
		sj.driver.quit();
	}

}
