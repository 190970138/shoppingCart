package com.ltc.util;

import com.ltc.dao.ProductDao;
import com.ltc.dao.UserDao;
import com.ltc.dao.impl.ProductDaoImpl;
import com.ltc.dao.impl.UserDaoImpl;

public class DaoFactory {

	private static UserDao userDao = new UserDaoImpl(); 
	private static ProductDao productDao = new ProductDaoImpl();
	
	public static UserDao getUserDao(){
		return userDao;
	}
	
	public static ProductDao getProductDao(){
		return productDao;
	}
}
