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
<h1>Lista de contatos</h1>
<table id="table-1">
	<thead>
		<tr>
			<th>Nome</th>
			<th>Email</th>
			<th>Telefone</th>
		</tr>
	</thead>
	<tbody>
	<c:forEach var="contact" items="${contacts}" >
		<tr>
			<td>${contact.name}</td>
			<td>${contact.email}</td>
			<td>${contact.phone}</td>
		</tr>
	</c:forEach>
		
	</tbody>
</table>
<div><a href="home.jsp">Voltar</a></div>

</body>
</html>