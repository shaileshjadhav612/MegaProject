package TestPackages;

import org.testng.annotations.Test;

public class StarDesign {
	
	
	
	@Test(enabled=false)
	public void Ultimate()
	{
		for(int i=0;i<4;i++)
		{
			for(int j=4;j>i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}


 @Test
 public void diamond()
 {
//	 for(int i=0;i<5;i++)
//	 {
//		 for(int j=i*2+1;j<5;j++)
//		 {
//			 System.out.println("*");
//			 
//		 }
//		 System.out.println();
//	 }
//	 for(int i=3;i<5;i++)
//	 {
//		 for(int j=i*2-i;j>i;j++)
//		 {
//			 System.out.println("*");
//		 }
//		 System.out.println();
//	 }
	 int i;
	 int space=4;
	   for (int j = 1; j <= 5; j++) 
       {
           for ( i = 1; i <= space; i++) 
           {
               System.out.print(" ");
           }
           space--;
           for (i = 1; i <= 2 * j - 1; i++) 
           {
               System.out.print("*");                
           }
           System.out.println("");
       }
       space = 1;
int j=0;
 for (j = 1; j <= 5 - 1; j++) 
 {
     for (i = 1; i <= space; i++) 
     {
         System.out.print(" ");
     }
     space++;
     for (i = 1; i <= 2 * (5- j) - 1; i++) 
     {
         System.out.print("*");
     }
     System.out.println("");
 }
}
}