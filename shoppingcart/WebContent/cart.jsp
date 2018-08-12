<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<div align="center" style="background-color: #73C6B6;">
	<h1 style="color: blue">
		<strong><em>Book Cart</strong></h1></em>
	<hr>
</div>
<body >

<jsp:include page="header.jsp" ></jsp:include> 
<jstl:set var="total" value="0"/>
<jstl:if test="${sessionScope.cart.size()>0}">
<jstl:forEach var="cart" items="${sessionScope.cart}">

<img src="image/${cart.link}" height="100px" width="100px">
<h3>${cart.bookName} by ${cart.authorName}</h3>

<h4>Price:${cart.bookPrice*cart.bookcount}</h4>
<h4>Count:${cart.bookcount}</h4>

<h4><a href="remove.app?bookId=${cart.bookId}"><input type="submit" value="Remove"></a></h4>
<jstl:set var="total" value="${total+cart.bookPrice*cart.bookcount}"/>
			
<hr>
</jstl:forEach>
<h3 align="center" style="color:green">Amount to be paid:${total}</h3>
</jstl:if>


<jstl:if test="${sessionScope.cart.size()<=0}"> <h3 align="center" style="color:red">There is nothing in the cart.</h3></jstl:if>
</body>
</html>