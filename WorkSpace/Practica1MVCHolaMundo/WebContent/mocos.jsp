<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Practica 1 MVC</title>
<link rel="Stylesheet" href="css/bootstrap.min.css">
<link rel="Stylesheet" href="css/style.css">
</head>
<body>
	<h2>Practica 1 MVC</h2>
	<form action="MensajeServlet" method="get">
		<label for="txtNombre">Introduce tu nombre:</label>
		<input type="text" id="txtNombre" name="txtNombre">
		<p>
			<label for="txtApellido" >Introduce tus Apellidos</label>
			<input type="text" id="txtApellido" name="txtApellido">
		</p>
		<p>
			<input type="submit" value="Presioname!!">
		</p>
		
	</form>
	
	<script src="scripts/jquery-3.3.1.min.js"></script>
	<script src="scripts/bootstrap.min.js"></script>
	<script src="scripts/script.js"></script>
</body>
</html>