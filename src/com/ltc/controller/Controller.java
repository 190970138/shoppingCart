package com.ltc.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ltc.pojo.Product;
import com.ltc.pojo.User;
import com.ltc.service.OrdersService;
import com.ltc.service.ProductService;
import com.ltc.service.UserService;
import com.ltc.serviceImpl.OrdersServiceImpl;
import com.ltc.serviceImpl.ProductServiceImpl;
import com.ltc.serviceImpl.UserServiceImpl;
import com.ltc.util.ServiceFactory;

public class Controller extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String path = req.getServletPath();
		
		path = path.substring(0, path.indexOf("."));
		
		if("/toOrderList".equals(path)){
			try{

				OrdersService ordersService = ServiceFactory.getOrdersService();
				
				List orderList = ordersService.getOrdersList();
				
				req.setAttribute("orderList", orderList);
				
				getServletContext().getRequestDispatcher("/OrderList").forward(req, resp);
			} catch (Exception e){
				req.setAttribute("message", e.getMessage());
				//getServletContext().getRequestDispatcher("/error").forward(req, resp);
			}			
		}
		
		
		else if("/toOrderDetail".equals(path))
		{
			UserService userService=ServiceFactory.getUserService();
			User user=userService.getUsersById("host");
			String payWay=userService.getPayWayById("1");
			req.setAttribute("user", user);
			req.setAttribute("payWay", payWay);
			getServletContext().getRequestDispatcher("/OrderDetail").forward(req, resp);
		}
		
		else if("/toShoppingCart".equals(path)){     //ShoppingCart
				getServletContext().getRequestDispatcher("/ShoppingCart").forward(req, resp);			
		}		
		
		else if("/toOrderDetail".equals(path))
		{
			UserService userService=ServiceFactory.getUserService();
			User user=userService.getUsersById("host");
			String payWay=userService.getPayWayById("1");
			req.setAttribute("user", user);
			req.setAttribute("payWay", payWay);
			getServletContext().getRequestDispatcher("/OrderDetail").forward(req, resp);
		}
		
		else if("/toUserManage".equals(path))   //UserMange
		{
			try{
				UserService userService =ServiceFactory.getUserService();
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
				UserService userService = ServiceFactory.getUserService();
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
		
		else if("/toProductDetail".equals(path))
		{
			try{
				ProductService productinfoservice = ServiceFactory.getProductService();
				
				Product productinfo = productinfoservice.getProductInfoById("2");
				
				req.setAttribute("productinfo", productinfo);
				getServletContext().getRequestDispatcher("/ProductDetail").forward(req, resp);
			} catch (Exception e){
				getServletContext().getRequestDispatcher("/error").forward(req, resp);
				req.setAttribute("message", e.getMessage());
			}
		}
		
		else if("/toProductList".equals(path))
		{
			try{
				ProductService productService=ServiceFactory.getProductService();
				List<Product> list  = productService.getAllProducts();
				
				req.setAttribute("list", list);
				getServletContext().getRequestDispatcher("/ProductList").forward(req, resp);
			} catch (Exception e){
				getServletContext().getRequestDispatcher("/error").forward(req, resp);
				req.setAttribute("message", e.getMessage());
			}
		}
		else if("/toLogin".equals(path)){
			getServletContext().getRequestDispatcher("/Login").forward(req, resp);
		}
		else if("/toOrderConfirm".equals(path)){
			getServletContext().getRequestDispatcher("/OrderConfirm").forward(req, resp);
		}
		
		else if("/doUserRegister".equals(path)){
			//处理用户注册
			try{
				User user=new User();
				UserService userService = ServiceFactory.getUserService();
				//用户信息封装
				user.setUserid(req.getParameter("userid"));
				user.setPassWord(req.getParameter("password"));
				user.setCountry(req.getParameter("country"));
				user.setProvince(req.getParameter("province"));
				user.setStreet1(req.getParameter("street1"));
				user.setStreet2(req.getParameter("street2"));
				user.setZip(req.getParameter("zip"));
				user.setHomephone(req.getParameter("homephone"));
				user.setOfficephone(req.getParameter("officephone"));
				user.setCellphone(req.getParameter("cellphone"));
				user.setEmail(req.getParameter("email"));
		
				userService.createNewUser(user);
				
			}catch(Exception e)
			{
				
			}			
		}
		
		else {
			resp.sendError(resp.SC_NOT_FOUND);
		}			

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req,resp);
	}
	
}
