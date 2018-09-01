<html>
	<head>
		<title> Forget Password </title>
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
		<br/>
		<br/>
		<br/>
		<h3> Forget Password </h3>

		<%
			String msg = request.getParameter("msg");

			if(msg != null)
			{
				out.println(msg);
			}
		%>

		<form action="ForgetPassword" method="post">
			<table cellpadding="5px">
				<tr>
					<td> Username : </td>
					<td> <input type="text" name="UsernameF"/> </td>
				</tr>
				<tr>
					<td> Security Question : </td>
					<td> <select name="SecurityQuestionF"> 
					     <option> Select </option>
					     <option> First ? </option>
					     <option> Second ? </option> 
					     <option> Third ? </option>
					     <option> Fourth ? </option>
					     </select> </td> 
				</tr>
				<tr>
					<td> Answer : </td>
					<td> <input type="text" name="AnswerF"/> </td>
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