package com.jsp.jcart_web_app.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.jcart_web_app.dto.ProductOwner;

@SuppressWarnings("serial")
@WebServlet(value = "/registerproductOwner")
public class ProductOwnerRegisterController extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("");
		String email = req.getParameter("");
		String pass = req.getParameter("");
		long phone = Long.parseLong(req.getParameter("")); 
	}
	
	

}
