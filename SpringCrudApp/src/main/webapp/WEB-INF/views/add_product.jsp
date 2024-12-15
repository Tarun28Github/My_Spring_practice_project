<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

<title>Add_product page</title>
</head>
<body style="background-color: grey">
	<div class="container">
		<div class="row">
			<div class="col-md-6 offset-md-3 mt-4">
				<h1>Enter Product Details</h1>
				<form action="showAddedProduct" method="post">
					<div class="mb-3">
						<label for="exampleInputName" class="form-label">Name</label> <input
							type="text" class="form-control" name="name"
							placeholder="Enter here" id="exampleInputName"
							aria-describedby="NameHelp">
					</div>
					
					<div class="mb-3">
						<label for="exampleInputName" class="form-label">Discription</label>
						<div class="form-floating">
							<textarea class="form-control" name="discription" placeholder="Leave a comment here"
								id="floatingTextarea2" style="height: 100px"></textarea>
							<label for="floatingTextarea2">about</label>
						</div>
					</div>
					
					<div class="mb-3">
						<label for="exampleInputPrice" class="form-label">Price</label> <input
							type="number" class="form-control" name="price"
							placeholder="123" id="exampleInputprice"
							aria-describedby="PriceHelp">
					</div>
					
					<div class="mb-3">
						<label for="exampleInputImage" class="form-label">ImageName</label> <input
							type="text" class="form-control" name="photo"
							placeholder="abc.png" id="exampleInputimage"
							aria-describedby="imageHelp">
					</div>
					
					<button type="submit" class="btn btn-primary">Save</button>
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