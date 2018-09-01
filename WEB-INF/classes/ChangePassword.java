import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import javax.servlet.annotation.*;
import java.sql.*;

@WebServlet("/ChangePassword")

public class ChangePassword extends HttpServlet
{
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();

		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","SUBHAM","admin");

			Statement st = con.createStatement();

			HttpSession hs = req.getSession();
			String UsernameN = (String)hs.getAttribute("UsernameK");
			String PasswordN = (String)hs.getAttribute("PasswordK");

			String OPassword = req.getParameter("OPassword");
			String NPassword = req.getParameter("NPassword");
			String CPassword = req.getParameter("CPassword");

			if(NPassword.equals(CPassword) && PasswordN.equals(OPassword))
			{
				ResultSet rs = st.executeQuery("update EastCoastRailway set Password='"+NPassword+"' where Username='"+UsernameN+"'");
				RequestDispatcher rd = req.getRequestDispatcher("Login.jsp?msg=Password Changed Successfully");
				rd.include(req,res);
			}

			else
			{
				RequestDispatcher rd = req.getRequestDispatcher("ChangePassword.jsp?msg=Passwords do not Match");
				rd.include(req,res);
			}			

			con.close();
		}
		catch(Exception E)
		{
			pw.println("Exception : "+E);
		}
	}
}