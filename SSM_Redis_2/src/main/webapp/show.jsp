<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询</title>
<link rel="stylesheet" href="bootstrap/bootstrap-3.3.7-dist/css/bootstrap.min.css" type="text/css">
</head>
<body>
	<a href="add.jsp">添加</a>
	<table class="table table-bordered">
		<tr>
			<td>ID</td>
			<td>姓名</td>
			<td>密码</td>
			<td>余额</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${users }" var="user">
			<tr>
				<td>${user.id }</td>
				<td>${user.name }</td>
				<td>${user.password }</td>
				<td>${user.qian }</td>
				<td>
					<a class="glyphicon glyphicon-pencil" href="byId?id=${user.id }">修改</a>
					<a class="glyphicon glyphicon-trash" href="delete?id=${user.id }">X</a>
				</td>
			</tr>
		</c:forEach>
		
		
	</table>
	
</body>
</html>