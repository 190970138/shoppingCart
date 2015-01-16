package com.ltc.serviceImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ltc.pojo.Orders;
import com.ltc.service.OrdersService;
import com.ltc.util.DaoFactory;

public class OrdersServiceImpl implements OrdersService {

	@Override
	public List getOrdersList() {
		// TODO Auto-generated method stub
		return DaoFactory.getOrderDao().getOrdersList();
	}

	

}
