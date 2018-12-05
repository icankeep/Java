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
					<h1 class="page-header">申请信息管理</h1>
				</div>
			</div>		
			<div class="row">
				<div class="col-lg-12">
					<div class="panel-heading"><strong>申请信息列表</strong>
						</div>					
						<table class="table table-bordered table-striped">
							<thead>
								<tr>
								    <th>编号</th>
									<th>姓名</th>
									<th>手机</th>
									<th>性别</th>
									<th>残疾种类</th>
									<th>情况概述</th>
									<th>操作</th>									
								</tr>
							</thead>
							<tbody id="content_page">
								<c:forEach items="${LIST}" var="list">
									<tr>
										<td>00${list.rid}</td>
										<td>${list.username}</td>
										<td>${list.mobile}</td>
										<td>${list.sex}</td>
										<td>${list.kind}</td>
										<td>
										<textarea style="width:400px; height:60px" disabled="disabled">${list.content}</textarea>
										</td>										
										<td> 
										<a href="DelReq?id=${list.rid}" class="btn btn-danger btn-xs">删除</a>
										</td>
									</tr>
								</c:forEach>															
							</tbody>
						</table>
						<div class="page_btn" id="wrap"></div>
					</div>
				</div>
			</div>
<script src="<%=basePath%>js/jquery.min.js"></script>
	<script src="<%=basePath%>js/bootstrap.min.js"></script>
	<script src="<%=basePath%>js/metisMenu.min.js"></script>
	<script src="<%=basePath%>js/jquery.dataTables.min.js"></script>
	<script src="<%=basePath%>js/dataTables.bootstrap.min.js"></script>
	<script src="<%=basePath%>js/sb-admin-2.js"></script>
	<script src="<%=basePath%>js/page.js"></script>
</body>
</html>