



import java.sql.Connection;
import oracle.jdbc.driver.OracleDriver;


import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PR18_3 {
//   static final String DB_URL = "jdbc:mysql://localhost/studentdatabase";
   
   static String driverName = "oracle.jdbc.driver.OracleDriver";
   static String url = "jdbc:oracle:thin:@localhost:1521/xe";
   static final String USER = "system";
   static final String PASS = "system";

   public static void main(String[] args) {
      // Open a connection
	   
      try {
    	  try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      Connection conn = DriverManager.getConnection(url, USER,PASS);
    		  
         Statement stmt = conn.createStatement();
   	      
         String sql = "CREATE TABLE STUDENT_Demo " +
                   "(id INTEGER, " +
                   " first VARCHAR(255))"; 

        stmt.executeUpdate(sql);
         System.out.println("Created table in given database..."); 
         
         String StName = "Abbas", StClass = "CO5IB";
 		String StEnrol = "2005690171", Stbatch = "3";
         
 		 String qurey = "INSERT INTO STUDENT_Demo VALUES (171, 'Abbas')";
 	      stmt.executeUpdate(qurey);
 	      String qurey1 = "INSERT INTO STUDENT_Demo VALUES (172, 'Ali')";
 	      stmt.executeUpdate(qurey1);
 	      String qurey2 = "INSERT INTO STUDENT_Demo VALUES (173, 'shama')";
 	      stmt.executeUpdate(qurey2);
 	      System.out.println("Inserted records into the table...");
			
			System.out.println("Sucessfully Data Inserted");
			
			
      } catch (SQLException e) {
         e.printStackTrace();
      } 
      
     
		
	
   }
}