<%@page import="java.util.Stack"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.Query"%>
<%@page import="org.hibernate.Session"%>
<%@page import="com.helper.FactoryProvider"%>
<%@page import="com.entities.Note"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="all_js_css.jsp"%>
<title>Notes: All notes</title>
</head>
<body>
	<div class="container">
		<%@include file="navbar.jsp"%>
		<br>

		<div class="row">

			<div class="col-12">

				<%
				Session s = FactoryProvider.getFactory().openSession();
				Query q = s.createQuery("from Note");
				List<Note> list = q.list();
				

				for (Note note : list) {
					
					Date d = note.getDate();
							
					
				%>

				<div class="card mt-3">
					<img src="img/notes.png" style="max-width: 100px;"
						class="card-img-top m-4 mx-auto" alt="...">
					<div class="card-body p-4">
						<h5 class="card-title"><%=note.getTitle()%></h5>
						<p class="card-text"><%=note.getContent()%></p>
						<p class="text-end" ><b><i style="font-size: 13px;color:navy;">last_updated:<%= new SimpleDateFormat("dd/MM/yyyy").format(d)%></i></b></p>
						<div class="container text-center mt-2">
							<a href="DeleteServlet?note_id=<%=note.getId() %>" class="btn btn-danger">Delete</a>
							 <a href="edit_notes.jsp?note_id=<%=note.getId() %>" class="btn btn-primary">Update</a>
						</div>

					</div>
				</div>



				<%
				}

				s.close();
				%>



			</div>

		</div>


	</div>
</body>
</html>