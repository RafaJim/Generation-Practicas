<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Practicca 2</title>
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
			<div>
				<textarea id="comentario" name="comentario" rows="10" cols="40">Escribe aquí tus comentarios</textarea>
			</div>
			
			<div>
				<iframe width="560" height="315" src="https://www.youtube.com/embed/a6BbvCC0VI0" frameborder="0" allow="autoplay; encrypted-media" allowfullscreen></iframe>
			</div>
			
		</div>
			
	</form>
	
	<div class="slideshow-container">
	<div class="mySlides fade">
	<div class="numbertext">1 / 3</div>
	<img src="images/entrada.png" style="width:100%">
	<div class="text">Caption Text</div>
	</div>

	<div class="mySlides fade">
	<div class="numbertext">2 / 3</div>
	<img src="images/MU.png" style="width:100%">
	<div class="text">Caption Two</div>
	</div>

	<div class="mySlides fade">
	<div class="numbertext">3 / 3</div>
	<img src="images/wm.png" style="width:100%">
	<div class="text">Caption Three</div>
	</div>

	<a class="prev" onclick="plusSlides(-1)">&#10094;</a>
	<a class="next" onclick="plusSlides(1)">&#10095;</a>

	</div>
	<br>

	<div style="text-align:center">
	<span class="dot" onclick="currentSlide(1)"></span> 
	<span class="dot" onclick="currentSlide(2)"></span> 
	<span class="dot" onclick="currentSlide(3)"></span> 
	</div>

	<script src="scripts/jquery-3.3.1.min.js"></script>
	<script src="scripts/bootstrap.min.js"></script>
	<script src="scripts/script.js"></script>
</body>
</html>