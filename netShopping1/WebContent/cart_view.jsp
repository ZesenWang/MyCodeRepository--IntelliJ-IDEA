<%@ page import="com.po.Cart" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=GB2312"
    pageEncoding="GB2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB2312">
<title>��������Ʒ</title>
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
						<h3>���Ĺ��ﳵ���ǿյģ�</h3>
						<h3>�Ͻ��ж��ɣ�</h3>
					</div>
				<%}else{ %>
				<img src="images/shopping_card.gif" />
				<s:iterator value="#request.cart">
				<div id="cart_tb">
						<table>
							<tr>
								<td width="10%"><span style="color:#696969;size:13;font-weight:bold;">���</span></td>
								<td width="30%"><span style="color:#696969;size:13;font-weight:bold;">��Ʒ����</span></td>
								<td width="20%"><span style="color:#696969;size:13;font-weight:bold;">���ۣ�Ԫ��</span></td>
								<td width="20%"><span style="color:#696969;size:13;font-weight:bold;">����</span></td>
								<td width="20%"><span style="color:#696969;size:13;font-weight:bold;">С�ƣ�Ԫ��</span></td>
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
					�ϼ��ܽ�<span id="totalPrice" style="font-size:18px;color:#f60;"><%=sum%></span>Ԫ</td>
				</div>
				<div id="cart_lk">
					<a href="index.jsp">��������</a> | <a href="#">ȥ����̨����</a> | <a href="deleteItemFromCart.action">��չ��ﳵ</a>
				</div>
			
			</div>
			<div id="footer">
				<jsp:include page="bottom.jsp" />  
			</div>
		</div>
	
</body>
</html>