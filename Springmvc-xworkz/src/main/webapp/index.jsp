<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Natural Calamities Register</title>
</head>
<body>
	<div align="center">
		<h1>INFORMATION OF NATURAL CALAMITIES</h1>
		<form action="register.do" method="post">
			<table>
				<tr>
					<td>PLACE</td>
					<td><input type="text" name="place" maxlength="20" size="20" id="place"><br></td>
				</tr>
				<tr>
					<td>DATE</td>
					<td><input type="text" name="date" id="date"><br></td>
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