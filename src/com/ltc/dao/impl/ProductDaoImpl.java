package com.ltc.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ltc.dao.ProductDao;
import com.ltc.pojo.Product;
import com.ltc.util.ConnectionFactory;

public class ProductDaoImpl implements ProductDao {

	@Override
	public List getProductsById(String orderId) {
		// TODO Auto-generated method stub
		List list=null;
		
		Connection conn = null;
		
		Statement stmt = null;
		
		ResultSet rs = null;
		
		try {
			conn=ConnectionFactory.getConnection();
			
			stmt = conn.createStatement();
			String sql="select amount,name,basePrice from orderline inner join "
			+"product on product.productid=orderline.productid where orderid='"+orderId+"'";
//			System.out.println(sql);
			
			rs = stmt.executeQuery(sql);
			list=new ArrayList();
			while(rs.next()){
				Product product=new Product();
				product.setAmount(rs.getString("amount"));
				product.setName(rs.getString("name"));
				product.setBasePrice(rs.getString("basePrice"));
				product.setTotalPrice();
				list.add(product);
			}
		} catch (Exception e) {
			e.printStackTrace();
			
			throw new RuntimeException("error getProduct ",e);
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
				
				throw new RuntimeException("error getProduct ",e);
			}
		}
		
		return list;
	}

	@Override
	public List getAllProducts() {
		// TODO Auto-generated method stub
		List productList = new ArrayList();
		
		Connection conn = null;
		
		Statement stmt = null;
		
		ResultSet rs = null;
		
		try {
			conn=ConnectionFactory.getConnection();
			
			stmt = conn.createStatement();
			String sql="select * from product";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()){
				Product product=new Product();
				
				product.setAuthor(rs.getString("author"));
				product.setBasePrice(rs.getString("basePrice"));
				product.setCategoryid(rs.getString("categoryid"));
				product.setDescription(rs.getString("description"));
				product.setImages(rs.getString("images"));
				product.setName(rs.getString("name"));
				product.setPages(rs.getString("pages"));
				product.setProductid(rs.getString("productid"));
				product.setPublish(rs.getString("publish"));
				
				productList.add(product);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
			
			throw new RuntimeException("error when querying students ",e);
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
				
				throw new RuntimeException("error when querying students ",e);
			}
		}
		
		
		return productList;
	}

	@Override
	public Product getProductInfoById(String productid) {
		Product product = new Product();
		Connection conn = null;
		Statement stmt = null;	
		Statement stmt1 = null;	
		ResultSet rs = null;
		
		try{
			conn=ConnectionFactory.getConnection();
			stmt = conn.createStatement();
			String sql="select product.*,category.description des from product,category where category.categoryid=product.categoryid and productid = '"+productid+"'";
			//stmt1 = conn.createStatement();
			rs = stmt.executeQuery(sql);
			//rs1 = stmt1.executeQuery("select category.description from category,product where category.categoryid=product.categoryid and product.productid='"+productid+"'");
			while(rs.next()){
			//	Product product = new Product();
				
				product.setProductid(rs.getString("productid"));
				product.setName(rs.getString("name"));
				product.setDescription(rs.getString("description"));
				product.setBasePrice(rs.getString("basePrice"));
				product.setCategory(rs.getString("des"));
				product.setAuthor(rs.getString("author"));
				product.setPublish(rs.getString("publish"));
				product.setPages(rs.getString("pages"));
				product.setImages(rs.getString("images"));
			//	productinfobyid.add(product);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw new RuntimeException("error when querying product ",e);
		}finally {
			try {
				//rs1.close();
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
				throw new RuntimeException("error when querying product ",e);
			}
		}
		return product;
	}

}
