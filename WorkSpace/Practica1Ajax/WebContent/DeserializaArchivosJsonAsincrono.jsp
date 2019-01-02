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
	<h1>Desereailizar la cadena Json a objeto productos</h1>
	
	<p>
		<label for="txtCadenaJson">Introduce la cadena JSON</label>
		<input type="text" id="txtCadenaJson" name="txtCadenaJson">
	</p>
	
	<p>
		<input type="button" value="Deserealiza" id="btnDeserealiza" class="btn btn-primary">
	</p>
	
	<div id="resultadoAjax"></div>
	
	<script src="scripts/jquery-3.3.1.min.js"></script>
    <script src="scripts/bootstrap.min.js"></script>
    <script src="scripts/deserealizaScript.js"></script>
</body>
</html>