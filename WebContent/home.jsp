<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Bem vindo ${param.username}</h1>
	<div><a href="cadastro-contato.jsp">Cadastrar novo contato</a></div>
	<form method="GET" action="lista-contatos-servlet">
		<button type="submit">Ver lista de contatos</button>
	</form>
	<div><a href="cadastro-usuario.jsp">Cadastrar novo usuario</a></div>
	<form method="GET" action="lista-usuarios-servlet">
		<button type="submit">Ver lista de usuarios</button>
	</form>
	<div><a href="index.jsp">Sair</a></div>
	<p>${feedback}</p>
</body>
</html>