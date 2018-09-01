import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import javax.servlet.annotation.*;
import pack.*;

@WebServlet("/Login")

public class Login extends HttpServlet
{
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		
		PrintWriter pw = res.getWriter();

		String Username = req.getParameter("Username");
		String Password = req.getParameter("Password");

		if(Username.length() == 0)
		{
			pw.println("Username Field Empty");
		}
		else if(Password.length() == 0)
		{
			pw.println("Password Field Empty");
		}
		else
		{
			String Status = DBBean.CheckUser(Username,Password);
		
			if(Status.equals("Valid"))
			{
				HttpSession session = req.getSession();
				session.setAttribute("UsernameK",Username);
				session.setAttribute("PasswordK",Password);
				res.sendRedirect("Home.jsp");
			}
			else
			{
				RequestDispatcher rd = req.getRequestDispatcher("Login.jsp?msg=Invalid Credentials");
				rd.include(req,res);
			}
		}
	}
}