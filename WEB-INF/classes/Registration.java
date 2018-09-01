import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import javax.servlet.annotation.*;
import java.sql.*;

@WebServlet("/Registration")

public class Registration extends HttpServlet
{
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");

		PrintWriter pw = res.getWriter();

		try
		{
			String FirstName = req.getParameter("FirstName");
			String MiddleName = req.getParameter("MiddleName");
			String LastName = req.getParameter("LastName");

			String Username = req.getParameter("Username");
			String Password = req.getParameter("Password");
			
			String SecurityQuestion = req.getParameter("SecurityQuestion");
			String Answer = req.getParameter("Answer");

			String Gender = req.getParameter("Gender");

			String DateD = req.getParameter("DateD");
			String Month = req.getParameter("Month");
			String Year = req.getParameter("Year");

			String Category = req.getParameter("Category");
			
			String PlotNumber = req.getParameter("PlotNumber");
			String Street = req.getParameter("Street");
			String City = req.getParameter("City");
			String PinCode = req.getParameter("PinCode");
			String District = req.getParameter("District");
			String State = req.getParameter("State");

			String STDCode = req.getParameter("STDCode");
			String TNumber = req.getParameter("TNumber");
			String MNumber = req.getParameter("MNumber");
			String ANumber = req.getParameter("ANumber");

			String EmailID = req.getParameter("EmailID");

			String Designation = req.getParameter("Designation");
			String PostAF = req.getParameter("PostAF");

			String Station = req.getParameter("Station");
			String Office = req.getParameter("Office");

			String Examination = req.getParameter("Examination");

			String DesignationCA = req.getParameter("DesignationCA");

			String YearsOF = req.getParameter("YearsOF");

			String Selection = "Not Available";

			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","SUBHAM","admin");
			
			Statement st = con.createStatement();

			int count = st.executeUpdate("insert into EastCoastRailway values('"+FirstName+"','"+MiddleName+"','"+LastName+"','"+Username+"','"+Password+"','"+SecurityQuestion+"','"+Answer+"','"+Gender+"','"+DateD+"','"+Month+"','"+Year+"','"+Category+"','"+PlotNumber+"','"+Street+"','"+City+"','"+PinCode+"','"+District+"','"+State+"','"+STDCode+"','"+TNumber+"','"+MNumber+"','"+ANumber+"','"+EmailID+"','"+Designation+"','"+PostAF+"','"+Station+"','"+Office+"','"+Examination+"','"+DesignationCA+"','"+YearsOF+"','"+Selection+"')");

			if(count > 0)
			{
				RequestDispatcher rd = req.getRequestDispatcher("Login.jsp?msg=Registered Successfully");
				rd.include(req,res);
			}

			else
			{
				RequestDispatcher rd = req.getRequestDispatcher("Registration.jsp?msg=Try Again");
				rd.include(req,res);
			}

			con.close();
		}
		catch(Exception E)
		{
			pw.println("Error : "+E);
		}		
	}
}