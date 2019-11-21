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
<title>registeredusers</title>
</head>
<body>
<h1><a class="btn btn-primary" href="/" style="float: right;">Back to Home</a></h1>
	<div class="container">
		<table class="table">
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
			</tr>
			<c:forEach var="u" items="${userList }">
				<tr>
					<td>${u.firstname }</td>
					<td>${u.lastname }</td>
				</tr>
			</c:forEach>
		</table>
	</div>


</body>
</html>