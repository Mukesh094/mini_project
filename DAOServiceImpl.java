package jsp_mvc_modelLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DAOServiceImpl implements DAOService {
	Connection con;
	Statement stmnt;
      public void connectDB() {
    	  try {
    		  Class.forName("com.mysql.cj.jdbc.Driver");
    		  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo_1","root","test");
 		      stmnt=con.createStatement();
		} catch (Exception e) {
			
		}
      }
	@Override
	public boolean verifyCredential(String email, String password) {
		try {
		     ResultSet res=stmnt.executeQuery("select * from project where email='"+email+"'and password='"+password+"'");
		     return res.next();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
		return false;
	}
	@Override
	public void view(String name, String age, String city, String email, String mobno) {
		try {
		    stmnt.executeUpdate("insert into registrationdetails values('"+name+"','"+age+"','"+city+"','"+email+"','"+mobno+"')");
		     
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
		
	}
	@Override
	public ResultSet readRegis() {
		try {
		     ResultSet result=stmnt.executeQuery("select * from registrationdetails");
		     return result;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
		return null;
	}

}
