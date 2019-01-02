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
	<h1>Practica 3 - Cargar (Serializada) Archivos JSON Asincrono</h1>
	
	
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
			<input type="button" value="Ingresar" class="btn btn-primary" id="btnSerializa">
		</p>
		<div id="resultadoAjax"></div>
	<script src="scripts/jquery-3.3.1.min.js"></script>
    <script src="scripts/bootstrap.min.js"></script>
    <script src="scripts/scriptCargaArchivo.js"></script>
</body>
</html>