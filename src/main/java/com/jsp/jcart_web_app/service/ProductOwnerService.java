package com.jsp.jcart_web_app.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.jsp.jcart_web_app.dao.ProductOwnerDao;
import com.jsp.jcart_web_app.dto.ProductOwner;

public class ProductOwnerService {
	
	ProductOwnerDao  productOwnerDao = new ProductOwnerDao();
	
	public ProductOwner saveProductOwnerDao(ProductOwner productOwner)
	{
		if((productOwner.getPassword().length()>=8) &&(productOwner.getPassword().length()<=15)){
			
			Matcher alphabet = Pattern.compile("[a-zA-Z]").matcher( productOwner.getPassword());
			Matcher number = Pattern.compile("[0-9]").matcher(productOwner.getPassword());
			Matcher special = Pattern.compile("[@#$%&*!^_]").matcher(productOwner.getPassword());
			
			if((alphabet.find())&&(number.find())&&(special.find())) {
				return productOwnerDao.saveProductOwnerDao(productOwner);
			}else {
				return null;
			}
			}else {
				return null;
			
		}
	}

}
