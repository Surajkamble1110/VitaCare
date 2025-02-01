<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ include file="../component/allcss.jsp"%>
<%@ include file="../component/navbar.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Details</title>
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

.detail-row {
    display: flex;
    justify-content: space-between;
    padding: 5px 0;
}

.bold-text {
    font-weight: bold;
    font-style: italic;
}

</style>
</head>
<body>
    <div class="container p-5">
        <h4 class="fs-4 text-center">PATIENT INFORMATION</h4>
        <div class="row">
            <!-- Doctor's Perspective -->
            <div class="col-md-12">
                <div class="card point-card">
                    <div class="card-body">
                        <%
                        String userName = request.getParameter("userName");
                        String diseaseType = request.getParameter("diseaseType");
                        String doctorName = request.getParameter("doctorName");
                        String date = request.getParameter("date");
                        String phoneNum = request.getParameter("phoneNum");
                        
                        out.println("<h5 class='card-title text-center'>Welcome " + doctorName + "</h5>");
                        out.println("<p class='bold-text' style='background-color: #b3f0ff;'>Your patient name is " + userName + "</p>");
                        out.println("<p class='bold-text' style='background-color: #b3f0ff;'>Mr./Ms. " + userName + " is facing a disease of " + diseaseType + ".</p>");
                        out.println("<p class='bold-text' style='background-color: #b3f0ff;'>You are assigned to this patient. Please fill below form to provide fix appointment date for your Patient</p>");
                        out.println("<p class='bold-text' style='background-color: #b3f0ff;'>Best of luck with the treatment!</p>");
                        %>
                    </div>
                </div>
            </div>

            <!-- Additional Details Form Section -->
            <div class="col-md-5 offset-md-3">
                <div class="card point-card">
                    <div class="card-body">
                        <h4 class="fs-4 text-center">Additional Details</h4>
                        
                        <%
                        String successMessage = (String) session.getAttribute("successMessage");
                        if (successMessage != null) { 
                        out.println("<div class='alert alert-primary'><strong>" + successMessage + "</strong></div>");
                        session.removeAttribute("successMessage"); 
                        } 
                        %>
                        
                        <form action="${pageContext.request.contextPath}/userspecific" method="post">
                            <div class="mb-3">
                                <label class="form-label">Patient Name</label> <input type="text"
                                    name="patient_name" class="form-control" required />
                            </div>
                            
                            <div class="mb-3">
                                <label class="form-label">Disease Type</label> <input type="text"
                                    name="diseaseType" class="form-control" required />
                            </div>
                            
                            <div class="mb-3">
                                <label class="form-label">Doctor Name</label> <input type="text"
                                    name="doctorName" class="form-control" required />
                            </div>
                                                        
                            <div class="mb-3">
                                <label class="form-label">Phone Number</label> <input type="tel"
                                    name="phoneNum" class="form-control" required />
                            </div>

                            <div class="mb-3">
                                <label class="form-label">Date</label> <input type="date"
                                    name="date" class="form-control" required />
                            </div>

                            <button type="submit" class="btn btn-primary col-md-12">Submit</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>

