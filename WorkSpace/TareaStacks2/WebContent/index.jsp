<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>Clases Stack</title>
	<link rel="stylesheet" href="css/bootstrap.min.css">
	<link rel="stylesheet" href="css/style.css">
	</head>
	<body>
		<!--<img id="fondo" src="images/gen.png" alt="">-->
		
		<div id="contenido">
			<div class="container">
				<header>
					<h1>Tarea Clases Stack</h1>
				</header>
				<p>Una pila es una versión restringida de una lista. En todo momento sólo se tiene acceso a la parte superior de la pila, es decir,al último objeto apilado. Por esta razón, a una pila se le conoce como una estructura de datos LIFO(Last In First Out). Una pila al ser una lista puede almacenar en el campo de información cualquier tipo de valor (int, char, float, vector de caracteres, un objeto, etc), por analogía con objetos cotidianos, una operación apilar(push) equivaldría a colocar un plato sobre una pila de platos, y una operación retirar(pop) a quitarlo. En palabras sencillas es un lugar donde se almacenan datos.</p>
				<img id="explicacion" src="images/pila1.jpg" alt="">
				
				
				<form action="pushServlet" method="get">
					<p>
						<h2>Metodo <i>push()</i></h2>
						Un metodo <i>push()</i> introdouce un objeto, ya sea de tipo entero, cadena, flotante, array, etc. dentro de una pila acumulandolo desde abajo hasta arriba donde el ultimo objeto ingresado es el primero en salir (conocido tambien como tipo <i>LIFO</i>). Para ingresar un dato dentro de la pila se inicia declarando una variable dentro de la clase <i>Stack</i> (Stack variable=new Stack();), despues ingresamos el valor <i>variable.push(Algo); .</i>
						<img src="images/push.png">
						<input type="submit" value="Ejemplo">
					</p>
				</form>
	
				<form action="popServlet" method="get">
					<p>
						<h2>Metodo <i>pop()</i></h2>
						El metodo <i>pop()</i> remueve el ultimo objeto introducido dentro de la pila es decir, si introducimos [1, 2, 3, 4, 5], nos estaria eliminando el numero 5.
						<img src="images/pop.png">
						<input type="submit" value="Ejemplo">
					</p>
				</form>
	
				<form action="peekServlet" method="get">
					<p>
						<h2>Metodo <i>peek()</i></h2>
						El metodo <i>peek()</i> nos muestra el ultimo objeto introducido dentro de la pila, es decir, si introducimos [1, 2, 3, 4, 5], nos mostrara el numero  5 ya que fue el ultimo objeto que introducimos a la pila.
						<p>
							<img src="images/animado.gif" width="50%" >
							<input type="submit" value="Ejemplo">
						</p>
					</p>
				</form>
				
				<form action="clearServlet" method="get">
					<p>
						<h2>Metodo clear()</h2>
						Con el Metodo <i>clear()</i> nos permite borrar el contenido de la pila. 
						<input type="submit" value="Ejemplo">
					</p>
				</form>
				
				<form action="searchServlet" method="get">
					<p>
						<h2>Metodo search()</h2>
						Con el Metodo <i>search()</i> nos permite buscar el elemento que el usuario introdusca. 
						<input type="submit" value="Ejemplo">
					</p>
				</form>
				
			</div>
		</div>
		<script src="scripts/jquery-3.3.1.min.js"></script>
		<script src="scripts/bootstrap.min.js"></script>
		<script src="scripts/script.js"></script>
	</body>
</html>