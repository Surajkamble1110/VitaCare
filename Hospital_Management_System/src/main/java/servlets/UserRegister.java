package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import dao.UserDao;
import dbconnect.DbConnect;
import entity.User;


public class UserRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");		
		String password = request.getParameter("password");
		
		User user= new User(name, email, password);
		
		 HttpSession hs = request.getSession();
		 
		boolean res  =  new UserDao(DbConnect.getConnection()).register(user);
		
		
		if(res) {
			
			hs.setAttribute("smsg", "Register Successfully!");
			response.sendRedirect("user_login.jsp");
		}else {
			
			hs.setAttribute("fmsg", "Something went wrong!");
			response.sendRedirect("signup.jsp");
		}
		
	}
}