package com.jsp.jcart_web_app.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.jcart_web_app.dto.User;
import com.jsp.jcart_web_app.service.UserService;

@SuppressWarnings("serial")
@WebServlet(value = "/loginUser")
public class UserLoginController extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userEmail = req.getParameter("");
		String userPassword = req.getParameter("");
		
		UserService userService = new UserService();
		
		User user = userService.loginWithUserService(userEmail);
		
		if(user!=null) {
			if(user.getUserPassword().equals(userPassword)) 
			{
				req.getRequestDispatcher("user-home.jsp").forward(req, resp);
			}else {
				req.setAttribute("Incorrect Password", "Password is incorrect");
				req.getRequestDispatcher("user-login.jsp").forward(req, resp);
			}
		}
		else {
			req.setAttribute("Incorrect Email", "Email is Incorrect");
			req.getRequestDispatcher("user-login.jsp").forward(req, resp);
			
		}
	}
	

}
