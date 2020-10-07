<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Lista de usuarios</h1>
<table id="table-1">
	<thead>
		<tr>
			<th>Nome</th>
			<th>Email</th>
			<th>Telefone</th>
			<th>Endereco</th>
			<th>Senha</th>
		</tr>
	</thead>
	<tbody>
	<c:forEach var="user" items="${users}" >
		<tr>
			<td>${user.name}</td>
			<td>${user.email}</td>
			<td>${user.phone}</td>
			<td>${user.address}</td>
			<td>${user.password}</td>
		</tr>
	</c:forEach>
		
	</tbody>
</table>
<div><a href="home.jsp">Voltar</a></div>

</body>
</html>