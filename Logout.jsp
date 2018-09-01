<%
	session.invalidate();

	response.sendRedirect("Login.jsp?msg=Logged Out");
%>