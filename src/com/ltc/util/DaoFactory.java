package com.ltc.util;

import com.ltc.dao.OrderDao;
import com.ltc.dao.ProductDao;
import com.ltc.dao.UserDao;
import com.ltc.dao.impl.OrderDaoImpl;
import com.ltc.dao.impl.ProductDaoImpl;
import com.ltc.dao.impl.UserDaoImpl;

public class DaoFactory {

	private static UserDao userDao = new UserDaoImpl(); 
	private static ProductDao productDao = new ProductDaoImpl();
	private static OrderDao orderDao = new OrderDaoImpl();
	
	public static UserDao getUserDao(){
		return userDao;
	}
	
	public static ProductDao getProductDao(){
		return productDao;
	}
	
	public static OrderDao getOrderDao(){
		return orderDao;
	}
}
