import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class summerPages {
	
	
	
	
	WebDriver driver;
	
	@FindBy(xpath="//a[contains(.,'WYSIWYG')]")
	WebElement WYSIWYG;
	
	
	
	
	
	public summerPages(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public clickWYSIWYG()
	{
		WYSIWYG.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}






