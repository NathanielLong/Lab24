<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/superhero/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-LS4/wo5Z/8SLpOLHs0IbuPAGOWTx30XSoZJ8o7WKH0UJhRpjXXTpODOjfVnNjeHu"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>registerform</title>
</head>
<body>
	<div class="jumbotron">
		<form action="add-person" method="post"
			onsubmit="return validateInput();">

			First Name: <input type="text" id="f" name="firstname">
			<hr>
			Last Name: <input type="text" id="l" name="lastname">
			<hr>
			Email: <input type="text" id="e" name="mail">
			<hr>
			Phone Number: <input type="number" id="ph" name="phone">
			<hr>
			Password: <input type="password" id="psw" name="password">
			<hr>
			<input class="btn-primary" type="submit" value="Submit">
		</form>
	</div>
	<script>
		function validateInput() {
			var f = document.getElementById("f").value;
			var l = document.getElementById("l").value;
			var e = document.getElementById("e").value;
			var ph = document.getElementById("ph").value;
			var psw = document.getElementById("psw").value;

			if (2 >= f.length) {
				alert("Please enter a valid first name!");
				return false;
			}
			if (2 >= l.length) {
				alert("Please enter a valid last name!");
				return false;
			}
			if ((10 < ph.length) || (10 > ph.length)) {
				alert("Please enter a valid phone number (Do NOT include hyphens)")
				return false;
			}

		}
	</script>
</body>
</html>