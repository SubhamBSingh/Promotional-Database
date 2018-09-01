<html>
	<head>
		<title> Registration </title>
	</head>
	<body bgcolor="lightblue">
		<center>
		<h3> Registration </h3>

		<%
			String msg = request.getParameter("msg");

			if(msg != null)
			{
				out.println(msg);
			}
		%>

		<form action="Registration" method="post">
			<table cellpadding="5px">
				<tr>
					<td> Name : </td>
					<td> <input type="text" placeholder="First Name" name="FirstName"/> </td>
					<td> <input type="text" placeholder="Middle Name" name"MiddleName"/> </td>
					<td> <input type="text" placeholder="Last Name" name="LastName"/> </td>
				</tr>
				<tr>
					<td> Username : </td>
					<td> <input type="text" name="Username"/> </td>
				</tr>
				<tr>
					<td> Password : </td>
					<td> <input type="text" name="Password"/> </td>
				</tr>
				<tr>
					<td> Security Question : </td>
					<td> <select name="SecurityQuestion"> 
					     <option> Select </option>
					     <option> First ? </option>
					     <option> Second ? </option> 
					     <option> Third ? </option>
					     <option> Fourth ? </option>
					     </select> </td> 
				</tr>
				<tr>
					<td> Answer : </td>
					<td> <input type="text" name="Answer"/> </td>
				</tr>
				<tr>
					<td> Gender : </td>
					<td> <input type="radio" name="Gender" value="Male"/> Male
					     <input type="radio" name="Gender" value="Female"/> Female </td>
				</tr>
				<tr>
					<td> Date of Birth : </td>
					<td> <input type="text" placeholder="Date" name="DateD"/> </td>
					<td> <input type="text" placeholder="Month" name="Month"/> </td>
					<td> <input type="text" placeholder="Year" name="Year"/> </td>
				</tr>
				<tr>
					<td> Category : </td>
					<td> <select name="Category"> 
					     <option> Select </option>
					     <option> General </option>
					     <option> SC </option>
					     <option> ST </option>
					     <option> OBC </option>
					     <option> SBC </option> 
					     </select> </td>
				</tr>
				<tr>
					<td> Address : </td>
					<td> <input type="text" placeholder="Plot Number" name="PlotNumber"/> </td>
				</tr>
				<tr>
					<td> </td>
					<td> <input type="text" placeholder="Street" name="Street"/> </td>
				</tr>
				<tr>
					<td> </td>
					<td> <input type="text" placeholder="City" name="City"/> </td>
					<td> <input type="text" placeholder="Pin Code" name="PinCode"/> </td>
				</tr>
				<tr>
					<td> </td>
					<td> <input type="text" placeholder="District" name="District"/> </td>
				</tr>
				<tr>
					<td> </td>
					<td> <input type="text" placeholder="State" name="State"/> </td>
				</tr>
				<tr>
					<td> Telephone : </td>
					<td> <input type="text" placeholder="STD Code" name="STDCode"/> </td>
					<td> <input type="text" placeholder="Number" name="TNumber"/> </td>
				</tr>
				<tr>
					<td> Mobile Number : </td>
					<td> <input type="text" name="MNumber"/> </td>
				</tr>
				<tr>
					<td> Alternate Mobile Number : </td>
					<td> <input type="text" name="ANumber"/> </td>
				</tr>
				<tr>
					<td> Email ID : </td>
					<td> <input type="text" name="EmailID"/> </td>
				</tr>
				<tr>
					<td> Designation : </td>
					<td> <input type="text" name="Designation"/> </td>
				</tr>
				<tr>
					<td> Post Applying For : </td>
					<td> <input type="text" name="PostAF"/> </td>
				</tr>
				<tr>
					<td> Station : </td>
					<td> <input type="text" name="Station"/> </td>
				</tr>
				<tr>
					<td> Office : </td>
					<td> <input type="text" name="Office"/> </td>
				</tr>
				<tr>
					<td> Examination : </td>
					<td> <input type="text" name="Examination"/> </td>
				</tr>
				<tr>
					<td> Designation Controlling Authority : </td>
					<td> <input type="text" name="DesignationCA"/> </td>
				</tr>
				<tr>
					<td> Years of Experience : </td>
					<td> <input type="text" name="YearsOE"/> </td>
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
					<td> <input type="submit" value="Register"/>
					     <input type="reset" value="Clear"/> </td>
				</tr>
			</table>
		</form>		
	</body>
</html>