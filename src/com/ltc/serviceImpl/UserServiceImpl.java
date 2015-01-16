package com.ltc.serviceImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ltc.pojo.User;
import com.ltc.service.UserService;
import com.ltc.util.DaoFactory;

public class UserServiceImpl implements UserService {

	@Override
	public User getUsersById(String id) {
		// TODO Auto-generated method stub
		return DaoFactory.getUserDao().getUsersById(id);
	}

	@Override
	public String getPayWayById(String id) {
		// TODO Auto-generated method stub
		return DaoFactory.getUserDao().getPayWayById(id);
	}

	@Override
	public List getAllUsers() {
		// TODO Auto-generated method stub
		return DaoFactory.getUserDao().getAllUsers();
	}

	@Override
	public User getUserInfoByID(String userid) {
		// TODO Auto-generated method stub
		return DaoFactory.getUserDao().getUserInfoByID(userid);
	}

	@Override
	public boolean createNewUser(User user) {
		// TODO Auto-generated method stub
		
		return DaoFactory.getUserDao().createNewUser(user);
	}

	

}
