<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html>
<head>
<title>后台管理系统</title>
<link href="<%=basePath%>css/bootstrap.min.css" rel="stylesheet" />
<link href="<%=basePath%>css/metisMenu.min.css" rel="stylesheet" />
<link href="<%=basePath%>css/dataTables.bootstrap.css" rel="stylesheet" />
<link href="<%=basePath%>css/sb-admin-2.css" rel="stylesheet" />
<link href="<%=basePath%>css/font-awesome.min.css" rel="stylesheet" />
<link href="<%=basePath%>css/boot-crm.css" rel="stylesheet" />
<link href="<%=basePath%>css/page.css" rel="stylesheet" />

</head>
<body>
<jsp:include  page="common.jsp"/> 

<!-- 中间布局  -->
		<div id="page-wrapper">
			<div class="row">
				<div class="col-lg-12">
					<h1 class="page-header">文章信息管理</h1>
				</div>
			</div>		
			<div class="row">
				<div class="col-lg-12">
					<div class="panel panel-default">
						<div class="panel-heading"><strong>修改页面</strong>
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						 <a href="Allcom">返回</a>
						</div>	
						<c:if test="${UPC!=null}">		
						<form action="UpTitle2?flag=1" method="post">
						<input type="hidden" name="id" value="${UPC.cid }">
						标题:<br><input type="text" name="name" value="${UPC.comname }"><br>
						内容：<br>
						<textarea style="width:500px; height:200px" name="content">${UPC.comcontent }</textarea>
						<br>
						<input type="submit" value="保存修改">
						</form>
						</c:if>	
						<c:if test="${UPP!=null}">		
						<form action="UpTitle2?flag=2" method="post">
						<input type="hidden" name="id" value="${UPP.pid }">
						标题:<br><input type="text" name="name" value="${UPP.polname }"><br>
						内容：<br>
						<textarea style="width:500px; height:200px" name="content">${UPP.polcontent }</textarea>
						<br>
						<input type="submit" value="保存修改">
						</form>
						</c:if>
						
					</div>
				</div>
			</div>
		</div>
</body>
</html>