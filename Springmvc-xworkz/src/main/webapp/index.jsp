<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Natural Calamities Register</title>
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
	<div class = "col-25" align="center">
		<h1>INFORMATION OF NATURAL CALAMITIES</h1>
		<form action="register.do" method="post">
			<table>
				<tr>
					<td>PLACE</td>
					<td><input type="text" name="place" maxlength="20" size="20" id="place"><br></td>
				</tr>
				<tr>
					<td>DATE</td>
					<td><input type="text" name="date" maxlength="20" size="20"  id="date"><br></td>
				</tr>
				<tr>
					<td>CAPTURED BY</td>
					<td><input type="text" name="capturedBy" maxlength="40"
						size="40" id="capturedBy"><br></td>
				</tr>
				<tr>
					<td>CALAMITY TYPE</td>
					<td><select name="calamityType" id="calamityType">
							<option value="flood">FLOOD</option>
							<option value="rain">RAIN</option>
							<option value="cyclone">CYCLONE</option>
							<option value="earthquake">EARTHQUAKE</option>
					</select><br></td>
				</tr>
				<tr>
					<td>AREA</td>
					<td><input type="text" name="area" maxlength="40"
						size="40" id="area"><br></td>
				</tr>
				<tr>
					<td>AVERAGE LOSS</td>
					<td><input type="number" name="averageLoss" maxlength="20"
						size="20" id="averageLoss"><br></td>
				</tr>
					<tr>
					<td>NO OF DEATHS</td>
					<td><input type="number" name="noOfDeaths" maxlength="20"
						size="20" id="noOfDeaths"><br></td>
				</tr>
					<tr>
					<td>NO OF INJURED</td>
					<td><input type="number" name="noOfInjured" maxlength="20"
						size="20" id="noOfInjured"><br></td>
				</tr>
			</table>
			<input type="submit" value="REGISTER">
		</form>
	</div>
</body>
</html>
