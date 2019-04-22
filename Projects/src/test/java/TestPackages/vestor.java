package TestPackages;

import java.util.Vector;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class vestor {
	
	
	@Test
	public void vectoranalysis()
	{
		
		
		Vector v = new Vector(5,2);
		v.add("stela");	
		
		v.add("39");
		v.add("jasmine");
		v.add("neha");
		System.out.println("capacity is : "+v.capacity());
		System.out.println("size is : "+v.size());
		v.add("shailesh");
		v.add("minal");
		System.out.println("vector values: "+v);
		v.clone();
	DesiredCapabilities ss = DesiredCapabilities.android();	
		System.out.println("vector values: "+v);
		v.trimToSize();
		System.out.println("vector values: "+v);
		
	}

}
