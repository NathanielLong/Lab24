<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<style>
.button {
  border: none;
  padding: 15px 32px;
  text-align: center;
  margin: 4px 2px;
}
</style>
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/superhero/bootstrap.min.css" rel="stylesheet" integrity="sha384-LS4/wo5Z/8SLpOLHs0IbuPAGOWTx30XSoZJ8o7WKH0UJhRpjXXTpODOjfVnNjeHu" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>homepage</title>
</head>
<body>
<div class="jumbotron">
<h2>Welcome to Grand Coffee!
<a class="btn btn-primary" href="registeredusers" style="float: right;">Registered Users</a>
<a class="btn btn-primary" href="register" style="float: right;">Register?</a>
<a class="btn btn-primary" href="shoppingcart" style="float: right;">Shopping Cart</a>
</h2>
</div>

<table class="table">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Description</th>
			<th>Quantity</th>
			<th>Price</th>
		</tr>
		<c:forEach var="p" items="${productList }">
			<tr>
				<td>${p.id }</td>
				<td>${p.name }</td>
				<td>${p.description }</td>
				<td>${p.quantity }</td>
				<td>${p.price }</td>
				<td><a class="btn btn-primary" href="update-cart?id=${p.id }">Add to Cart</a></td>

			</tr>
		</c:forEach>
	</table>

</body>
</html>