package pack;
import java.sql.*;

public class DBBean
{
	public static String CheckUser(String Username,String Password)
	{
		try
		{
			String msg = "";
			
			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","SUBHAM","admin");

			Statement st = con.createStatement();

			ResultSet rs = st.executeQuery("select * from EastCoastRailway");

			int count = 0;

			while(rs.next())
			{
				String DUsername = rs.getString("Username");
				String DPassword = rs.getString("Password");

				if(DUsername.equals(Username) && DPassword.equals(Password))
				{
					count = 1;
					break;
				}
			}

			if(count > 0)
			{
				msg = "Valid";
			}

			else
			{
				msg = "Invalid";
			}

			return msg;
		}
		catch(Exception E)
		{
			return E.toString();
		}
	}
}