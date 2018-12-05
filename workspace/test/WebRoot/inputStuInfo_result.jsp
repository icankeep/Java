<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="com.test.model.stuInfo"%>
<%@ page import="java.sql.DriverManager"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.sql.PreparedStatement"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'inputStuInfo_result.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>

    <jsp:useBean id="stuInfo" class="com.test.model.stuInfo"></jsp:useBean>
    <jsp:setProperty property="*" name="stuInfo"></jsp:setProperty>
    <jsp:useBean id="stuServer" class="com.mydata.service.stuInfoService"></jsp:useBean>
    
    <%
     out.println(request.getParameter("id"));
     out.println(stuInfo.getName());
     out.print(stuInfo.getSex());
     out.print(stuInfo.getBirth());
     out.print(stuInfo.getCourse());
     out.print(stuInfo.getCourses());
     %>
     <% 
     if (stuServer.addStu(stuInfo))
     out.print("success");
     else
     out.print("failure");
     %>
  </body>
</html>
