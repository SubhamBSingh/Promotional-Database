<html>
	<head>
		<title> Change Password </title>
	</head>
	<body bgcolor="lightblue">
		<center>
		<br/>
		<br/>
		<br/>
		<br/>
		<br/>
		<br/>
		<br/>
		<br/>
		<br/>
		<h3> Change Password </h3>

		<%
			String msg = request.getParameter("msg");

			if(msg != null)
			{
				out.println(msg);
			}
		%>

		<form action="ChangePassword" method="post">
			<table cellpadding="5px">
				<tr>
					<td> Current Password : </td>
					<td> <input type="password" name="OPassword"/> </td>
				</tr>
				<tr>
					<td> New Password : </td>
					<td> <input type="password" name="NPassword"/> </td>
				</tr>
				<tr>
					<td> Confirm Password : </td>
					<td> <input type="password" name="CPassword"/> </td>
				</tr>
				<tr>
					<td> </td>
				</tr>
				<tr>
					<td> </td>
				</tr>
				<tr>
					<td> </td>
					<td> <input type="submit" value="Confirm"/>
					     <input type="reset" value="Clear"/> </td>
				</tr>
			</table>
		</form>
	</body>
</html>