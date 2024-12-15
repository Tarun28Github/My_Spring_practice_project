<%@page import="com.entities.Note"%>
<%@page import="com.helper.FactoryProvider"%>
<%@page import="org.hibernate.Session"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="all_js_css.jsp"%>
<title>Note: edit notes</title>
</head>
<body>
	<div class="container">
		<%@include file="navbar.jsp"%>
	</div>
	<br>
	<%
	int noteId = Integer.parseInt(request.getParameter("note_id").trim());
	Session s = FactoryProvider.getFactory().openSession();
	Note note = s.get(Note.class, noteId);

	s.close();
	%>
	<form class="container" action="UpdateServlet" method="post">
	<input value="<%= note.getId() %>" name="noteId" type=hidden>
		<div class="mb-3">
			<label for="title" class="form-label"> Title </label> 
			<input required
				name="title" type="text" class="form-control" id="title"
				aria-describedby="emailHelp" placeholder="Enter here" value="<%=note.getTitle() %>">
		</div>
		<div class="mb-3">
			<label for="content" class="form-label">Content</label>
			<textarea name="content" id="content" required
				placeholder="Enter your content here" class="form-control"
				style="height: 300px;"><%=note.getContent() %></textarea>
		</div>
		<button type="submit" id="add_note" class="btn btn-success">Save Note</button>
	</form>


</body>
</html>