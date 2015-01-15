package com.ltc.util;

import com.ltc.dao.UserDao;
import com.ltc.dao.impl.UserDaoImpl;

public class DaoFactory {

	private static UserDao userDao = new UserDaoImpl(); 
	
	public static UserDao getUserDao(){
		return userDao;
	}
}
