
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

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
<h2>Booking Details</h2>

	

	<div class="tbl">

			<table border=5">

			<tr>

				<th>Customer PhoneNo</th>

				<th>Hotel PhoneNo</th>

				<th>Hotel Name</th>

				<th>No of Rooms</th>

				<th>Room Rent</th>

				<th>No of Days</th>

				<th>From Date</th>

				<th>End Date</th>


			</tr>

			<c:forEach var="bd" items="${list }">

			<form action="cancel_bookings">

				<tr>

					<td><input type="hidden" name="cphno" value="${bd.getCphno()}">${bd.getCphno()}</td>

					<td><input type="hidden" name="hphno" value="${bd.getHphno()}">${bd.getHphno()}</td>

					<td><input type="hidden" name="hname" value="${bd.getHname()}">${bd.getHname()}</td>

					<td><input type="hidden" name="wrooms" value="${bd.getWrooms()}">${bd.getWrooms()}</td>

					<td><input type="hidden" name="trent" value="${bd.getTrent()}">${bd.getTrent()}</td>

					<td><input type="hidden" name="days" value="${bd.getDays()}">${bd.getDays()}</td>

					<td><input type="hidden" name="fdate" value="${bd.getFdate()}">${bd.getFdate()}</td>

					<td><input type="hidden" name="edate" value="${bd.getEdate()}">${bd.getEdate()}</td>

				</tr>

			</form>

			</c:forEach>

		</table>

	</div>

</body>
</center>

</html>