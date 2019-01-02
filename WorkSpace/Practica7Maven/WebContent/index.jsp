<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="Stylesheet" href="css/bootstrap.min.css">
<link rel="Stylesheet" href="css/style.css">
</head>
<body>
	<h2>Practica 7 Maven</h2>
	<c:out value="${'Test'}"/>
	
	<form action="index.jsp" method="post">
		<p>
			<label for="txtNumero1">Ingrese primer numero</label>
			<input type="text" name="txtNumero1" id="txtNumero1">
		</p>
		<p>
			<label for="txtNumero2">Ingrese segundo numero</label>
			<input type="text" name="txtNumero2" id="txtNumero2">
		</p>
		<p>
			<input type="submit" class="btn btn-succsess" value="Sumar">
		</p>
	</form>
	
	<!--<c:if test="${param.txtNumero1!=null && param.txtNumero2!=null }">
		<c:set var="numero1" value="${param.txtNumero1}"></c:set>
		<c:set var="numero2" value="${param.txtNumero2}"></c:set>
	</c:if>-->
	<c:set var="numero1" value="${param.txtNumero1}"></c:set>
	<c:set var="numero2" value="${param.txtNumero2}"></c:set>
	<c:out value="Resultado: ${numero1+numero2 }"></c:out>
	
	<script src="scripts/jquery-3.3.1.min.js"></script>
	<script src="scripts/bootstrap.min.js"></script>
</body>
</html>