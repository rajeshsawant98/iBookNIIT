<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>${book.prodName}</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<div class="container">
<div class="row">
		<div class="col-lg-6">
		<img src="${book.imglink}" >
	</div>
	<div class="col-lg-6">
		<h2>${book.prodName}</h2>
		<p>Rs.${book.prodPrice}</p>
		<p>${book.prodDesc}</p>
		<a href="" class="btn btn-primary">Buy</a>
		<a href="${book.link}" target ="new" class="btn btn-warning ">Read</a>
		<a href="" class="btn btn-success">Add to Cart</a>
		<a href="${pageContext.request.contextPath}/book/edit/${book.prodId}" class="btn btn-secondary">Edit</a>
		<a href="${pageContext.request.contextPath}/book/delete/${book.prodId}" class="btn btn-danger">Delete</a>
	</div>
</div>
</div>
</body>
</html>