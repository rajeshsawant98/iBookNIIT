<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="sp" uri="http://www.springframework.org/tags/form"%>
<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<div class="container">
		<c:if test="${b==null}">
			<sp:form action="${pageContext.request.contextPath}/book/add"
				modelAttribute="book" method="post">
				<div class="form-group">
					<label>Enter Product Name</label>
					<sp:input path="prodName" placeholder="Enter Product Name"
						class="form-control" />
						<sp:errors path="prodName" class="text-danger"/>
				</div>
				<div class="form-group">
					<label>Enter Product Price</label>
					<sp:input path="prodPrice" placeholder="Enter Price"
						class="form-control" />
				<sp:errors path="prodPrice" class="text-danger"/>
				</div>
				<div class="form-group">
					<label>Enter Product Link</label>
					<sp:input path="link" placeholder="Enter Link" class="form-control" />
				<sp:errors path="link" class="text-danger"/>
				</div>
				<div class="form-group">
					<label>Enter Product ImageLink</label>
					<sp:input path="imglink" placeholder="Enter Product Image Link" class="form-control" />
				<sp:errors path="imglink" class="text-danger"/>
				</div>
				<div class="form-group">
					<label>Enter Product Description</label>
					<sp:textarea path="prodDesc"
						placeholder="Enter Product Description" class="form-control" />
						<sp:errors path="prodDesc" class="text-danger"/>
				</div>
				<div class="form-group">
					<input type="submit" value="Add Book"
						class="btn btn-primary btn-block"> <input type="reset"
						value="Reset" class="btn btn-danger btn-block">
				</div>
			</sp:form>
		</c:if>
	</div>



	<c:if test="${b!=null}">
	<div class="container">
		<sp:form action="${pageContext.request.contextPath}/book/update" modelAttribute="b" method="post">
			<div class="form-group">
				<sp:hidden path="prodId" placeholder="Enter Prodcut Id" class="form-control"/>
							</div>
							<div class="form-group">
				<label>Enter Product Name</label> 
				<sp:input path="prodName" placeholder="Enter Product Name" class="form-control"/>
			</div>
			<div class="form-group">
					<label>Enter Product Link</label>
					<sp:input path="link" placeholder="Enter Link" class="form-control" />
				</div>
				<div class="form-group">
					<label>Enter Product ImageLink</label>
					<sp:input path="imglink" placeholder="Enter Product Image Link" class="form-control" />
				<sp:errors path="imglink" class="text-danger"/>
				</div>
			<div class="form-group">
				<label>Enter Product Desription</label> 
				<sp:textarea path="prodDesc" placeholder="Enter Product Description" class="form-control"/>
			</div>
				<div class="form-group">
				<label>Enter Product Price</label> 
				<sp:input path="prodPrice" placeholder="Enter Price" class="form-control"/>
			</div>
			<div class="form-group">
				<input type="submit" value="Update Book"
					class="btn btn-primary btn-block" />
					 <input type="reset"
					value="Reset" class="btn btn-danger btn-block" />
			</div>
			</sp:form>
			</div>
			</c:if>
	
</body>
</html>
