<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<style>  
	table,tr,td
	{
border:1px solid black;
width:30%;
text-align:center;
}
</style>
</head>
<body bgcolor>
<center>

<form action="addrooms">
<table border=10>
  <h2> List of hotels</h2>
                     
			<tr>

				<th>Hotel Name</th>

				<th>Phone No</th>

				<th>Flat No</th>

				<th>City</th>

				<th>State</th>

				<th>Website</th>

				<th>Country</th>

				<th>Pincode</th>

				<th>Total Rooms</th>

				<th>Available Rooms</th>

				<th>Rent</th>

			</tr>

			<c:forEach var="hotel" items="${list }">

				<tr>

					<td>${hotel.getHname() }</td>

					<td>${hotel.getPhno() }</td>

					<td>${hotel.getFlatno() }</td>

					<td>${hotel.getCity() }</td>

					<td>${hotel.getState() }</td>

					<td><a href="https://${hotel.getWebsite()}">${hotel.getWebsite()}</a></td>

					<td>${hotel.getCountry() }</td>

					<td>${hotel.getPincode() }</td>

					<td>${hotel.getTrooms() }</td>

					<td>${hotel.getUvrooms() }</td>

					<td>${hotel.getRent() }</td>

				</tr>

				

			</c:forEach>

		</table>



</form>
</center>
</body>
</html>