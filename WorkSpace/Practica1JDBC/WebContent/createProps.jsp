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
	<h2>Create con "Properties"</h2>
	<ul>
		<li>
			<a href="index.jsp">Regresar</a>
		</li>
	</ul>
	<form action="CreateEmployeePropertiesServlet" method="post">
		<p>
			<label for="txtIdEmpleado">Ingrese el id del empleado*</label>
			<input type="text" name="txtIdEmpleado" id="txtIdEmpleado" required>
		</p>
		<p>
			<label for="txtNombre">Ingrese el Nombre del empleado*</label>
			<input type="text" name="txtNombreEmpleado" id="txtNombreEmpleado" required>
		</p>
		<p>
			<label for="txtApellido">Ingrese el Apellido del empleado*</label>
			<input type="text" name="txtApellidoEmpleado" id="txtApellidoEmpleado" required>
		</p>
		<p>
			<label for="txtFechaNacimiento">Ingrese el Fecha de Nacimiento del empleado*</label>
			<input type="text" name="txtFechaNacimiento" id="txtFechaNacimiento" required>
		</p>
		<p>
			<label for="txtSalario">Ingrese el Salario*</label>
			<input type="text" name="txtSalario" id="txtSalario" required>
		</p>
		<input type="submit" value="Ingresar Empledao">
	</form>
	
	<script src="scripts/jquery-3.3.1.min.js"></script>
	<script src="scripts/bootstrap.min.js"></script>
</body>
</html>