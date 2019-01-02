<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="Stylesheet" href="css/bootstrap.min.css">
<link rel="Stylesheet" href="css/style.css">
</head>
<body>
	<h2>Practica 4 Login</h2>
	
	<form action="LoginServlet" method="post">
		
			<label for="txtUsuario">Usuario</label>
			<div id="usuario">
				<input type="text" id="txtUsuario" name="txtUsuario" class="form-control">
			</div>
		
		
			<label for="txtContrasenha">Contraseña</label>
			<div id="contraseña">
				<input type="password" id="txtContrasenha" name="txtContrasenha" class="form-control">
			</div>
		
		<p>
			<input type="submit" value="Logear" class="btn btn-default">
		</p>
	</form>
	
	<script src="scripts/jquery-3.3.1.min.js"></script>
	<script src="scripts/bootstrap.min.js"></script>
	<script src="scripts/script.js"></script>
</body>
</html>