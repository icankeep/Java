<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'main_left.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="css/mystyle.css">
	

  </head>
   <jsp:include page="islogin.jsp"></jsp:include> 
  <body>
  <div>
   <br/>
    <a href="inputstuinfo.jsp" target="main_right">录入学生信息</a><br/><br/>
    <a href="querystuinfo.jsp" target="main_right">查询学生信息</a><br/><br/>
    <a href="modifystuinfo.jsp" target="main_right">修改学生信息</a><br/><br/>
    <a href="inputstusc.jsp" target="main_right">录入学生成绩</a><br/><br/>
    <a href="querystusc.jsp" target="main_right">查询课程及成绩</a><br/><br/>
    <a href="queryte.jsp" target="main_right">查询任课教师</a><br/><br/>
    <a href="deletestuinfo.jsp" target="main_right">查询将开除学生</a><br/><br/>
    <a href="exit.jsp" target="_top">返回</a><br/>
  
     
 </div>
  </body>
</html>
