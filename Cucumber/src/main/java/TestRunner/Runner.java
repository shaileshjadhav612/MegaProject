package TestRunner;

import org.junit.runner.RunWith;
import org.testng.TestRunner;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import cucumber.runtime.StepDefinition;

@RunWith(Cucumber.class)	
@CucumberOptions(features= "features",glue= {"StepDefinition"})	

public class Runner {
	
	
	
}
