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
	<h1>Practica 1 AJAX calculos</h1>
    
    <form>
    	<p>
    		<label for="txtNumero1">Numero 1</label>
    		<input type="text" id="txtNumero1" name="txtNumero1">
    	</p>
    	
    	<p>
    		<label for="txtNumero2">Numero 2</label>
    		<input type="text" id="txtNumero2" name="txtNumero2">
    	</p>
    	<p>
    		<input type="button" class="btn btn-primary" value="Sumar" id="btnSuma">
    		<input type="button" class="btn btn-primary" value="Restar" id="btnResta">
    		<input type="button" class="btn btn-primary" value="Multiplicar" id="btnMulti">
    		<input type="button" class="btn btn-primary" value="Dividir" id="btnDivision">
    	</p>
    </form>
    
    <p>
    	<label for="txtResultado">Resultado</label>
    	<input type="text" id="txtResultado" name="txtResultado" readonly="readonly">
    </p>
    
    <div id="divResultado"></div>
    <p>
    	<label for="txtResultado">Resultado</label>
    	<input type="text" id="txtResMul" name="txtResMul" readonly="readonly">	
    </p>
    
    <div id="diviDiv"></div>
    

    <script src="scripts/jquery-3.3.1.min.js"></script>
    <script src="scripts/bootstrap.min.js"></script>
    <script src="scripts/script.js"></script>

</body>
</html>