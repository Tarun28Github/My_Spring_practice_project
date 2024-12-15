<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<%@include file="all_js_css.jsp"%>

<title>Note Taker: Home page</title>

</head>
<body>

	<div class="container">
		<%@include file="navbar.jsp"%>

		<div class="card mt-2 p-4 bg-dark">
			<img alt="" class="mx-auto" style="max-width: 300px;"
				src="img/notes.png">
				<br>

			<p style="color:wheat; font-size:20px"><b><i>Welcome to NoteTaker, a personal website for taking notes.</i></b></p>

			<div class="contatiner text-center ">
				<a class="btn btn-outline-primary" href="add_notes.jsp">Start
					here</a>
			</div>
		</div>
	</div>
</body>
</html>