<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="updatehotel">
<table id="tbl">
<tr>
<th>Hotel name</th>
<td><input type="text" name="name" id="name" required="Name is Required"></td>
</tr>
<tr>
<th>Contact no*</th>
<td><input type="text" name="pono" id="pono" required></td>
</tr>
<tr>
<th>Total rooms</th>
<td><input type="text" name="totalrooms" id="totalrooms"></td>
</tr>
<tr> <th>Available rooms</th>
<td><input type="text" name="availablerooms" id=" availablerooms"></td>
</tr>
<tr>

</table>
<input type="submit">


</form>

</body>
</html>