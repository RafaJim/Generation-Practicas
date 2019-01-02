<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<h1>Practica 2 - Cargar (Serializada) Archivos JSON</h1>
	
	<form action="SerializaProductosServlet" method="POST">
		<p>
			<label for="txtIdProducto">Id Producto</label>
			<input type="text" id="txtIdProducto" name="txtIdProducto">
		</p>
		
		<p>
			<label for="txtNombreProducto">Nombre Producto</label>
			<input type="text" id="txtNombreProducto" name="txtNombreProducto">
		</p>
		
		<p>
			<label for="txtPrecioProducto">Precio Producto</label>
			<input type="text" id="txtPrecioProducto" name="txtPrecioProducto">
		</p>
		<p>
			<input type="submit" value="Ingresar" class="btn btn-primary">
		</p>
	</form>
	
	<script src="scripts/jquery-3.3.1.min.js"></script>
    <script src="scripts/bootstrap.min.js"></script>
    <script src="scripts/scriptCargaArchivo.js"></script>
</body>
</html>