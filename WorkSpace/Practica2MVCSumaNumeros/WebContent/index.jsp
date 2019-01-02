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
	<h2>Suma de numeros</h2>
	
	<form action="SumaNumerosServlet" method="POST">
		<select name="Operador">
			<option value="suma">Suma</option>
			<option value="resta">Resta</option>
			<option value="multiplicacion">Multiplicacion</option>
			<option value="division">Division</option>
		</select>
		<div class="form-group">
			<p>
				<label for="txtNumero1">Introduce el primer numero</label>
				<div id="input1">
					<input class="form-control" id="txtNumero1" name="txtNumero1" type="text">
				</div>
			</p>
			
			<p>
				<label for="txtNumero2">Introduce el segundo numero</label>
				<div id="input2">
					<input class="form-control" id="txtNumero2" name="txtNumero2" type="text">
				</div>
			</p>
			
			<p>
				<input class="btn btn-default btn-lg" type="submit" value="Operacion">
			</p>
		</div>
	</form>

	<script src="scripts/jquery-3.3.1.min.js"></script>
	<script src="scripts/bootstrap.min.js"></script>
	<script src="scripts/script.js"></script>
</body>
</html>