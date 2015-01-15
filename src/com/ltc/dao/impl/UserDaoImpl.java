package com.ltc.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ltc.dao.UserDao;
import com.ltc.pojo.User;

public class UserDaoImpl implements UserDao {
	
	@Override
	public User getUsersById(String id) {
		// TODO Auto-generated method stub
		User user=null;
		Connection conn = null;
		
		Statement stmt = null;
		
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gwap","root","");
			
			stmt = conn.createStatement();
			String sql="select users.userid,password,street1,street2,city,province,coun"
			+"try,zip,email,homephone,cellphone,officephone from users inner join contactinfo"
					+" on contactinfo.userid=users.userid where users.userid='"+id+"'";
			//System.out.println(sql);
			
			rs = stmt.executeQuery(sql);
			user=new User();
			//System.out.println(rs.next());
			while(rs.next()){
				
				user.setUserid(rs.getString("userid"));
				user.setPassWord(rs.getString("password"));
				user.setStreet1(rs.getString("street1"));
				user.setStreet2(rs.getString("street2"));
				user.setCity(rs.getString("city"));
				user.setProvince(rs.getString("province"));
				user.setCountry(rs.getString("country"));
				user.setZip(rs.getString("zip"));
				user.setEmail(rs.getString("email"));
				user.setHomephone(rs.getString("homephone"));
				user.setCellphone(rs.getString("cellphone"));
				user.setOfficephone(rs.getString("officephone"));

			}
		} catch (Exception e) {
			e.printStackTrace();
			
			throw new RuntimeException("error getUser",e);
		} finally {
			try {
				
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
				
				throw new RuntimeException("error getUser",e);
			}
		}
		return user;
	}

	@Override
	public String getPayWayById(String id) {
		// TODO Auto-generated method stub
		String payWay=null;
		Connection conn = null;
		
		Statement stmt = null;
		
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gwap","root","");
			
			stmt = conn.createStatement();
			String sql="select paystyle"
			+" from orders inner join payway"
					+" on payway.paywayid=orders.paywayid where orders.orderid='"+id+"'";
			//System.out.println(sql);
			
			rs = stmt.executeQuery(sql);
			rs.next();
			//System.out.println(rs.next());
			
//			payWay=rs.getString("paystyle");	fixed by S-C,
			
		} catch (Exception e) {
			e.printStackTrace();
			
			throw new RuntimeException("error getPayWay",e);
		} finally {
			try {
				
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
				
				throw new RuntimeException("error getPayWay",e);
			}
		}
		return payWay;
	}

	@Override
	public List getAllUsers() {
		// TODO Auto-generated method stub
		
		List userList = new ArrayList();
		
		Connection conn = null;
		
		Statement stmt = null;
		
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gwap","root","");
			
			stmt = conn.createStatement();
			String sql="select password,contactinfo.* from users inner join contactinfo on users.userid=contactinfo.userid";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()){
				User user=new User();
				user.setUserid(rs.getString("userid"));
				user.setPassWord(rs.getString("passWord"));
				
				
				user.setStreet1(rs.getString("street1"));
				user.setStreet2(rs.getString("street2"));
				user.setCity(rs.getString("city"));
				user.setProvince(rs.getString("province"));
				user.setCountry(rs.getString("country"));
				user.setZip(rs.getString("zip"));
				user.setEmail(rs.getString("email"));
				user.setHomephone(rs.getString("homephone"));
				user.setCellphone(rs.getString("cellphone"));
				user.setOfficephone(rs.getString("officephone"));
				
				
				
				userList.add(user);
				
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
		
		
		return userList;
	}

	@Override
	public User getUserInfoByID(String userid) {
		// TODO Auto-generated method stub
		
		User user = new User();
		
		Connection conn = null;
		
		java.sql.Statement stmt = null;
		
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gwap","root","");
			
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery("select users.userid,password,country,province,city,street1,street2,zip,homephone,officephone,cellphone,email from users,contactinfo where users.userid='"+ userid +"' and users.userid=contactinfo.userid");
		
			if(rs.next()){
				
				
				user.setUserid(rs.getString("users.userid"));
				user.setPassWord(rs.getString("password"));
				user.setPassWord(rs.getString("password"));
				user.setCountry(rs.getString("country"));
				user.setProvince(rs.getString("province"));
				user.setCity(rs.getString("city"));
				user.setStreet1(rs.getString("street1"));
				user.setStreet2(rs.getString("street2"));
				user.setZip(rs.getString("zip"));
				user.setHomephone(rs.getString("homephone"));
				user.setOfficephone(rs.getString("officephone"));
				user.setCellphone(rs.getString("cellphone"));
				user.setEmail(rs.getString("email"));
				
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
		
		return user;
	}
}
