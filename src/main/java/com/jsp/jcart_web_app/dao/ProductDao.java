package com.jsp.jcart_web_app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import com.jsp.jcart_web_app.connection.UserConnection;
import com.jsp.jcart_web_app.dto.Product;

public class ProductDao {
	
	Connection connection = UserConnection.getUserConnection();
			
			public Product saveProductDao(Product product) {
				
				String productRegisterQuery = "insert into products(name,type,weartype,price,verify,image) values(?,?,?,?,?,?)";
				try {
				PreparedStatement preparedStatement = connection.prepareStatement(productRegisterQuery);
				preparedStatement.setString(1, product.getProductName());
				preparedStatement.setString(2, product.getProducttype());
				preparedStatement.setString(3, product.getProductWearType());
				preparedStatement.setDouble(4, product.getProductPrice());
				preparedStatement.setString(5, "no");
				preparedStatement.setBlob(6, product.getImage());
				
				preparedStatement.execute();				
		
				return product;
	
				}
				catch (Exception e) {
					e.printStackTrace();				}
				return null;
				
			}
			
		public List<Product> getAllProductDao(){
			
			return null;
		}

}
