package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import dao.AppointmentsDao;
import dao.UserDao;
import dbconnect.DbConnect;
import entity.AppointmentEntity;

public class BookAppointment extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String userName = request.getParameter("name");
		String userEmail = request.getParameter("email");
		String userPassword = request.getParameter("password");
		String diseaseType = request.getParameter("disease_type");
		String doctorName;
		int exp;
		boolean res2 = false;

		HttpSession hs = request.getSession();
		
				
		AppointmentsDao appo = new AppointmentsDao(DbConnect.getConnection());

		UserDao ud = new UserDao(DbConnect.getConnection());

		boolean res = ud.isUser(userName, userPassword);

		if (res) {

			System.out.println("true");

			if (diseaseType.equals("fever")) {

				System.out.println("fever true");
				
				doctorName = "Ashutosh jain";
				exp = 20;

				res2 = appo.collectData(new AppointmentEntity(userName, userEmail, diseaseType, doctorName, exp));
             
				
				if (res2 == true) {
					
					System.out.println("res2 true inserted");

					hs.setAttribute("smsg10", "Booking sent! Please Check for date in your account");
					response.sendRedirect("appoinments.jsp");

				} else {
					
					System.out.println("res2 fasle not-inserted");

					hs.setAttribute("fmsg11", "Something went wrong!");
					response.sendRedirect("appoinments.jsp");

				}

				res2 = false;
			}

			if (diseaseType.equals("stomache")) {

				doctorName = "Haan Je Pyong";
				exp = 12;

				res2 = appo.collectData(new AppointmentEntity(userName, userEmail, diseaseType, doctorName, exp));

				if (res2 == true) {

					hs.setAttribute("smsg10", "Booking sent! Please Check for date in your account");
					response.sendRedirect("appoinments.jsp");

				} else {

					hs.setAttribute("fmsg11", "Something went wrong!");
					response.sendRedirect("appoinments.jsp");

				}

				res2 = false;

			}

			if (diseaseType.equals("head_surgery")) {

				doctorName = "Albert Xez";
				exp = 34;

				res2 = appo.collectData(new AppointmentEntity(userName, userEmail, diseaseType, doctorName, exp));

				if (res2 == true) {

					hs.setAttribute("smsg10", "Booking sent! Please Check for date in your account");
					response.sendRedirect("appoinments.jsp");

				} else {

					hs.setAttribute("fmsg11", "Something went wrong!");
					response.sendRedirect("appoinments.jsp");

				}

				res2 = false;

			}

			if (diseaseType.equals("body_pain")){

				doctorName = "Nikita jain";
				exp = 9;

				res2 = appo.collectData(new AppointmentEntity(userName, userEmail, diseaseType, doctorName, exp));

				if (res2 == true) {

					hs.setAttribute("smsg10", "Booking sent! Please Check for date in your account");
					response.sendRedirect("appoinments.jsp");

				} else {

					hs.setAttribute("fmsg11", "Something went wrong!");
					response.sendRedirect("appoinments.jsp");

				}

				res2 = false;

			}

			if (diseaseType.equals("eye_specialist")) {

				doctorName = "Brown Man";
				exp = 26;

				res2 = appo.collectData(new AppointmentEntity(userName, userEmail, diseaseType, doctorName, exp));

				if (res2 == true) {

					hs.setAttribute("smsg10", "Booking sent! Please Check for date in your account");
					response.sendRedirect("appoinments.jsp");

				} else {

					hs.setAttribute("fmsg11", "Something went wrong!");
					response.sendRedirect("appoinments.jsp");

				}

				res2 = false;

			}

		} else {

			 System.out.println("false");
			hs.setAttribute("fmsg10", "Please register first!");
			response.sendRedirect("appoinments.jsp");
		}

	}

}
