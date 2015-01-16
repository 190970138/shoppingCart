package com.ltc.util;

import com.ltc.service.OrdersService;
import com.ltc.service.ProductService;
import com.ltc.service.UserService;
import com.ltc.serviceImpl.OrdersServiceImpl;
import com.ltc.serviceImpl.ProductServiceImpl;
import com.ltc.serviceImpl.UserServiceImpl;

public class ServiceFactory {
		private static OrdersService ordersService = new OrdersServiceImpl(); 
		private static ProductService productService = new ProductServiceImpl();
		private static UserService userService = new UserServiceImpl(); 
		
		public static OrdersService getOrdersService(){
			return ordersService;
		}
		
		public static ProductService getProductService(){
			return productService;
		}
		
		public static UserService getUserService(){
			return userService;
		}
	}
