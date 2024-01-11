package com.jsp.jcart_web_app.service;

import com.jsp.jcart_web_app.dao.ProductDao;
import com.jsp.jcart_web_app.dto.Product;

public class ProductService {
	
	ProductDao productDao = new ProductDao();
	public Product saveProductService(Product product) {
		return productDao.saveProductDao(product);
		
	}

}
