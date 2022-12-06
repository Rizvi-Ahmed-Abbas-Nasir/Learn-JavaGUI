import java.sql.*;

class DEMODATABASE{
	
	Connection con;   
	PreparedStatement pst;
	ResultSet rs;
	String url = "com.mysql.cj.jdbc.Driver";
	
	DEMODATABASE(){
		try 
		{
			Class.forName(url);
//			con = DriverManager.getConnection("jdbc:mysql://localhost/javacrud", "root", "");
//			pst = con.prepareStatement("Select * from student_regs");
//			rs = pst.executeQuery();
			
			
		    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/DEMO", "root", "");        
            pst = con.prepareStatement("Select * from TABLEDEMO");
            
            rs =  pst.executeQuery();
            System.out.println(rs);
            
//            if() {
//            	System.out.println("Executed");
//            }
            
            String query = "INSERT INTO TABLEDEMO values('Abbas', '200')";

            Statement sta = con.createStatement();
            int x = sta.executeUpdate(query);
		}
		catch (ClassNotFoundException ex) 
		{
			
		}
		catch(SQLException ex)
		{
			
		}
	}	
	
	
	
	public static void main(String args[]) {
		DEMODATABASE demodatabase = new DEMODATABASE();
	}
	
	
}


