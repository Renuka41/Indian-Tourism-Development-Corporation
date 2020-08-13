

<!DOCTYPE html>

<html>

<head>

<meta charset="ISO-8859-1">

<title>Insert title here</title>

</head>

<center>


<body>

		<div id="bdy">

		<h2>customer Login</h2>

		

			<form onsubmit="return vlidate_password()" , action="custlogin">

				<table id="tbl">

					<tr>

						<th>User Name*</th>

						<td><input type="text" name="name" id="uname" required></td>

					</tr>

					<tr>

						<th>Password*</th>

						<td><input type="password" name="password" id="password" required></td>

					</tr>

					<tr>

						<td><a href="customerregister.jsp">Register</a></td>


					</tr>

				</table>
										<td><button>Log In</button></td>
				

			</form>

	</div>



</body>
</center>

</html>

