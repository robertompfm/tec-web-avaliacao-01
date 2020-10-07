<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Cadastro usuario</h1>
	<form method="post" action="cadastro-usuario-servlet">
		<label for="name">
			Nome: 
			<input id="name" name="name" type="text" placeholder="nome" required />
		</label><br />
		<label for="email">
			Email: 
			<input id="email" name="email" type="email" placeholder="email@domain.com" required />
		</label><br />
		<label for="phone">
			Telefone: 
			<input id="phone" name="phone" type="text" placeholder="+xx (xx) xxxxx-xxxx" required />
		</label><br />
		<label for="address">
			Endereco: 
			<input id="address" name="address" type="text" placeholder="endereco" required />
		</label><br />
		<label for="password">
			Senha: 
			<input id="password" name="password" type="password" placeholder="senha" required />
		</label><br />
		<p>${error}</p>
		<button type="submit">Cadastrar</button>
	</form>
<div><a href="home.jsp">Voltar</a></div>
	
	
</body>
</html>