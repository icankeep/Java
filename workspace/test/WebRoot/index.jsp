<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
 
  <head>
    <base href="<%=basePath%>">
    
    <title>login</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

	<link rel="stylesheet" type="text/css" href="css/mystyle.css">

  </head>
  
  <body>
  	<br/><br/><br/><br/><br/><br/>
 	学生信息管理系统
    <form action="validate.jsp" method="post" name='login'>|</form>
           用户名 <input type="text" name="username"><br/><br/>
   	 密码<input type="password" name="password"><br/><br/>
    <input type="submit" value="确定" onclick = "window.location.href = 'main.jsp'">
    <input type="button" value="录入学生信息" onclick = "window.location.href = 'inputstuinfo.jsp'">
   <input type="button" value="查询学生信息" onclick = "window.location.href = 'querystuinfo.jsp'"><br/><br/><br/>
   <input type="button" value="修改学生信息" onclick = "window.location.href = 'modifystuinfo.jsp'">
   <input type="button" value="录入学生成绩" onclick = "window.location.href = 'inputstusc.jsp'"><br/><br/><br/>
   <input type="button" value="查询课程及成绩" onclick = "window.location.href = '.jsp'">
   <input type="button" value="查询任课教师" onclick = "window.location.href = 'queryte.jsp'"><br/><br/><br/>
   <input type="button" value="查询将开除学生" onclick = "window.location.href = 'deletestuinfo.jsp'"><br/><br/><br/>
  
  </body>
</html>
