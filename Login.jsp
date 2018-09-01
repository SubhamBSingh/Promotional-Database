<html>
	<head>
		<title> Login </title>
	<head>
	<body bgcolor="lightblue">
		<br/>
		<br/>
		<br/>
		<br/>
		<br/>
		<br/>
		<br/>
		<br/>
		<br/>
		<br/>
		<br/>
		<center>
		<h3> Login </h3>

		<%
			String msg = request.getParameter("msg");

			if(msg != null)
			{
				out.println(msg);
			}
		%>
		
		<form action="Login" method="post">
			<table cellpadding="5px">
				<tr>
					<td> Username : </td>
					<td> <input type="text" placeholder="Username" name="Username"/> </td>
				</tr>
				<tr>
					<td> Password : </td>
					<td> <input type="password" placeholder="Password" name="Password"/> </td>
				</tr>
				<tr>
					<td> </td>
					<td> <input type="submit" value="Sign In"/>
					     <input type="reset" value="Clear"/> </td>
				</tr>
				<tr>
					<td> </td>
					<td> </td>
				</tr>
				<tr>
					<td> </td>
					<td> </td>
				</tr>
				<tr>
					<td> </td>
					<td> </td>
				</tr>
				<tr>
					<td> Not Registered ? </td>
					<td> <a href="Registration.jsp"> Register Now </a> </td>
				</tr>
				<tr>
					<td> Forget Password ? </td>
					<td> <a href="ForgetPassword.jsp"> Recover Now </a> </td>
				</tr>
			</table>
		</form>
	</body>
</html>