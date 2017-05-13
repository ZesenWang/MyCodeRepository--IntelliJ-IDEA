<%@ page import="com.sample.Hello" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<body>
    <h1><s:text name="greeting" /></h1>
    <h2><%=Hello.sayHello()%></h2><br>
    <s:url action="index" var="indexLink">
        <s:param name="userName">Jason</s:param>
    </s:url>
    <a href="${indexLink}">look at my name!</a>
    <s:form action="index">
        <s:textfield name="userName" label="Your Name"/>
        <s:submit value="submit"/>
    </s:form>
    <hr/>
    <s:url action="inputRegister" var="registerInputLink"/>
    <p><a href="inputRegister.action">Please register</a> for our prize drawing.</p>
    <hr/>
    <s:text name="contact" />
    <hr/>
    <p><a href="exceptionRegister.action">See a exception</a></p>
    <hr/>
    <p><a href="<s:url action="index" namespace="config-browser"/>">Launch the configuration browser</a> </p>
    <hr/>
    <p><a href="index.action?debug=browser">See a DebuggerIntercepter</a></p>
</body>
</html>
