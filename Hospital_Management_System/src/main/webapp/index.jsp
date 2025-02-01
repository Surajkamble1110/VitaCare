<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@ page import="java.sql.Connection" %>	
<%@ page import ="dbconnect.DbConnect" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>index.jsp</title>

<%@include file="component/allcss.jsp"%>
<%@include file="component/navbar.jsp"%>

<style>
.point-card {
	box-shadow: 0 0 10px 0 rgba(0, 0, 0, 3);
}

body{
 
      background-color:#b3f0ff;
}

 

</style>

</head>
<body>

<!-- Wallpapers with carousel Indicators -->

	<div id="carouselExampleIndicators" class="carousel slide"
		data-bs-ride="carousel">
		<div class="carousel-indicators">
			<button type="button" data-bs-target="#carouselExampleIndicators"
				data-bs-slide-to="0" class="active" aria-current="true"
				aria-label="Slide 1"></button>
			<button type="button" data-bs-target="#carouselExampleIndicators"
				data-bs-slide-to="1" aria-label="Slide 2"></button>
			<button type="button" data-bs-target="#carouselExampleIndicators"
				data-bs-slide-to="2" aria-label="Slide 3"></button>
		</div>
		<div class="carousel-inner">
			<div class="carousel-item active">
				<img src="img/hosp1.jpg" class="d-block w-100" alt="..."
					height="430">
			</div>
			<div class="carousel-item">
				<img src="img/hosp2.jpg" class="d-block w-100" alt="..."
					height="430">
			</div>
			<div class="carousel-item">
				<img src="img/hosp3.jpg" class="d-block w-100" alt="..."
					height="430">
			</div>
		</div>
		<button class="carousel-control-prev" type="button"
			data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
			<span class="carousel-control-prev-icon" aria-hidden="true"></span> <span
				class="visually-hidden">Previous</span>
		</button>
		<button class="carousel-control-next" type="button"
			data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
			<span class="carousel-control-next-icon" aria-hidden="true"></span> <span
				class="visually-hidden">Next</span>
		</button>
	</div>




<!-- Features with grid system -->

	<div class="container p-3">

		<h2 class="text-center fs-2 "> Features of Hospital</h2>
		<div class="row ">
			<div class="col-md-4">
				<div class="card point-card mt-4">
					<div class="card-body">
						<p class="fs-5">100% Safety</p>
						<p>Your safety is our top priority.</p>
					</div>
				</div>
				<div class="card point-card mt-4">
					<div class="card-body">
						<p class="fs-5">Friendly Doctors</p>
						<p>Our friendly doctor are here to make your health comfortable.</p>
					</div>
				</div>
			</div>

			<div class="col-md-4 mt-4">
				<div class="card point-card">
					<div class="card-body">
						<p class="fs-5">Clean Environment</p>
						<p>Experience our pristine, clean environment</p>
					</div>
				</div>

				<div class="card point-card mt-4">
					<div class="card-body">
						<p class="fs-5">Medical Resources</p>
						<p>Comprehensive medical resources at your fingertips.</p>
					</div>
				</div>
			</div>


			<div class="col-md-4">

				<img src="img/doct.png" alt="" width="300px" height="300px">
			</div>

		</div>


<!-- Team with grid system -->

		<div class="container mb-4 mt-4" >
			<h2 class="text-center fs-2">TEAM</h2>
			
			<div class="row">
			
				<div class="col-md-3">
				<div class="card paint-card"> 
				<div class="card-body text-center">				
					<img src="img/d1.jpg" alt="" height="350px">
					<p class="fw-bold fs-s">Mr. Ashutosh Jain</p>
					<p class="fs-7"> Fever Eliminator</p> 
				</div>
				</div>
				</div>
				
				
				
				<div class="col-md-3">
				<div class="card paint-card"> 
				<div class="card-body text-center">				
					<img src="img/d2.jpg" alt=""  height="350px">
					<p class="fw-bold fs-s">Nikita Jain</p>
					<p class="fs-7">Body Pain Holder</p> 
				</div>
				</div>
				</div>
				
				
				
				<div class="col-md-3">
				<div class="card paint-card"> 
				<div class="card-body text-center">				
					<img src="img/d3.jpg" alt=""  height="350px">
					<p class="fw-bold fs-s"> Albert Xez  </p>
					<p class="fs-7">Head Surgeon</p> 
				</div>
				</div>
				</div>
				
				
				
				
				<div class="col-md-3">
				<div class="card paint-card"> 
				<div class="card-body text-center">				
					<img src="img/brown.jpg" alt="" width="200px" height="350px">
					<p class="fw-bold fs-s">Brown Man</p>
					<p class="fs-7">Eye Specialist!</p> 
				</div>
				</div>
				</div>
				
				
				
			</div>
		</div>

<%@ include file="component/footer.jsp" %>
</body>
</html>