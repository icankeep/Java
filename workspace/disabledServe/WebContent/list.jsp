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
	<div class="tit-80"><a href="IndexContent">返回首页</a> - 查寻结果</div>
    <div class="content-box">
    	<h1>所有相关结果</h1>
        <ul>
        <c:if test="${empty LIST1 && empty LIST2}">
        <li><a href="#" onclick=" return false"><font color="red" size="5px">没有找到相关信息...</font></a></li>
        </c:if>
        <c:if test="${!empty LIST1}">
        <c:forEach items="${LIST1 }" var="list1">
            <li class="text"><a href="ShowDetail?id=commends&name=${list1.comname }">${list1.comname }</a></li>
            </c:forEach> 
        </c:if>
        <c:if test="${!empty LIST2}">
        <c:forEach items="${LIST2 }" var="list2">
            <li class="text"><a href="ShowDetail?id=policys&name=${list2.polname }">${list2.polname }</a></li>
            </c:forEach>   
         </c:if>  
                       
            <%for(int i=0;i<12;i++){ %>
            <li><br></li>
            <%} %>
        </ul>       
    </div>
</div>

<div id="div6">Copyright &copy; 2018 残疾人服务中心 All rights reserved.</div>
<script src="js/jquery-1.8.3.min.js"></script>

</body>
</html>
