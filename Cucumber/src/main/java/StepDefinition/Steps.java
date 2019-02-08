package StepDefinition;
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;		


public class Steps {
	
	
	
	
 WebDriver driver;			
	    		
	    @Given("^Open the Firefox and launch the application$")					
	    public void open_the_Firefox_and_launch_the_application() throws Throwable							
	    {		
	       System.out.println("********************start");	
	    }		

	    @When("^Enter the Username and Password$")					
	    public void enter_the_Username_and_Password() throws Throwable 							
	    {		
	      System.out.println("*********started");				
	    }		

	    @Then("^Reset the credential$")					
	    public void Reset_the_credential() throws Throwable 							
	    {		
	      System.out.println("***********completed*****************");					
	    }		
	}


