<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<h2>Practica Hibernate</h2>
	
	<form action="AltaProyectosServlet" method="POST">
	
		<label for="txtIdProyecto">idProyecto</label>
		<input type="text" name="txtIdProyecto" id="txtIdProyecto">
		
		<p>
			<label for="txtNombreProyecto">nombre Proyecto</label>
			<input type="text" name="txtNombreProyecto" id="txtNombreProyecto">
		</p>
		
		<p>
			<label for="txtDuracionMeses">Duracion Meses</label>
			<input type="text" name="txtDuracionMeses">
		</p>
		<input type="submit" value="Aceptar">
	</form>
	
	<script src="scripts/jquery-3.3.1.min.js"></script>
	<script src="scripts/bootstrap.min.js"></script>
	<script src="scripts/script.js"></script>
</body>
</html>