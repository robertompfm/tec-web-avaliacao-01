<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<h1>Login</h1>
	<form method="post" action="login">
		<label for="email">
			Email: 
			<input id="email" name="email" type="email" placeholder="email@domain.com" required />
		</label>
		<label for="password">
			Senha: 
			<input id="password" name="password" type="password" placeholder="senha" required />
		</label>
		<button type="submit">Entrar</button>
	</form>
	<p>${error}</p>
</body>
</html>