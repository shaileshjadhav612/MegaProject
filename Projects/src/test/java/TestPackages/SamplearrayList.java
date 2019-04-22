package TestPackages;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import org.apache.xbean.propertyeditor.ArrayListEditor;
import org.testng.annotations.Test;

public class SamplearrayList {
	
@Test
public void Arraylist()
{
	ArrayList<String> array = new ArrayList<String>();
	array.add("Pune");
	array.add("Bangluru");
	array.add("Mumbai");
	array.add("Solapur");
	array.add("Pune");
	System.out.println("*********"+array);
	Set<String> set = new HashSet<String>(array);
	System.out.println("*******"+set);
	SortedSet sort = new TreeSet(array);
	System.out.println("*******"+sort);
	for (Object s : sort) {
		System.out.println(" "+s);		
	}
		
}

}
