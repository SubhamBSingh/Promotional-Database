import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import javax.servlet.annotation.*;
import java.sql.*;

@WebServlet("/CheckResult")

public class CheckResult extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();

		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","SUBHAM","admin");

			Statement st = con.createStatement();

			pw.println("<body bgcolor='lightblue'>");
			pw.println("</br>");
			pw.println("</br>");
			pw.println("</br>");
			pw.println("</br>");
			pw.println("</br>");
			pw.println("</br>");
			pw.println("<center>");
			pw.println("<table border='1' cellspacing='0' cellpadding='7' bgcolor='white'>");
			pw.println("<tr bgcolor='lightblue'>");
			pw.println("<th> Username </th>");
			pw.println("<th> Selection </th>");
			pw.println("</tr>");	

			HttpSession hs = req.getSession();
			String UsernameN = (String)hs.getAttribute("UsernameK");

			ResultSet rs = st.executeQuery("select * from EastCoastRailway where Username='"+UsernameN+"'");

			while(rs.next())
			{
				String FirstName = rs.getString("FirstName");
				String MiddleName = rs.getString("MiddleName");
				String LastName = rs.getString("LastName");

				String Username = rs.getString("Username");
				String Password = rs.getString("Password");

				String SecurityQuestion = rs.getString("SecurityQuestion");
				String Answer = rs.getString("Answer");

				String Gender = rs.getString("Gender");

				String DateD = rs.getString("DateD");
				String Month = rs.getString("Month");
				String Year = rs.getString("Year");

				String Category = rs.getString("Category");

				String PlotNumber = rs.getString("PlotNumber");
				String Street = rs.getString("Street");
				String City = rs.getString("City");
				String PinCode = rs.getString("PinCode");
				String District = rs.getString("District");
				String State = rs.getString("State");

				String STDCode = rs.getString("STDCode");
				String TNumber = rs.getString("TNumber");

				String MNumber = rs.getString("MNumber");
				String ANumber = rs.getString("ANumber");

				String EmailID = rs.getString("EmailID");

				String Designation = rs.getString("Designation");
				String PostAF = rs.getString("PostAF");

				String Station = rs.getString("Station");
				String Office = rs.getString("Office");
				String Examination = rs.getString("Examination");
			
				String DesignationCA = rs.getString("DesignationCA");

				String YearsOF = rs.getString("YearsOF");

				String Selection = rs.getString("Selection");

				if(Category.equals("General"))
				{
					rs = st.executeQuery("update EastCoastRailway set Selection='Selected' where Username='"+UsernameN+"'");	
				}

				else
				{
					rs = st.executeQuery("update EastCoastRailway set Selection='Not Selected' where Username='"+UsernameN+"'");	
				}

				pw.println("<tr>");
				pw.println("<td>"+Username+"</td>");
				pw.println("<td>"+Selection+"</td>");
				pw.println("</tr>");
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