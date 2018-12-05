<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>残疾人服务中心</title>
<link rel="stylesheet" href="css/style.css" type="text/css" media="all"/>
<script src="js/jquery-1.8.3.min.js"></script>
</head>

<body>
<div id="hearder2" class="clearfix">
	<div class="logo">
   	  <img src="images/logo.jpg">
  </div>
  <div class="logo-name">残疾人服务平台</div>
    <div class="form-tools">
   	  <form id="search" name="search" action="SerchResult" method="post">
   	    <div class="tools-link">
   	    
   	    <c:if test="${USERNAME==null}">
        	<a href="login.jsp" target="_blank"><font size="2px">登&nbsp;录</font></a>&nbsp;&nbsp;|
        	<a href="register.jsp" target="_blank"><font size="2px">注&nbsp;册</font></a>
        	</c:if>
       <c:if test="${USERNAME!=null}"> 
            <a href="#" target="_blank" onclick="return false;"><font size="2px" color="black">用户：${USERNAME}</font></a>
           </c:if> 
        
        	&nbsp;&nbsp;|
        	<a href="form.jsp" target="_blank"><font size="2px">我要报名</font></a>
        </div>	
        <div class="search-box">
            <input type="text" name="key" id="textfield" class="input-text" placeholder="请输入搜索关键词">
            <input type="image" src="images/search.png" class="input-submit" />
        </div>
  	  </form>
    </div>
</div>

<div id="detail2-box" class="clearfix">
	<div class="tit-80"><a href="javascript:history.back()">返回</a> - 查看详情</div>   
    <div class="content-box">
    <c:if test="${FLAG == 'commend'}">
    	<h1>标题：${COMMEND.comname }</h1>
        <div class="content">
        	<br /><br />
        	<font size="4px">${COMMEND.comcontent }</font>
            <br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br />
        </div>
        </c:if>
        <c:if test="${FLAG == 'policy'}">
    	<h1>标题：${POLICY.polname }</h1>
        <div class="content">
        	<br /><br />
        	<font size="4px"> ${POLICY.polcontent }</font>
            <br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br />
        </div>
        </c:if>
    </div>
</div>

<div id="div6">Copyright &copy; 2018 残疾人服务中心 All rights reserved.</div>
</body>
</html>
