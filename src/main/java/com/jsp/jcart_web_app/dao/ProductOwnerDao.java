package com.jsp.jcart_web_app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jsp.jcart_web_app.connection.UserConnection;
import com.jsp.jcart_web_app.dto.ProductOwner;

public class ProductOwnerDao {
	
	Connection  connection = UserConnection.getUserConnection();
	
	public ProductOwner saveProductOwnerDao(ProductOwner productOwner)
	{
		String insertProduct = "insert into owner (name,email,password,phone) values(?,?,?,?)";
		
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(insertProduct);
			
			preparedStatement.setString(1, productOwner.getName());
			preparedStatement.setString(2, productOwner.getEmail());
			preparedStatement.setString(3, productOwner.getPassword());
			preparedStatement.setLong(4, productOwner.getPhone());
			
			preparedStatement.execute();
			
			return productOwner;
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return null;
		
		
		
	}
	
		


}
