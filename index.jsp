<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>Registration Form</title>

<!-- Bootstrap 5 CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
	
<link rel="stylesheet" href="./styles.css">	

<style>

</style>
</head>

<body>

    <%@ include file="./navbar.jsp" %>

	<!-- ================= MAIN CONTENT ================= -->	

	<div class="container-fluid">

		<div class="row">

			<!-- First 3 Columns Empty -->
			<div class="col-lg-3 d-none d-lg-block"></div>


			<!-- Form - 6 Columns -->
			<div class="col-lg-6 col-md-8 col-sm-12 mx-auto">

				<div class="card shadow my-5">

					<div class="card-body p-4">

						<h2 class="text-center mb-4">Registration Form</h2>

						<form name="registration" method="post" action="StudentController">

							<!-- Username -->
							<div class="mb-3">

								<label for="username" class="form-label"> Username </label> <input
									type="text" class="form-control" id="username" name="username"
									placeholder="Enter username" required>

							</div>


							<!-- First Name -->
							<div class="mb-3">

								<label for="firstname" class="form-label"> First Name </label> <input
									type="text" class="form-control" id="firstname"
									name="firstname" placeholder="Enter first name" required>

							</div>


							<!-- Last Name -->
							<div class="mb-3">

								<label for="lastname" class="form-label"> Last Name </label> <input
									type="text" class="form-control" name="lastname" id="lastname"
									placeholder="Enter last name" required>

							</div>


							<!-- Password -->
							<div class="mb-3">

								<label for="password" class="form-label"> Password </label> <input
									type="password" class="form-control" name="password"
									id="password" placeholder="Enter password" required>

							</div>


							<!-- Confirm Password -->
							<div class="mb-3">

								<label for="confirmPassword" class="form-label"> Confirm
									Password </label> <input type="password" class="form-control"
									id="confirmPassword" placeholder="Confirm password" required>

							</div>


							<!-- Submit Button -->
							<div class="d-grid">

								<button type="submit" class="btn btn-primary">Register
								</button>

							</div>

							<div class="d-grid">
								<a href="./login.jsp">Already Registered</a>
							</div>

						</form>

					</div>

				</div>

			</div>


			<!-- Remaining 3 Columns Empty -->
			<div class="col-lg-3 d-none d-lg-block"></div>

		</div>

	</div>


	<!-- ================= FOOTER ================= -->

	<footer class="bg-dark text-white text-center py-4">

		<div class="container">

			<p class="mb-1">&copy; 2026 MyWebsite. All Rights Reserved.</p>

		</div>

	</footer>


	<!-- Bootstrap 5 JavaScript -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js">
		
	</script>

</body>

</html>
