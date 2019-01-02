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
	<h2>Read Employee</h2>
	<ul>
		<li>
			<a href="index.jsp">Regresar</a>
		</li>
	</ul>
	
	<form action="ReadGeneralServlet" id="frmReadGeneral" method="post">
		<input type="submit" value="Full Search">
	</form>
	
	<form action="ReadIndividualServlet" id="frmReadIndividual" method="post">
		<p>
			<label for="txtIdEmpleado">Input the Employee: </label>
			<input type="text" name="txtIdEmpleado" id="txtIdEmpleado" required>
		</p>
		<p>
			<input type="submit" value="Search">
		</p>
	</form>
	
	<script src="scripts/jquery-3.3.1.min.js"></script>
	<script src="scripts/bootstrap.min.js"></script>
</body>
</html>