<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <%@include file="all_js_css.jsp"%> 

<title>add_note_page</title>

</head>
<body>
	<div class="container">
		 <%@include file="navbar.jsp"%> 
	</div>
	<br>

	<!-- add note form -->
	<form class="container" id="add_note_form"action="SaveNoteServlet" method="post">
		<div class="mb-3">
			<label for="title" class="form-label"> Title </label> <input required
				name="title" type="text" class="form-control" id="title"
				aria-describedby="emailHelp" placeholder="Enter here">
		</div>
		<div class="mb-3">
			<label for="content" class="form-label">Content</label>
			<textarea name="content" id="content" required
				placeholder="Enter your content here" class="form-control"
				style="height: 300px;"></textarea>
		</div>
		<button type="submit" class="btn btn-primary">Add</button>
	</form>
	<script src="js/Myjs.js" type="text/javascript"></script>
 
</body>
</html>