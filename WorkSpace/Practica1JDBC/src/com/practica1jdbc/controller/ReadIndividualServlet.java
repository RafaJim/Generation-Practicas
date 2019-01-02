package com.practica1jdbc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ReadIndividualServlet")
public class ReadIndividualServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    public ReadIndividualServlet() 
    {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter salida=response.getWriter();
		response.setContentType("text/html");
		salida.println("<link rel='stylesheet' href='css/bootstrap.min.css'>");
		salida.println("<a href='read.jsp'><input type='button' value='Regresar al Read'></a>");
		salida.println("<a href='index.jsp'><input type='button' value='Regresar al Index'></a>");
		
		int idEmpleado=Integer.parseInt(request.getParameter("txtIdEmpleado"));
		//Paso 1 - Declara credenciales
		String url="jdbc:mysql://localhost:3306/elmacho?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String username="root";
		String password="root";
		boolean isEncontrado=false;
		
		//Paso 2- Declara objetos de conexion
		Connection conn=null;
		Statement stmnt=null;
		ResultSet datos=null;
		String sentenciaSQL="select * from empleados where idEmpleado="+idEmpleado;
		
		try
		{
			//Paso 3 - Instanciar la clase del conector
			Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
			
			//Paso 4 - Abrir la conexion
			conn=DriverManager.getConnection(url, username, password);
			
			//Paso 5 - Crear el Statement
			stmnt=conn.createStatement();
			
			//Paso 6 - Ejecutar el query
			datos=stmnt.executeQuery(sentenciaSQL);
			
			//Paso 7 - Mostrar los datos
			while(datos.next())
			{
				isEncontrado=true;
				salida.println("<br>");
				salida.println("Id Empleado: "+datos.getInt("idEmpleado"));
				salida.println("<br>");
				salida.println("Nombre Empleado: "+datos.getString("nombreEmpleado"));
				salida.println("<br>");
				salida.println("Apellido Empleado: "+datos.getString("apellidoEmpleado"));
				salida.println("<br>");
				salida.println("Fecha de Nacimiento: "+datos.getString("fechaNacimiento"));
				salida.println("<br>");
				salida.println("Salario: "+datos.getDouble("salario"));
				salida.println("<br>");
				salida.println("<br>");
			}
		}
		catch(Exception miExcepcion)
		{
			miExcepcion.printStackTrace();
		}
		finally
		{
			try
			{
				//Se cierra en este orden
				datos.close();
				stmnt.close();
				conn.close();
			}
			catch(Exception miExcepcion2)
			{
				miExcepcion2.printStackTrace();
			}
			
		}
		if(isEncontrado==false)
		{
			salida.println("Registro no encontrado!");
		}
		
		salida.close();
	}

}
