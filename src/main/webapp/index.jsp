<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Greetings-From-XWORKZ</title>
<style>
* {
	box-sizing: border-box;
}

input[type=text], select {
	width: 100%;
	padding: 12px 20px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid #ccc;
	border-radius: 4px;
	box-sizing: border-box;
}

input[type=number], select {
	width: 100%;
	padding: 12px 20px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid #ccc;
	border-radius: 4px;
	box-sizing: border-box;
}

input[type=date], select {
	width: 100%;
	padding: 12px 20px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid #ccc;
	border-radius: 4px;
	box-sizing: border-box;
}

input[type=submit] {
	width: 100%;
	background-color: #4CAF50;
	color: white;
	padding: 14px 20px;
	margin: 8px 0;
	border: none;
	border-radius: 4px;
	cursor: pointer;
}

label {
	padding: 12px 12px 12px 0;
	display: inline-block;
}

input[type=submit]:hover {
	background-color: #45a049;
}

.container {
	border-radius: 5px;
	background-color: #f2f2f2;
	padding: 20px;
}

.col-25 {
	float: left;
	width: 25%;
	margin-top: 6px;
}

div {
	border-radius: 5px;
	background-color: #f2f2f2;
	padding: 20px;
}

/* Clear floats after the columns */
.row:after {
	content: "";
	display: table;
	clear: both;
}
</style>
</head>
<body>
	<div align="center">
		<h1>Greetings From X-WORKZ</h1>
		<form action="greet.do" method="post">
			<table>
				<tr>
					<td>EMAIL ID</td>
					<td><input type="email" name="emailid" maxlength="50"
						size="50" id="emailid"><br></td>
				</tr>
				<tr>
					<td>PASSWORD</td>
					<td><input type="password" name="password" maxlength="20"
						size="20" id="password"><br></td>
				</tr>
				<tr>
					<td> <input type="submit" value="REGISTER" /> </td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>