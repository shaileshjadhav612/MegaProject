package TestPackages;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.testng.annotations.Test;

public class DatabaseTesting {

mpt fs = new mpt();
 
 @Test
 public void TestVerifyDB(){
  
  try {
                        
       // This will load the driver
     Class.forName("com.mysql.jdbc.Driver");
     System.out.println("Driver Loaded");
   
   
 
    // Specify the path of the database
 
      String dblocation= "http:192.168.100.22";
 
             
    // This will connect with Database , getConnection taking three argument
    //  first argument Test_Oracle is the dsn which you can change as per your system,
 
 
       Connection con=DriverManager.getConnection("192.168.100.22","jobTracker_user","$jbTkerpass115#");            
 
       System.out.println("Connection created");
 
   // This will create statement  
        Statement smt=con.createStatement();
          
        System.out.println("Statement created");
 
   // Now execute the query, here facebook is the table which I have created in DB 
    
        ResultSet rs=  smt.executeQuery("Select * from JobDetails");
 
        System.out.println("Query Executed");
 
  // Iterate the resultset now
 
       while(rs.next()){
   
       String uname=rs.getString("JobId");
//       String pass=rs.getString("password");
//       String email=rs.getString("email");
 
        System.out.println("Uname is "+uname);
   
  }
}
        catch (Exception e) {
         System.out.println(e.getMessage());
  }
   
  
 }
 
}