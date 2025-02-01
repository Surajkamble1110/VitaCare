<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>user_login.jsp</title>
</head>
<%@ include file="component/allcss.jsp"%>
<%@include file="component/navbar.jsp"%>

<style>
.point-card {
	box-shadow: 0 0 10px 0 rgba(0, 0, 0, 3);
}

body {
	background-color: #b3f0ff;
}
</style>

<body>
	<div class="container p-5">
		<div class="row">
			<div class="col-md-4 offset-md-4">
				<div class="card point-card">
					<div class="card-body">
						<h4 class="fs-4 text-center">User Login</h4>
						<%
						String failedMsg = (String) request.getAttribute("failedMsg43");

						if (failedMsg != null) {
						    out.println("<div class='alert alert-danger'><strong>" + failedMsg + "</strong></div>");
						    request.removeAttribute("failedMsg43");
						}
						
					
						%>

						<%--	<form action="${pageContext.request.contextPath}/userlogin" method="post"> --%>

						<form action="userlogin" method="post">
							<div class="mb-3">
								<label class="form-label">Patient Name</label> <input
									type="text" name="name" class="form-control" required />
							</div>

							<div class="mb-3">
								<label class="form-label">Email address</label> <input
									type="email" name="email" class="form-control" required />
							</div>

							<div class="mb-3">
								<label class="form-label">Password</label> <input
									type="password" name="password" class="form-control"
									id="password" required />
							</div>

							<button type="submit" class="btn btn-primary col-md-12">Login</button>
						</form>

						<br>Don't have an account?<a href="signup.jsp"
							class="text-decoration-none"> create one</a>

					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>