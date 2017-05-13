<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: wangz
  Date: 2017/5/12
  Time: 21:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h4>The application has malfunctioned.</h4>

<p>  Please contact technical support with the following information:</p>

<h4>Exception Name: <s:property value="exception" /> </h4>

<h4>Exception Details: <s:property value="exceptionStack" /></h4>
</body>
</html>
