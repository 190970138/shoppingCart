package com.ltc.service;

import java.util.List;

import com.ltc.pojo.User;

public interface UserService {

	public User getUsersById(String id);
	public String getPayWayById(String id);
	public List getAllUsers();
	public User getUserInfoByID(String userid);
	public boolean createNewUser(User user);
}
