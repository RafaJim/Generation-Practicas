<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ page import="com.practica1jdbc.model.Empleado" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="Stylesheet" href="css/bootstrap.min.css">
<link rel="Stylesheet" href="css/style.css">
</head>
<body>
	<h2>Update Employee data</h2>
	<ul>
		<li>
			<a href="index.jsp">Regresar</a>
		</li>
	</ul>
	<div>
		<%!Empleado empleado=new Empleado(); %>
		<%empleado=(Empleado)request.getAttribute("empleadito"); %>
		<form action="UpdateEmployeeServlet" method="post">
			<p>
				<label for="txtIdEmpleado">Id Empleado</label>
				<input type="text" name="txtIdEmpleado" id="txtIdEmpleado" value="<%= empleado.getIdEmpleado() %>">
			</p>
			<p>
				<label for="txtNombreEmpleado">Nombre</label>
				<input type="text" name="txtNombreEmpleado" id="txtNombreEmpleado" value="<%= empleado.getNombreEmpleado() %>">
			</p>
			<p>
				<label for="txtApellidoEmpleado">Apellido</label>
				<input type="text" name="txtApellidoEmpleado" id="txtApellidoEmpleado" value="<%= empleado.getApellidoEmpleado() %>">
			</p>
			<p>
				<label for="txtFechaNacimiento">Fecha de Nacimiento*</label>
				<input type="text" name="txtFechaNacimiento" id="txtFechaNacimiento" value="<%= empleado.getFechaNacimiento() %>">
			</p>
			<p>
				<label for="txtSalario">Salario</label>
				<input type="text" name="txtSalario" id="txtSalario" value="<%= empleado.getSalarioEmpleado() %>">
			</p>
			<input type="submit" value="Ingresar Empleado">
		</form>
	</div>
	<script src="scripts/jquery-3.3.1.min.js"></script>
	<script src="scripts/bootstrap.min.js"></script>
</body>
</html>