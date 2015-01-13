package com.ltc.service;

import java.util.List;

import com.ltc.pojo.Product;

public interface ProductService {

	public List getProductsById(String orderId);
	public List getAllProducts();
	public Product getProductInfoById(String productid);
}
