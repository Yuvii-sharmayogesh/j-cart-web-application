package com.jsp.jcart_web_app.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.jcart_web_app.dto.Admin;
import com.jsp.jcart_web_app.service.AdminService;

@SuppressWarnings("serial")
@WebServlet(value = "/adminLogin")
public class AdminLoginController extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String adminEmail = req.getParameter("adminEmail");
		String adminPass = req.getParameter("adminPassword");
		
		AdminService adminService = new AdminService();
		
		Admin admin = adminService.adminLoginWithEmailPassService(adminEmail);
		
		if(admin!=null) {
			if(admin.getAdminPassword().equals(adminPass)) {
				req.getRequestDispatcher("admin-home.jsp").forward(req, resp);
				
			}else {
				req.setAttribute("incorrectAdminPass", "Please Pass correct password");
				req.getRequestDispatcher("admin-login.jsp").forward(req, resp);
			}
		}else {
			req.setAttribute("incorrectAdminEmail", "Please Pass correct Email");
			req.getRequestDispatcher("admin-login.jsp").forward(req, resp);
			
		}
	
	}
}
