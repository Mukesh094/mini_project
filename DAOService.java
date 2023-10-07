package jsp_mvc_modelLayer;

import java.sql.ResultSet;

public interface DAOService {
	public void connectDB();
   public boolean verifyCredential(String email, String password);
   public void view(String name,String age, String city, String email, String mobno);

public ResultSet readRegis();
}
