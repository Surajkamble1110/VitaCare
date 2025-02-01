<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@ include file="allcss.jsp"%>

<style>

.purple-background {
  background-color: #008fb3; 
}

</style>
  


</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-dark purple-background">
		<div class="container-fluid">
			<a class="navbar-brand" href="index.jsp"> <i
				class="fa-solid fa-hospital"></i>   VitaCare
			</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav ms-auto mb-2 mb-lg-0">
				
					<li class="nav-item">				
					<a class="nav-link active"
						aria-current="page" href="admin_login.jsp"> <i
							class="fa-solid fa-right-to-bracket"></i>  ADMIN
					</a></li>
					
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="doctor_login.jsp">DOCTOR</a></li>
					
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="appoinments.jsp">APPOINTMENT</a></li>
					
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="user_login.jsp">USER</a></li>





					<!-- <li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
						role="button" data-bs-toggle="dropdown" aria-expanded="false">
							APPOINTMENT </a>
							
					 	<ul class="dropdown-menu" aria-labelledby="navbarDropdown">
							<li><a class="dropdown-item" href="#">Action</a></li>
							<li><a class="dropdown-item" href="#">Another action</a></li>
							<li><hr class="dropdown-divider"></li>
							<li><a class="dropdown-item" href="#">Something else
									here</a></li>
						</ul>
					<li class="nav-item"><a class="nav-link disabled" href="#"
						tabindex="-1" aria-disabled="true">Disabled</a></li>-->

				</ul>
			</div>
		</div>
	</nav>
	
</body>
</html>