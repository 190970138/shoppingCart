package com.ltc.dao;

import java.util.List;

import com.ltc.pojo.User;

public interface UserDao {

	public User getUsersById(String id);
	public String getPayWayById(String id);
	public List getAllUsers();
	public User getUserInfoByID(String userid);
}
