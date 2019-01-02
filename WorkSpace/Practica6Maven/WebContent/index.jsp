<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h2>Hello World!</h2>
		
		<%out.print("Primer test"); %>
		
		<br>
		<c:out value="Segundo Test"/>
		<br>
		
		<c:set var="txtNumerito" value="${2000}"></c:set>
		<c:if test="${txtNumerito>1000}">
			<p>
				<c:out value="Numero mayor a 1000= ${txtNumerito}" />
			</p>
		</c:if>
		
		<form action="MiServlet">
		</form>
	</body>
</html>