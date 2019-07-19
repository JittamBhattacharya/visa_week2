package com.visa.prj.client;

import com.visa.prj.dao.PersistenceException;
import com.visa.prj.dao.ProductDao;
import com.visa.prj.dao.ProductDaoJdbcImpl;
import com.visa.prj.entity.Product;

public class AddProduct {

	public static void main(String[] args) {
		
		ProductDao productDao = new ProductDaoJdbcImpl();
		try {
			Product p = new Product(0 , "Hp spectre laptop" , "computer" , 13500.00 , 500);
			productDao.addProduct(p);
			int id = p.getId();
			System.out.println("Product Added with id "+ id);
		} catch (PersistenceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
