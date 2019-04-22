package TestPackages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class scrollDown {
	
	mpt Mp =new mpt();
	@Test
	public void srollevent() throws Exception
	{
		Mp.setup();
		
		Mp.driver.get("https://www.seleniumhq.org/download/");
		Mp.driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Thread.sleep(6000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		
		Thread.sleep(9000);
			robot.keyRelease(KeyEvent.VK_DOWN);
		
		Mp.driver.quit();
	}

}
