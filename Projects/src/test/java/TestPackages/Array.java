package TestPackages;

import java.awt.List;
import java.util.*;
import java.util.ArrayList;

import org.testng.annotations.Test;

public class Array {
	
	@Test
	public void arrays()
	{
		
		
		int[] rray = {1,2,3,4,5};
		
		String[] arrays= {"a","b","c","e","f","l"};
		
		int n=5;
		
		for(int i=1;i<n;i++)
		{
			
			System.out.println("***"+rray[i]);
		}
		for(int l=0;l<arrays.length;l++)
		{
			System.out.println("********************"+arrays[l]);
		}
	 ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			
		
			list.add(i);
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.println("***********"+list.indexOf(i));
		}	
		
	}

}
