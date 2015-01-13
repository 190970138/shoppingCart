package com.ltc.serviceImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ltc.pojo.Orders;
import com.ltc.service.OrdersService;

public class OrdersServiceImpl implements OrdersService {

	@Override
	public List getOrdersList() {
		List ordersList = new ArrayList();
		
		Connection conn = null;
		
		Statement stmt = null;
		
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gwap","root","");
			
			stmt = conn.createStatement();
			String sql = "select userid,orderid,cost,orderstatus.name name2,paystyle from orders,orderstatus,payway where orders.statusid=orderstatus.statusid and orders.paywayid=payway.paywayid";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()){
				Orders orders = new Orders();
				
				orders.setOrderid(rs.getString("Orderid"));
			//	orders.setName(rs.getString("Name"));
				orders.setCost(rs.getString("Cost"));
				orders.setUserid(rs.getString("Userid"));
				orders.setStatusname(rs.getString("name2"));
				orders.setPaystyle(rs.getString("paystyle"));
				
				ordersList.add(orders);
			}
		} catch (Exception e) {
			e.printStackTrace();
			
			throw new RuntimeException("error when querying orders ",e);
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
				
				throw new RuntimeException("error when querying orders ",e);
			}
		}

		return ordersList;
	}

}
