package TestPackages;

import java.util.Vector;

import org.testng.annotations.Test;

public class SplitString {





@Test
public void splitStrings()
{
	String  s1= "$%^% Englisht ^&*^&^&^";
	
	String str = s1.substring(5, 13);
	System.out.println("*********"+str);
	
	
	Vector v1 = new Vector();
	v1.add(1);

	v1.add("shailesh");
	Vector< String>v2 = new Vector<String>();
	v2.add("stella");v2.add("jadhav");
	v2.add("meena");
	v2.add("smita");	
	
	System.out.println(v1);
	System.out.println("*************"+v2);
	System.out.println(v2.capacity());
	
	
	
	
	
	
	
	
}





}
