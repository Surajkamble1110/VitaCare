package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import dao.UserSpecificDao;
import dbconnect.DbConnect;
import entity.UserSpecificEntity;

public class UserSpecific extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String userName = request.getParameter("patient_name");
		String diseaseType = request.getParameter("diseaseType");
		String doctorName = request.getParameter("doctorName");
		String phoneNum = request.getParameter("phoneNum");
		String date = request.getParameter("date");
		
		System.out.println(userName);
		
		UserSpecificEntity specific = new UserSpecificEntity(userName, diseaseType, doctorName, date, phoneNum);
		
		
		Connection conn = DbConnect.getConnection();
		
		UserSpecificDao specificDao = new UserSpecificDao(conn);
		
	    boolean res = specificDao.collectData(specific);
	
	   if(res) {
		   
		   request.setAttribute("successMessage", "Appointment date has been sent to your patient!");
		 
		   request.getRequestDispatcher("./doctor/user_specific.jsp").forward(request, response);
	   }
	   else {
       
		   request.setAttribute("errorMessage", "Failed to send appointment date. Please try again.");
           request.getRequestDispatcher("./doctor/user_specific.jsp").forward(request, response);           
	   }   	   
	}
}
