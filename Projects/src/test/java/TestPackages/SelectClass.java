package TestPackages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectClass {
	
	mpt Mp = new mpt();
	@Test
	public void SelectMethod() throws Exception
	{
		Mp.setup();
		Mp.driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		Thread.sleep(3000);
		Select SeleniumCommands = new Select(Mp.driver.findElement(By.xpath("//select[contains(@name,'selenium_commands')]")));
		SeleniumCommands.selectByVisibleText("Navigation Commands");
		Thread.sleep(6000);
		Mp.driver.quit();
	}

}
