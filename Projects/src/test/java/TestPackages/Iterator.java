package TestPackages;

import java.awt.List;
import java.util.*;

import org.testng.annotations.Test;

public class Iterator {
	
	
	
	
	
	@Test
	public void IteratorExample()
	{
		ArrayList newlist = new ArrayList();
		
		for(int i=0;i<10;i++)
		
		{
			newlist.add(i);
		}
		List listobjects = new List();
		
		listobjects.add("laila");
		listobjects.add("juli");
		listobjects.add("monica");
		java.util.Iterator ir = newlist.iterator(); 
		
		while(ir.hasNext())
		{
			System.out.println(ir.next()+" ");
		}
		
		while(ir.hasNext())
		{
			System.out.println(ir.next()+" ");
		}
		System.out.println(ir.next());
	}

}
