package com.ltc.serviceImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ltc.pojo.Product;
import com.ltc.service.ProductService;
import com.ltc.util.DaoFactory;

public class ProductServiceImpl implements ProductService {

	@Override
	public List getProductsById(String orderId) {
		// TODO Auto-generated method stub
		return DaoFactory.getProductDao().getProductsById(orderId);
	}

	@Override
	public List getAllProducts() {
		// TODO Auto-generated method stub
		return DaoFactory.getProductDao().getAllProducts();
	}

	@Override
	public Product getProductInfoById(String productid) {
		// TODO Auto-generated method stub
		return DaoFactory.getProductDao().getProductInfoById(productid);
	}

	
	
}
