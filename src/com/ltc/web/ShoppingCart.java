package com.ltc.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShoppingCart extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setCharacterEncoding("utf-8");
		PrintWriter out=resp.getWriter();
		
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<html>");
		out.println("	<head>");
		out.println("		<title>达内电子商务门户</title>");
		out.println("		<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">");
		out.println("		<meta name=\"description\" content=\"达内电子商务门户\">");
		out.println("		<link href=\"css/tarena.css\" rel=stylesheet>");
		out.println("	</head>");
		out.println("	<body topmargin=\"0\" leftmargin=\"0\" rightmargin=\"0\" bottommargin=\"0\">");
		out.println("<!-- Header Start -->");
		out.println("		<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" id=\"table2\">");
		out.println("			<tr>");
		out.println("				<td align=\"left\" width=\"7%\" background=\"images/top_bg.gif\"><img src=\"images/logo.gif\" width=\"286\" height=\"58\"></td>");
		out.println("				<td width=\"62%\" background=\"images/top_bg.gif\">　</td>");
		out.println("				<td width=\"31%\" background=\"images/top_bg.gif\" align=\"right\"><img src=\"images/top_r.gif\" width=\"352\" height=\"58\" border=\"0\"></td>");
		out.println("			</tr>");
		out.println("		</table>");
		out.println("		<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">");
		out.println("			<tr>");
		out.println("				<td background=\"images/dh_bg.gif\" align=\"left\" height=\"12\">");
		out.println("					<table width=\"100\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\">");
		out.println("						<tr>");
		out.println("							<td width=\"5%\"></td>");
		out.println("							");
		out.println("          <td width=\"10%\"><a href=\"/shoppingCart/ProductList\"><img name=\"Image1\" border=\"0\" src=\"images/index.gif\" width=\"90\" height=\"36\"></a></td>");
		out.println("							");
		out.println("          <td width=\"10%\"><a href=\"/shoppingCart/UserManage\"><img name=\"Image2\" border=\"0\" src=\"images/reg.gif\" width=\"92\" height=\"36\"></a></td>");
		out.println("							");
		out.println("          <td width=\"10%\"><a href=\"/shoppingCart/ShoppingCart\"><img name=\"Image4\" border=\"0\" src=\"images/cart.gif\" width=\"92\" height=\"36\"></a></td>");
		out.println("							");
		out.println("          <td width=\"10%\"><a href=\"/shoppingCart/OrderList\"><img name=\"Image5\" border=\"0\" src=\"images/order.gif\" width=\"92\" height=\"36\"></a></td>");
		out.println("							");
		out.println("          <td width=\"10%\"><a href=\"/shoppingCart/ProductList\"><img name=\"Image6\" border=\"0\" src=\"images/exit.gif\" width=\"92\" height=\"36\"></a></td>");
		out.println("						</tr>");
		out.println("					</table>");
		out.println("				</td>");
		out.println("			</tr>");
		out.println("		</table>");
		out.println("		<table cellspacing=\"1\" cellpadding=\"3\" align=\"center\" border=\"0\" width=\"98%\">");
		out.println("			<tr>");
		out.println("				<td width=\"65%\"><br>");
		out.println("					>> 欢迎访问 <b>达内电子商务门户</b>");
		out.println("				</td>");
		out.println("				<td width=\"35%\" align=\"right\">");
		out.println("				</td>");
		out.println("			</tr>");
		out.println("		</table>");
		out.println("<!-- Header End -->");
		out.println("<!-- Body Start -->");
		out.println("		<table cellspacing=\"1\" cellpadding=\"3\" align=\"center\" class=\"tableBorder2\">");
		out.println("			<tr>");
		out.println("				<td height=\"25\" valign=\"middle\">");
		out.println("					<img src=\"images/Forum_nav.gif\" align=\"absmiddle\">");
		out.println("					<a href=index.jsp>达内电子商务门户</a> →<img border=\"0\" src=\"images/dog.gif\" width=\"19\" height=\"18\"><b>购物清单</b>");
		out.println("				</td>");
		out.println("			</tr>");
		out.println("		</table>");
		out.println("		<br>");
		out.println("		<table cellpadding=\"3\" cellspacing=\"1\" align=\"center\" class=\"tableborder1\">");
		out.println("			<tr>");
		out.println("				<td valign=\"middle\" align=\"center\" height=\"25\" background=\"images/bg2.gif\" width=\"8%\">");
		out.println("					<font color=\"#ffffff\">");
		out.println("						<b>序号</b>");
		out.println("					</font>");
		out.println("				</td>");
		out.println("				<td valign=\"middle\" align=\"center\" height=\"25\" background=\"images/bg2.gif\" width=\"44%\">");
		out.println("					<font color=\"#ffffff\">");
		out.println("						<b>产品名称</b>");
		out.println("					</font>");
		out.println("				</td>");
		out.println("				<td valign=\"middle\" align=\"center\" height=\"25\" background=\"images/bg2.gif\" width=\"8%\">");
		out.println("					<font color=\"#ffffff\">");
		out.println("						<b>价格</b>");
		out.println("					</font>");
		out.println("				</td>");
		out.println("				<td valign=\"middle\" align=\"center\" height=\"25\" background=\"images/bg2.gif\" width=\"8%\">");
		out.println("					<font color=\"#ffffff\">");
		out.println("						<b>数量</b>");
		out.println("					</font>");
		out.println("				</td>");
		out.println("				<td valign=\"middle\" align=\"center\" height=\"25\" background=\"images/bg2.gif\" width=\"8%\">");
		out.println("					<font color=\"#ffffff\">");
		out.println("						<b>合计</b>");
		out.println("					</font>");
		out.println("				</td>");
		out.println("				<td valign=\"middle\" align=\"center\" height=\"25\" background=\"images/bg2.gif\" width=\"24%\">");
		out.println("					<font color=\"#ffffff\">");
		out.println("						<b>操作</b>");
		out.println("					</font>");
		out.println("				</td>");
		out.println("			</tr>");
		out.println("			<tr>");
		out.println("				<td class=tablebody2 valign=\"middle\" align=\"center\" width=\"8%\">");
		out.println("					1");
		out.println("				</td>");
		out.println("				<td class=tablebody1 valign=\"middle\" align=\"center\" width=\"44%\">");
		out.println("					精通Hibernate：Java对象持久化技术详解");
		out.println("				</td>");
		out.println("				<td class=tablebody2 valign=\"middle\" align=\"center\" width=\"8%\">");
		out.println("					59.0");
		out.println("				</td>");
		out.println("				<td class=tablebody1 valign=\"middle\" align=\"center\" width=\"8%\">");
		out.println("					<input type=\"text\" value=\"1\" size=\"2\">");
		out.println("				</td>");
		out.println("				<td class=tablebody2 valign=\"middle\" align=\"center\" width=\"8%\">");
		out.println("					<b>￥59.0</b>");
		out.println("				</td>");
		out.println("				<td class=tablebody1 valign=\"middle\" align=\"center\" width=\"24%\">");
		out.println("					<input type=\"button\" value=\"取消\" size=\"1\">");
		out.println("					<input type=\"button\" value=\"保存修改\" size=\"2\">");
		out.println("				</td>");
		out.println("			</tr>");
		out.println("			<tr>");
		out.println("				<td class=tablebody2 valign=\"middle\" align=\"center\" width=\"8%\">");
		out.println("					2");
		out.println("				</td>");
		out.println("				<td class=tablebody1 valign=\"middle\" align=\"center\" width=\"44%\">");
		out.println("					Effictive Java中文版");
		out.println("				</td>");
		out.println("				<td class=tablebody2 valign=\"middle\" align=\"center\" width=\"8%\">");
		out.println("					39.0");
		out.println("				</td>");
		out.println("				<td class=tablebody1 valign=\"middle\" align=\"center\" width=\"8%\">");
		out.println("					<input type=\"text\" value=\"2\" size=\"2\">");
		out.println("				</td>");
		out.println("				<td class=tablebody2 valign=\"middle\" align=\"center\" width=\"8%\">");
		out.println("					<b>￥78.0</b>");
		out.println("				</td>");
		out.println("				<td class=tablebody1 valign=\"middle\" align=\"center\" width=\"24%\">");
		out.println("					<input type=\"button\" value=\"取消\" size=\"1\">");
		out.println("					<input type=\"button\" value=\"保存修改\" size=\"2\">");
		out.println("				</td>");
		out.println("			</tr>");
		out.println("			<tr>");
		out.println("				<td class=tablebody1 valign=\"middle\" align=\"center\" width=\"8%\" colspan=\"4\">");
		out.println("					");
		out.println("				</td>");
		out.println("				");
		out.println("				<td class=tablebody2 valign=\"middle\" align=\"center\" width=\"8%\">");
		out.println("					<font color=\"red\"><b>￥137.0</b></font>");
		out.println("				</td>");
		out.println("				<td class=tablebody1 valign=\"middle\" align=\"center\" width=\"24%\">");
		out.println("					");
		out.println("				</td>");
		out.println("			</tr>");
		out.println("			<tr>");
		out.println("				<td class=tablebody2 valign=\"middle\" align=\"center\" width=\"8%\" colspan=\"6\">");
		out.println("				<form>");
		out.println("					<input type=\"button\" value=\"提交订单\" size=\"1\" onclick=\"javascript:window.location='orderConfirm.html';\">");
		out.println("					<input type=\"button\" value=\"继续购物\" size=\"2\" onclick=\"javascript:window.location='../product/productList.html';\">");
		out.println("					<input type=\"button\" value=\"清空购物车\" size=\"2\" onclick=\"javascript:window.location='../product/productList.html';\">");
		out.println("				</form>");
		out.println("				</td>");
		out.println("			</tr>");
		out.println("		</table>");
		out.println("		<br>");
		out.println("		");
		out.println("		");
		out.println("		");
		out.println("		");
		out.println("<!-- Footer Start -->");
		out.println("		<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" height=\"28\">");
		out.println("			<tr>");
		out.println("				<td height=\"17\" background=\"images/bot_bg.gif\">");
		out.println("				</td>");
		out.println("			</tr>");
		out.println("		</table>");
		out.println("		<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\">");
		out.println("			<tr>");
		out.println("				<td bgcolor=\"#f1f1f6\" height=\"53\" valign=\"center\">");
		out.println("					<p align=\"center\">");
		out.println("						Copyright &copy;2004 - 2005 <a href=\"http://www.tarena.com.cn\"><b>Tarena</b><font color=\"red\">.com.cn</font></a>");
		out.println("					</p>");
		out.println("				</td>");
		out.println("			</tr>");
		out.println("		</table>");
		out.println("<!-- Footer End -->");
		out.println("	</body>");
		out.println("</html>");
		out.close();
	}

}
