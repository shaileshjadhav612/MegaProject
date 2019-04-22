package TestPackages;

import org.testng.annotations.Test;

public class StringComputations {
	
	@Test
	public void concatination()
	{
		String s1="Shailesh";
		String s2="Jadhav";
		String s3="Shailesh";
		System.out.println(s1.concat("Jadhav"));
		System.out.println(s1==s3);
		
	}

}
