<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<div class="container">
<div class="form-group">
<label>Enter name</label>
<input type="text" name="username" placeholder="Enter name" class="form-control">
	</div>
<div class="form-group">
<label>Enter Email</label>
<input type="email" name="pass" placeholder="Enter email" class="form-control">
</div>
	<div class="form-group">
<label>Enter Password</label>
<input type="password" name="pass" placeholder="Enter password" class="form-control">
</div>
<div class="form-group">
<input type="submit" value="Register" class="btn btn-primary btn-block">
<input type="reset" value="Reset" class="btn btn-danger btn-block">
</div>
</div>
</body>
</html>