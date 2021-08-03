<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="sp" uri="http://www.springframework.org/tags/form"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<div class="container">
		<sp:form action="${pageContext.request.contextPath}/user/add "
			modelAttribute="user" method="post">
			<div class="form-group">
				<label>Enter name</label>
				<sp:input path="username" placeholder="Enter Name"
					class="form-control" />
					<sp:errors path="username" class="text-danger"/>
			</div>
			<div class="form-group">
				<label>Enter Email</label>
				<sp:input path="email" placeholder="Enter email"
					class="form-control" />
					<sp:errors path="email" class="text-danger"/>
			</div>
			<div class="form-group">
				<label>Enter Password</label>
				<sp:input path="password" placeholder="Enter password"
					class="form-control" />
					<sp:errors path="password" class="text-danger"/>
			</div>
			<div class="form-group">
				<input type="submit" value="Register"
					class="btn btn-primary btn-block"> <input type="reset"
					value="Reset" class="btn btn-danger btn-block">
			</div>
		</sp:form>
	</div>
</body>
<jsp:include page="footer.jsp"></jsp:include>
</html>