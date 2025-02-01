<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"%>
<%@ page import="entity.UserSpecificEntity"%>

<%@ include file="../component/allcss.jsp"%>
<%@ include file="../component/navbar.jsp"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>User Dashboard</title>
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

        .bold-text {
            font-weight: bold;
            font-style: italic;
            background-color: #b3f0ff;
        }
    </style>
</head>
<body>
    <div class="container p-5">
        <h4 class="fs-4 text-center">Patient Home</h4>

        <%
        List<UserSpecificEntity> userDetails = (List<UserSpecificEntity>) request.getAttribute("doctMsg");

        if (userDetails != null && !userDetails.isEmpty()) {
            for (UserSpecificEntity user : userDetails) {
                String userName = user.getUserName().toUpperCase();
        %>
                <div class='col-md-12'>
                    <div class='card point-card'>
                        <div class='card-body'>
                            <h5 class='card-title text-center'>WELCOME <%= userName %></h5>
                            <p class='bold-text'>Mr. <%= user.getUserName() %>, you are facing a disease of <%= user.getDiseaseType() %>.</p>
                            <p class='bold-text'>As you mentioned in an appointment form, your appointment is fixed on <%= user.getDate() %>.</p>
                            <p class='bold-text'>The doctor assigned to you is <%= user.getDoctorName() %>.</p>
                            <p class='bold-text'>For any query, you are now eligible to call on the number <%= user.getPhoneNum() %>.</p>
                            <p class='bold-text'>Best of Luck for your treatment. Hope you recover soon!</p>
                        </div>
                    </div>
                </div>
        <%
            }
        } else {
            out.println("<br><br>");
            out.println("<p style='font-weight: bold; font-style: italic; background-color: #b3f0ff; text-transform: uppercase;'>Dear Patient, your appointment is still in process! Currently retry after sometime!</p>");
        }
        %>
    </div>
</body>
</html>
