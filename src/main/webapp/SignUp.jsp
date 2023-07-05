<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h2>Create Account</h2>

		<form action="signup" method="post">
			<table>
				<tr>
					<td>Enter Id:</td>
					<td><input type="text" name="Id" placeholder="Eg:Sunil"
						required="required"></td>
				</tr>
				<tr>
					<td>Owner:</td>
					<td><input type="text" name="owner" placeholder="Eg:Sunil"
						required="required"></td>
				</tr>
				<tr>
					<td>Email:</td>
					<td><input type="text" name="Email_id" placeholder="Email_id"
						required="required"></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type="text" name="password" placeholder="password"
						required="required"></td>
				</tr>
				<tr>
					<td>Mobno:</td>
					<td><input type="text" name="mob_no" placeholder="mob_no"
						required="required"></td>
				</tr>
				<tr>
				
					<td>Gender</td>
					<td><input type="radio" name="Gender">Male
					<input type="radio" name="Gender">Female</td>
				</tr>
				<tr>
					<td>Country</option></td>
					<td><select>
							<option>Select country</option>
							<option>India</option>
							<option>Austrelia</option>
							<option>Nigeria</option>
							<option>Canada</option>
					</select></td>
				</tr>
				<tr>
					<td>
						<button type="reset">Cancel</button>
					</td>
					<td>
						<button type="submit">Signup</button>
					</td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>