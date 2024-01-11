package com.jsp.jcart_web_app.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.jsp.jcart_web_app.dao.UserDao;
import com.jsp.jcart_web_app.dto.User;

public class UserService {
	UserDao userDao = new UserDao();
	/*
	 * Save User
	 */
	public User saveUserService(User user) {
		
		return userDao.saveUserDao(user);
//		String password = user.getUserPassword();
//		if(password.length()==8) {
//		
//			Matcher alphabet = Pattern.compile("[a-zA-Z]").matcher(password);
//			Matcher number = Pattern.compile("[0-9]").matcher(password);
//			Matcher special = Pattern.compile("[@#$%&*!^_]").matcher(password);
//			
//			if((alphabet.find())&&(number.find())&&(special.find())){
//				
//			}else {
//				return null;
//				
//			}
			
//		}else {
//			return null;
//		}
	
		
		}
	/*
	 * login
	 */
	public User loginWithUserService(String userEmail) {
		return userDao.loginWithUserDao(userEmail); 
	}
		
}
