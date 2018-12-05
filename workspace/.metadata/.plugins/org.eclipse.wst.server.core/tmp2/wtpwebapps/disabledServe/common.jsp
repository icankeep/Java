<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="wrapper">

		<nav class="navbar navbar-default navbar-static-top" role="navigation"
			style="margin-bottom: 0">
	
	<!-- 头部布局  -->		
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target=".navbar-collapse">
			<span class="icon-bar"></span> <span class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="home" onclick="return false;">残疾人服务平台后台管理系统 v1.0</a>
		</div>

<!-- 导航栏  -->
		<div class="navbar-default sidebar" role="navigation">
			<div class="sidebar-nav navbar-collapse">
				<ul class="nav" id="side-menu">
					<li class="sidebar-search">
					</li>
					<li><a href="home.jsp"><i
							class="fa fa-edit fa-fw"></i><font color="black">&nbsp;&nbsp;管理员：&nbsp;${USERNAME }</font></a></li>
					<li><a href="KeyManagehome"><i
							class="fa fa-dashboard fa-fw"></i>热搜信息管理</a></li>
					<li><a href="Allcom"><i
							class="fa fa-dashboard fa-fw"></i>文章信息管理</a></li>
					<li><a href="Allpic"><i
							class="fa fa-dashboard fa-fw"></i>图片展示管理</a></li>
					<li><a href="Allrequest"><i
							class="fa fa-dashboard fa-fw"></i>报名申请管理</a></li>
					
				</ul>
			</div>
		</div>
	</nav>
</div>
</body>
</html>