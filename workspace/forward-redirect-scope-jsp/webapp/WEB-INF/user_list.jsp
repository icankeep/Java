<%@ page language="java" contentType="text/html; charset=UTF-8"
 import="java.util.List,com.passer.smis.domain.User"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户列表</title>
</head>
<body>

	<table border="1" cellpadding="0" cellspacing="0">
		<tr>
			<th>id</th>
			<th>name</th>
			<th>age</th>
		</tr>
		<%
		List<User> users = (List<User>)request.getAttribute("users");
		for(User user : users){
		%>
			<tr>	
				<td><%=user.getId() %></td>
				<td><%=user.getName() %></td>
				<td><%=user.getAge() %></td>
			</tr>
		<% 
		}
		%>
		
	</table>
</body>
</html>