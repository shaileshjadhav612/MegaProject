package TestPackages;

import org.testng.annotations.Optional;
import org.testng.annotations.Test;

public class Parameters {
	
	@Test
	//@org.testng.annotations.Parameters( {"Username"})
	public void ParameterPassing(@Optional("Reality")  String Username)
	{
		System.out.println("***********************"+Username);
	}

}
