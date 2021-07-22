<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>

<div class="row">
		<c:forEach items="${books}" var="book">
		<div class="col-lg-3 col-xl-2 col-md-6 col-sm-12 text-center">
		<a href="${pageContext.request.contextPath}/book/bookid/${book.prodId}">
			<img src="https://static.toiimg.com/imagenext/toiblogs/photo/blogs/wp-content/uploads/2016/08/Harry-Potter-and-the-Cursed-Child.jpg" class="col-lg-10"/></a>
		<h2>${book.prodName}</h2>
		<p>Rs.${book.prodPrice}</p>
		</div>
	</c:forEach>
</div>
</body>
</html>