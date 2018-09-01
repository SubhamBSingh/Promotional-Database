import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import javax.servlet.annotation.*;
import java.sql.*;

@WebServlet("/ForgetPassword")

public class ForgetPassword extends HttpServlet
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

			String UsernameF = req.getParameter("UsernameF");
			String AnswerF = req.getParameter("AnswerF");

			ResultSet rs = st.executeQuery("select * from EastCoastRailway");

				while(rs.next())
				{
					String UsernameT = rs.getString("Username");
					String Password = rs.getString("Password");
					String Answer = rs.getString("Answer");
	
					if(UsernameF.equals(UsernameT) && AnswerF.equals(Answer))
					{
						pw.println("<body bgcolor='lightblue'>");
						pw.println("</br>");
						pw.println("</br>");
						pw.println("</br>");
						pw.println("</br>");
						pw.println("</br>");
						pw.println("</br>");
						pw.println("<center>");
						pw.println("<table border='1' cellspacing='0' cellpadding='7' width='100%' bgcolor='white'>");
						pw.println("<tr bgcolor='lightblue'>");
						pw.println("<th> Username </th>");
						pw.println("<th> Password </th>");
						pw.println("</tr>");

						pw.println("<tr>");
						pw.println("<td>"+UsernameT+"</td>");
						pw.println("<td>"+Password+"</td>");
						pw.println("</tr>");

						RequestDispatcher rd = req.getRequestDispatcher("Login.jsp?msg=Login Now");
						rd.include(req,res);
					}

					else
					{
						RequestDispatcher rd = req.getRequestDispatcher("ForgetPassword.jsp?msg=Try Again");
						rd.include(req,res);
					}
				}
				pw.println("</table>");
				pw.println("</body>");

				rs.close();			
				con.close();
		}
		catch(Exception E)
		{
			pw.println("Exception : "+E);
		}
	}
}