<%@ page import="sample.HelloWorld" %><%--
  Created by IntelliJ IDEA.
  User: wangz
  Date: 2017/5/8
  Time: 20:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>simple jsp page</title>
  </head>
  <body>
  <h3 class="message"><%=HelloWorld.getMessage()%></h3>
  </body>
</html>
