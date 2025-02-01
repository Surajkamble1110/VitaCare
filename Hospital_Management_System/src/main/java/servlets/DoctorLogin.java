package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

import dao.AppointmentsDao;
import dbconnect.DbConnect;
import entity.AppointmentEntity;

public class DoctorLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		String password = request.getParameter("password");

		HttpSession hs = request.getSession();
		AppointmentsDao appo = new AppointmentsDao(DbConnect.getConnection());
		boolean isAuthenticated = false;
		String doctorName = "";

		if (name.equals("Ashutosh jain") && password.equals("doct123")) {

			isAuthenticated = true;
			doctorName = "Ashutosh jain";
            System.out.println("1");
            
		}else if (name.equals("Haan Je Pyong") && password.equals("doct123")) {
	        isAuthenticated = true;
	        doctorName = "Haan Je Pyong";
	        System.out.println("Authenticated: Haan Je Pyong");
	    
		} else if (name.equals("Albert Xez") && password.equals("doct123")) {
	        isAuthenticated = true;
	        doctorName = "Albert Xez";
	        System.out.println("Authenticated: Albert Xez");
	  
		} else if (name.equals("Brown Man") && password.equals("doct123")) {
	        isAuthenticated = true;
	        doctorName = "Brown Man";
	        System.out.println("Authenticated: Brown Man");
	    
		} else if (name.equals("Nikita jain") && password.equals("doct123")) {
	        isAuthenticated = true;
	        doctorName = "Nikita jain";
	        System.out.println("Authenticated: Nikita jain");
	        
		} else {

			hs.setAttribute("fmsg30", "Please Enter correct details");
			response.sendRedirect("doctor_login.jsp");
            return;
		}

		
		if (isAuthenticated) {

			List<AppointmentEntity> appointments = appo.getUserDetails(doctorName);
            
			hs.setAttribute("smsg30", appointments);
			response.sendRedirect("doctor/doctor_dashboard.jsp");
		}
	}
}
