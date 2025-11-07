<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ page isELIgnored="false"%>

<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Contact</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB"
	crossorigin="anonymous">
</head>
<body>
	
	
	<div class="container mt-5">
	<h3>${Header}</h3>
	<p>${desc}</p>
	
	<form action="submitForm" method="post">
		<div class="mb-3">
			<label >Email address</label>
			 <input type="email" class="form-control" placeholder="Email Address"
				id="exampleInputEmail1" name="email">
			
		</div>
		<div class="mb-3">
			<label >User Name</label>
			 <input type="text" class="form-control" placeholder="Enter here"
				id="exampleInputName1" name="username">
			
		</div>
		<div class="mb-3">
			<label >Password</label>
			 <input type="password" class="form-control" placeholder="Enter password"
				id="exampleInputPassword1" name="password">
			
		</div>
		
		
		<div class="text-center">

			<button type="submit" class="btn btn-success">Sign-up</button>

		</div>

	</form>
	</div>
	






	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI"
		crossorigin="anonymous"></script>
</body>
</html>