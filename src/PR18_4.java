

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class PR18_4{
	
	  static String driverName = "oracle.jdbc.driver.OracleDriver";
	   static String url = "jdbc:oracle:thin:@localhost:1521/xe";
	   static final String USER = "system";
	   static final String PASS = "system";
	   
public static void main (String args[])
{
	

	  try {
    	  try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      Connection conn = DriverManager.getConnection(url, USER,PASS);
      Statement stmt = conn.createStatement();
      
      
      String sql = "CREATE TABLE DEMO " +
                "(id INTEGER, " +
                " first VARCHAR(255),"+
                "last VARCHAR(225),"+
                "age INTEGER,"+
                "Percentage INTEGER)"; 

     stmt.executeUpdate(sql);
      System.out.println("Created table in given database..."); 
      
      System.out. println(" Driver loaded");
      System.out.println("Connection to the database created");
      String str= "select * from DEMO";
      
      String qurey = "INSERT INTO DEMO VALUES (171, 'Abbas', 'Abbas', 18, 95)";
      stmt.executeUpdate(qurey);
      String qurey1 = "INSERT INTO DEMO VALUES (172, 'Ali', 'sajjad', 18, 75)";
      stmt.executeUpdate(qurey1);
      String qurey2 = "INSERT INTO DEMO VALUES (173, 'shama', 'Fatima', 67, 60)";
      stmt.executeUpdate(qurey2);
     System.out.println("Inserted records into the table...");
      
      
      ResultSet rs=stmt.executeQuery(str);
      String text=" ";
      System.out.println("Roll Number \t Name");
      
 
      
      while(rs.next())
      {
    	  if(rs.getInt(5) > 70) {
    	  text= text+rs.getInt(1)+"\t"+rs.getString(2)+ "\t"+rs.getString(3)+ "\t"+rs.getInt(4)+ "\t"+rs.getInt(5)+"\n";
    	  }
      }
      System.out.print(text);
      stmt.close();
      	conn.close();
	  }
	  catch   (SQLException e) {
	         e.printStackTrace();
		  }


}
}