package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import dao.UserDao;
import dao.UserSpecificDao;
import dbconnect.DbConnect;
import entity.UserSpecificEntity;

public class UserLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String userName = request.getParameter("name");
		String userPassword = request.getParameter("password");

		UserDao ud = new UserDao(DbConnect.getConnection());

		boolean res = ud.isUser(userName, userPassword);

		if (res) {
			
			UserSpecificDao specific = new UserSpecificDao(DbConnect.getConnection());
			List<UserSpecificEntity> userSpecificDetails = specific.getUserSpecificDetails(userName);
			
			
			

			 request.setAttribute("doctMsg", userSpecificDetails);
			  request.getRequestDispatcher("user/user_dashboard.jsp").forward(request, response);
			

		}else {
			
			
			request.setAttribute("failedMsg43", "Please enter correct destails!");
			request.getRequestDispatcher("./user_login.jsp").forward(request, response);
			
		}

	}
}
