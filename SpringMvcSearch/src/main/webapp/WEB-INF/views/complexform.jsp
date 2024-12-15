<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<title>complexform page</title>
</head>
<body>

	<div class="container mt-4 col-md-6 offset-md-3">
		<div class="card">
			<div class="card-body">

				<h1 class="text-center">Registration Form</h1>
				<div class="alert alert-danger" role="alert">
				<form:errors path="student.*"/>
					</div>

				<form action="showform" method="post">
					<div class="mb-3">
						<label for="exampleInputname" class="form-label">Name
							address</label> <input type="text" class="form-control"
							id="exampleInputname" aria-describedby="emailHelp"
							placeholder="Enter here" name="name">

					</div>
					<div class="mb-3">
						<label for="exampleInputid" class="form-label">Id</label> <input
							type="number" class="form-control" id="exampleInputid"
							placeholder="1234" name="id">
					</div>
					<div class="mb-3">
						<label for="exampleInputdate" class="form-label">DOB</label> <input
							type="text" class="form-control" placeholder="dd/mm/yyyy"
							id="exampleInputdate" name="date">
					</div>
					<div class="mb-3">
						<label for="exampleInputCources" class="form-label">Select
							Cources</label> <select class="form-select" name="cources" multiple
							aria-label="multiple select example">
							<option selected>Cources</option>
							<option value="java">Java</option>
							<option value="python">Python</option>
							<option value="javascript">JavaScript</option>
						</select>
					</div>
					<div class="mb-3">
						<label for="exampleInputtype" class="form-label">Select
							Gender</label>
						<div class="form-check form-check-inline">
							<input class="form-check-input" type="radio" name="type"
								id="inlineRadio1" value="male"> <label
								class="form-check-label" for="inlineRadio1">Male</label>
						</div>
						<div class="form-check form-check-inline">
							<input class="form-check-input" type="radio" name="type"
								id="inlineRadio2" value="female"> <label
								class="form-check-label" for="inlineRadio2">Female</label>
						</div>
					</div>

					<div class="mb-3">
						<label for="exampleInputaddress" class="form-label">Address</label>
						<div class="form-control">
							<label for="exampleInputcity" class="form-label">City</label> <input
								type="text" class="form-control" id="exampleInputdate"
								name="address.city" placeholder="city"> <label
								for="exampleInputstreet" class="form-label">Street</label> <input
								type="text" class="form-control" id="exampleInputdate"
								name="address.street" placeholder="street">
						</div>
					</div>

					<button type="submit" class="btn btn-primary">Submit</button>
				</form>

			</div>

		</div>

	</div>

	<!-- Optional JavaScript; choose one of the two! -->

	<!-- Option 1: Bootstrap Bundle with Popper -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>

	<!-- Option 2: Separate Popper and Bootstrap JS -->
	<!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
    -->
</body>
</html>