package TestPackages;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class StringArray {
	
	
	@Test
	public void Array()
	{
		
		SoftAssert sr = new SoftAssert();
		String [] Booksoptions = {"BOOKS","GENRE","Romance","Biography & Autography","Action, Adventure & Horror","Sports & Health","Travel & Cooking","Arts & Satire","Business & Economy","History & Geography","Politics & Social Sciences","More"};

		String[] Booksops= {"စာအုပ္မ်ား","အမ်ဳိးအစား","အခ်စ္၀တၳဳ","အထၱဳပၸတိ ႏွင့္ ကုိယ္တုိင္ေရးအတၳဳပၸတၱိ","အက္ရွင္၊ စြန္႔စားခန္း ႏွင့္ ထိတ္လန္႔ဖြယ္ရာ  ","အားကစားႏွင့္ က်န္းမာေရး","ခရီးသြားျခင္းႏွင့္ အစားအစာ","အႏုပညာႏွင့္ သေရာ္စာ","စီးပြားေရးႏွင့္ အလုပ္အကုိင္","သမုိင္းႏွင့္ ဘူမိေဘတ","ႏုိင္ငံေရးႏွင့္ လူမႈသိပၸံ","ပုိမုိ၍"};
	
		String[] Booksoops= {"စာအုပ္မ်ား","အမ်ဳိးအစား","အခ်စ္၀တၳဳ","အထၱဳပၸတိ ႏွင့္ ကုိယ္တုိင္ေရးအတၳဳပၸတၱိ","အက္ရွင္၊ စြန္႔စားခန္း ႏွင့္ ထိတ္လန္႔ဖြယ္ရာ  ","အားကစားႏွင့္ က်န္းမာေရး","ခရီးသြားျခင္းႏွင့္ အစားအစာ","အႏုပညာႏွင့္ သေရာ္စာ","စီးပြားေရးႏွင့္ အလုပ္အကုိင္","သမုိင္းႏွင့္ ဘူမိေဘတ","ႏုိင္ငံေရးႏွင့္ လူမႈသိပၸံ","ပုိမုိ၍"};

		int count = Booksops.length;
		System.out.println("************"+count);
		for(int i=0;i<Booksops.length;i++)
		{
			sr.assertEquals(Booksops[i], Booksoops[i], Booksoptions[i]);
			System.out.println(Booksoptions[i]+":  "+Booksops[i]);
		
		}
		
		sr.assertAll();
		
	}

}
