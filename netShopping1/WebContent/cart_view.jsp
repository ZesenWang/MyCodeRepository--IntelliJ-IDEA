<%@ page import="com.po.Cart" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=GB2312"
    pageEncoding="GB2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB2312">
<title>爱尚网扇品</title>
<link rel="stylesheet" rev="stylesheet" href="css/global.css" type="text/css" media="all" />
</head>
<body>
	
		<div id="page">
			<div id="header">
				<jsp:include page="header.jsp" />      
       		</div>
			
			<div id="left_column">
				<jsp:include page="left_column.jsp" />  
			</div>
			<div id="center_column">
				<%if(request.getAttribute("cart")==null){ %>
					<div id="empty">
						<h3>您的购物车还是空的，</h3>
						<h3>赶紧行动吧！</h3>
					</div>
				<%}else{ %>
				<img src="images/shopping_card.gif" />
				<s:iterator value="#request.cart">
				<div id="cart_tb">
						<table>
							<tr>
								<td width="10%"><span style="color:#696969;size:13;font-weight:bold;">序号</span></td>
								<td width="30%"><span style="color:#696969;size:13;font-weight:bold;">商品名称</span></td>
								<td width="20%"><span style="color:#696969;size:13;font-weight:bold;">单价（元）</span></td>
								<td width="20%"><span style="color:#696969;size:13;font-weight:bold;">数量</span></td>
								<td width="20%"><span style="color:#696969;size:13;font-weight:bold;">小计（元）</span></td>
							</tr>
							<tr>
								<td>&nbsp;</td>
							</tr>							
									<tr>
										<td><s:property value="id"/> </td>
										<td><s:property value="name"/> </td>
										<td><s:property value="price"/> </td>
										<td><s:property value="count"/> </td>
										<td><s:property value="sum"/> </td>
							
									</tr>
									
						</table>
				</div>
				</s:iterator>
				<% } %>
				<div id="cart_tt">
					<%
						int sum = 0;
						List<Cart> list = (List<Cart>) request.getAttribute("cart");
						if(list != null)
							for(Cart cart : list)
						    	sum += cart.getSum();
					%>
					合计总金额：<span id="totalPrice" style="font-size:18px;color:#f60;"><%=sum%></span>元</td>
				</div>
				<div id="cart_lk">
					<a href="index.jsp">继续购物</a> | <a href="#">去收银台结账</a> | <a href="deleteItemFromCart.action">清空购物车</a>
				</div>
			
			</div>
			<div id="footer">
				<jsp:include page="bottom.jsp" />  
			</div>
		</div>
	
</body>
</html>