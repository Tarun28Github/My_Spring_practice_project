<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>home page</title>
</head>
<body>
	<%
	String name = (String)request.getAttribute("name");
    Integer id =(Integer) request.getAttribute("id");
    List<Integer> list = (List<Integer>)request.getAttribute("list");
      
	%>
	<h1>this is index page executed by home controller</h1>
	<h1>Hi my name is <%= name %></h1>
	<h1>My id is <%= id %></h1>
	<h1>Lists are</h1>
	 <%
	     for(Integer i : list){
	    	 
	    	 %>
	    	 <h1><%=i %></h1>
	    	 <%
	     }
	
	%></h1>
</body>
</html>