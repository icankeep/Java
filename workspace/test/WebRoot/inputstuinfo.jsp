<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'inputstuinfo.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  <jsp:include page="islogin.jsp"></jsp:include>
  <body>
  	<center>
  		<form action="inputStuInfo_result.jsp" method="post">
    		<table bgColor="#EEB4B4">
    			<tr>
    				<td align="center" bgcolor=#CDB5CD colspan="2">录入学生信息</td>
				</tr>
				<tr>
    				<td>学号</td>
    				<td><input type="text" size=20 name="id" /></td>
    			</tr>
    			<tr>
    				<td>姓名</td>
    				<td><input type="text" size=20 name="name" /></td>
    			</tr>
    			<tr>
    				<td>性别</td>
    				<td><input type="radio" name="sex" checked value="1">男
    					<input type="radio" name="sex" value="0">女</td>
    			</tr>
    			<tr>
    				<td>出生日期</td>
    				<td><input type="text" size=20 name="birth"></td>
    			</tr>
    			<tr>
    				<td>课程（多选）</td>
    				<td><select name="course" size=2 multiple="multiple">
    				<option>微机原理</option>
    				<option>数据库原理</option>
    				<option>操作系统</option>
    				<option>信号与系统</option>
    				<option>随机过程与排队论</option>
    				</select></td>
    			</tr>
    			<tr>
    			<td><input type="button" value="提交" onclick = "window.location.href = 'inputStuInfo_result.jsp'">
    			<input type="button" value="重置" onclick = "window.location.href = 'inputstuinfo.jsp'"></td>
    			</tr>
    		</table>
    	</form>
    </center>
  </body>
</html>
