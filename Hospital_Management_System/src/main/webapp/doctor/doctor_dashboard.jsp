<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"%>
<%@ page import="entity.AppointmentEntity"%>

<%@ include file="../component/allcss.jsp"%>
<%@ include file="../component/navbar.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Doctor Dashboard</title>
<style>
.point-card {
	box-shadow: 0 0 10px 0 rgba(0, 0, 0, 0.3);
	margin-bottom: 20px;
}

body {
	background-color: #b3f0ff;
}

.card {
	margin: 20px;
}
</style>
</head>
<body>
	<div class="container p-5">
		<h4 class="fs-4 text-center">Doctor Dashboard</h4>

		<%
		HttpSession sess = request.getSession(false);

		if (sess != null) {

			List<AppointmentEntity> appointments = (List<AppointmentEntity>) sess.getAttribute("smsg30");

			if (appointments != null && !appointments.isEmpty()) {

				for (AppointmentEntity appointment : appointments) {

			out.println("<div class='col-md-4'>");
			out.println("<div class='card point-card'>");
			out.println("<div class='card-body'>");
			out.println("<h5 class='card-title text-center'>" + appointment.getUserName() + "</h5>");
			out.println("<a href='user_specific.jsp?userName=" + appointment.getUserName() 
			+ "&userEmail=" + appointment.getUserEmail() 
			+ "&diseaseType=" + appointment.getDiseaseType() 
			+ "&doctorName=" + appointment.getDoctorName() 
			+ "&exp=" + appointment.getExp()
		    + "' class='btn btn-primary col-md-12'>View Details</a>");
			out.println("</div>");
			out.println("</div>");
			out.println("</div>");

				}
			} else {

				out.println("<p>No appointments found.</p>");

			}

		}
		%>
	</div>
</body>
</html>
