<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: wangz
  Date: 2017/5/10
  Time: 9:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:form action="registerRegister">
<%--    <s:textfield name = "personBean.firstName" label="First Name"></s:textfield>
    <s:textfield name="personBean.lastName" label="Last name" />
    <s:textfield name="personBean.email"  label ="Email"/>
    <s:textfield name="personBean.age"  label="Age"  />--%>
    <s:textfield key="personBean.firstName"/>
    <s:textfield key="personBean.lastName"/>
    <s:textfield key="personBean.email"/>
    <s:textfield key="personBean.age"/>
    <s:submit/>
</s:form>
</body>
</html>
