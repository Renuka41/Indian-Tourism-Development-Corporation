<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"

    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>

<html>

<head>

<meta charset="ISO-8859-1">

<title>Insert title here</title>

</head>

<center>

<body>


	


		<h2>Balance </h2>

		

			<form action="check_balance">

				<table id="tbl">

					<tr>

						<th>Contact No*</th>

						<td><input type="number" name="phno" id="cno" required></td>

					</tr>

					<tr>

						<th></th>

						<td><button type="submit">Check Balance</button></td>

					</tr>

				</table>

			</form>


</body>
</center>
</html>