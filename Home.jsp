<%
	String UsernameK = (String) session.getAttribute("UsernameK");

	if(UsernameK == null)
	{
		response.sendRedirect("Login.jsp?msg=Login Again");
	}

	out.println("Welcome "+UsernameK);
%>
	<body bgcolor="lightblue">
		<br/>
		<br/>
		<br/>
		<br/>
		<br/>
		<br/>
		<center>

		<table>
		<tr>
			<td> <a href="ViewProfile"> View Profile </a> </td>
			<td> </td>
			<td> </td>
			<td> <a href="ChangePassword.jsp"> Change Password </a> </td>
			<td> </td>
			<td> </td>
			<td> <a href="CheckResult"> Check Result </a> </td>
		</tr>
		<tr>
			<td> </td>
		</tr>
		<tr>
			<td> </td>
		</tr>
		<tr>
			<td> </td>
		</tr>
		<tr>
			<td> </td>
		</tr>
		<tr>
			<td> <a href="Logout.jsp"> Logout </a> </td>
		</tr>
		</table>
	</body>
	