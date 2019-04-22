package TestPackages;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class ImageCompairision {

	WebDriver driver; 
	
	

	
	
	@Test
	public void ImageCompairisionauto() throws Exception
	{
		//sj.setup();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shailesh.jadhav\\git\\MegaProject\\Projects\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://www.tutorialspoint.com/ruby/");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		WebElement element = driver.findElement(By.xpath("//img[contains(@src,'/ruby/images/ruby-mini-logo.jpg')]"));
		Thread.sleep(3000);
		Screenshot ImageCaptured = new AShot().takeScreenshot(driver, element);
		
		     ImageIO.write(ImageCaptured.getImage(),"PNG",new File("D:\\\\scrrenshots\\\\pff.jpg"));
		
//		 TakesScreenshot scrShot =((TakesScreenshot)driver);	      
//	                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
//	                File DestFile=new File("D://scrrenshots/googleLogo.png");
//	                FileUtils.copyFile(SrcFile, DestFile);
		     
//		     Screenshot fpScreenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver,element);
//		     ImageIO.write(fpScreenshot.getImage(),"PNG",new File("D:\\\\scrrenshots\\\\jl.png"));     
		 	
		     
		     
		     
		     
		     
		    
		 	BufferedImage expectedImage = ImageIO.read(new File("D://scrrenshotcompare//full.png"));
		 	BufferedImage actualimage= ImageCaptured.getImage();
		 	ImageDiffer diff = new ImageDiffer();
		 	ImageDiff imgdiff =diff.makeDiff(expectedImage, actualimage);
		 	if(imgdiff.hasDiff()==true)
		 	{
		 		System.out.println("Images are not same"); 
		 	}
		 	else
		 	
		 	{
		 		System.out.println("Images are same");
		 	}
		     driver.quit();
		
		
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
