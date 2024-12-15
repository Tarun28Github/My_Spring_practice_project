<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page isELIgnored="false"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>about page</title>
</head>
<body>
	<h1>hi my name is ${name}</h1>
	<h1>hi my id is ${id}</h1>
	<h1>list names are ${list}</h1>
	<c:forEach var="i" items="${list}">
	 <h1><c:out value="${i }"></c:out></h1> 
	</c:forEach>
</body>
</html>