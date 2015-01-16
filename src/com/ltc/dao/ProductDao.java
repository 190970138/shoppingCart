package com.ltc.dao;

import java.util.List;

import com.ltc.pojo.Product;

public interface ProductDao {

	public List getProductsById(String orderId);
	public List getAllProducts();
	public Product getProductInfoById(String productid);
}
