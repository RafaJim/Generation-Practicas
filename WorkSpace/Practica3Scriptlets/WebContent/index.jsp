<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="Stylesheet" href="css/bootstrap.min.css">
<link rel="Stylesheet" href="css/style.css">
</head>
<body>
	<h2>Practica 3 Scriptlets</h2>
	<%! int num1=20; %>
	<%! int num2=30; 
	 String num5="";	
	 String num6="";
	%>
	
	<form action="index.jsp" method="get">
		
		<label for="txtnum3">Introduce un numero:</label>
		<input type="text" name="txtnum3" value="<%=num1%>">		
		<br>
		
		<label for="txtnum4">Introduce un segundo numero:</label>
		<input type="text" name="txtnum4" value="<%=num2%>">
		
		<br>
		
		<input type="submit" value="Sumar">
		<br>
		<c:out value="${'Hola mundo!'}"/>
		<br>
		
	</form>
	
	
	<% 
		out.println("Tu direccion IP es: "+request.getRemoteAddr());
		for(int i=0;i<5;i++)
		{
			out.println("<p>El Macho</p>");
		}
		out.println("La suma es: "+(num1+num2));
		num5=request.getParameter("txtnum3");
		num6=request.getParameter("txtnum4");
		
		if(num5!=null && num6!=null)
		{
			num1=Integer.parseInt(num5);
			num2=Integer.parseInt(num6);
			out.println("<br>La otra suma es: "+ (num1+num2));
		}
		else
		{
			out.println("<br>Textboxes no tienen valor!!");
		}
	%>
	<!-- cosa nueva -->
	<c:set var="txtNumerito" value="${2000}"></c:set>
	<c:if test="${txtNumerito>1000}">
		<p>
			<c:out value="Numero mayor a 1000= ${txtNumerito}" />
		</p>
	</c:if>
	
	<script src="scripts/jquery-3.3.1.min.js"></script>
	<script src="scripts/bootstrap.min.js"></script>
	<script src="scripts/script.js"></script>
</body>
</html>