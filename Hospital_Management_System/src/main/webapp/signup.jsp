<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign-Up</title>

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
</head>
<body>
	<div class="container p-5">
		<div class="row">
			<div class="col-md-4 offset-md-4">
				<div class="card point-card">
					<div class="card-body">
						<h4 class="fs-4 text-center">Sign-Up</h4>


						<!-- Display messages using JSP Scriplets-->
						<%
						HttpSession sess = request.getSession(false);
						
						if(sess!=null){
							
			
						String smsg = (String) sess.getAttribute("smsg");
						String fmsg = (String) sess.getAttribute("fmsg");
						if (smsg != null) {

							out.println("<div class='alert alert-primary'><strong>" + smsg + "</strong></div>");

							sess.removeAttribute("smsg");
						}
						if (fmsg != null) {

							out.println("<div class='alert alert-danger'><strong>" + fmsg + "</strong></div>");

							sess.removeAttribute("fmsg");
						}
						
						}
						
						%>


						<form action="user" method="post">


							<div class="mb-3">
								<label class="form-label">Name</label> <input type="text"
									name="name" class="form-control" required />
							</div>


							<div class="mb-3">
								<label class="form-label">Email address</label> <input
									type="email" name="email" class="form-control" required />
							</div>

							<div class="mb-3">
								<label class="form-label">Password</label> <input
									type="password" name="password" class="form-control" required />
							</div>

							<button type="submit" class="btn btn-primary col-md-12">Register</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>