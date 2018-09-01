import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import javax.servlet.annotation.*;
import java.sql.*;

@WebServlet("/ViewProfile")

public class ViewProfile extends HttpServlet
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
			pw.println("<th> FirstName </th>");
			pw.println("<th> MiddleName </th>");
			pw.println("<th> LastName </th>");

			pw.println("<th> Username </th>");
			pw.println("<th> Password </th>");

			pw.println("<th> Security Question </th>");
			pw.println("<th> Answer </th>");

			pw.println("<th> Gender </th>");

			pw.println("<th> Date </th>");
			pw.println("<th> Month </th>");
			pw.println("<th> Year </th>");

			pw.println("<th> Category </th>");

			pw.println("<th> Plot Number </th>");
			pw.println("<th> Street </th>");
			pw.println("<th> City </th>");
			pw.println("<th> Pin Code </th>");
			pw.println("<th> District </th>");
			pw.println("<th> State </th>");

			pw.println("<th> STD Code </th>");
			pw.println("<th> Number </th>");

			pw.println("<th> Mobile Number </th>");
			pw.println("<th> Alternate Mobile Number </th>");

			pw.println("<th> Email ID </th>");

			pw.println("<th> Designation </th>");
			pw.println("<th> Post Applying For </th>");

			pw.println("<th> Station </th>");
			pw.println("<th> Office </th>");
			pw.println("<th> Examination </th>");

			pw.println("<th> Designation Controlling Authority </th>");

			pw.println("<th> Years of Experience </th>");
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

				pw.println("<tr>");
				pw.println("<td>"+FirstName+"</td>");
				pw.println("<td>"+MiddleName+"</td>");
				pw.println("<td>"+LastName+"</td>");

				pw.println("<td>"+Username+"</td>");
				pw.println("<td>"+Password+"</td>");

				pw.println("<td>"+SecurityQuestion+"</td>");
				pw.println("<td>"+Answer+"</td>");

				pw.println("<td>"+Gender+"</td>");

				pw.println("<td>"+DateD+"</td>");
				pw.println("<td>"+Month+"</td>");
				pw.println("<td>"+Year+"</td>");

				pw.println("<td>"+Category+"</td>");

				pw.println("<td>"+PlotNumber+"</td>");
				pw.println("<td>"+Street+"</td>");
				pw.println("<td>"+City+"</td>");
				pw.println("<td>"+PinCode+"</td>");
				pw.println("<td>"+District+"</td>");
				pw.println("<td>"+State+"</td>");

				pw.println("<td>"+STDCode+"</td>");
				pw.println("<td>"+TNumber+"</td>");

				pw.println("<td>"+MNumber+"</td>");
				pw.println("<td>"+ANumber+"</td>");

				pw.println("<td>"+EmailID+"</td>");

				pw.println("<td>"+Designation+"</td>");
				pw.println("<td>"+PostAF+"</td>");

				pw.println("<td>"+Station+"</td>");
				pw.println("<td>"+Office+"</td>");
				pw.println("<td>"+Examination+"</td>");

				pw.println("<td>"+DesignationCA+"</td>");
			
				pw.println("<td>"+YearsOF+"</td>");
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