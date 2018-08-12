<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
		<h1 align="center" style="background-color: #73C6B6;">
			<strong><em>Book Shop</em></strong>
		</h1>
	</div>
	<jsp:include page="header.jsp"></jsp:include>

	<jstl:forEach var="book" items="${sessionScope.books}">

		<div>

			<h3>${book.bookName}
				<small><em>by ${book.authorName}</small></em>
			</h3>
			<img src="image/${book.link}" height="100px" width="100px">
			<h6>${book.bookDesc}</h6>
			<h4>Rs.${book.bookPrice}</h4>
			<a href="add.app?bookId=${book.bookId}"><input type="submit"
				value="Add to cart"></a>

			<hr>
		</div>

	</jstl:forEach>

</body>
</html>