package com.ltc.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ltc.pojo.User;
import com.ltc.service.UserService;
import com.ltc.serviceImpl.UserServiceImpl;

public class Controller extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String path = req.getServletPath();
		
		path = path.substring(0, path.indexOf("."));
		
		if("/toShoppingCart".equals(path)){     //ShoppingCart
				getServletContext().getRequestDispatcher("/ShoppingCart").forward(req, resp);			
		}
		
		
		else if("/toUserManage".equals(path))   //UserMange
		{
			try{
				UserService userService =new UserServiceImpl();
				List<User> userManage=userService.getAllUsers();
				
				req.setAttribute("userManage", userManage);
				
				getServletContext().getRequestDispatcher("/UserManage").forward(req, resp);
			} catch (Exception e){
				getServletContext().getRequestDispatcher("/error").forward(req, resp);
				req.setAttribute("message", e.getMessage());	
			}			
		}
		
		else if("/toUserModify".equals(path))
		{
			try{
				UserService userService = new UserServiceImpl();
				User user = userService.getUserInfoByID("admin");
				
				req.setAttribute("user", user);
				
				getServletContext().getRequestDispatcher("/UserModify").forward(req, resp);
			} catch (Exception e){
				getServletContext().getRequestDispatcher("/error").forward(req, resp);
				req.setAttribute("message", e.getMessage());	
			}
		}
		
		else if("/toUserRegister".equals(path))
		{
			getServletContext().getRequestDispatcher("/UserRegister").forward(req, resp);
		}
		
		else{
			resp.sendError(resp.SC_NOT_FOUND);
		}
		
		

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req,resp);
	}
	
}
