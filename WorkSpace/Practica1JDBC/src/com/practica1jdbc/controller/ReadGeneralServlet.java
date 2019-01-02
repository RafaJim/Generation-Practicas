package com.practica1jdbc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ReadGeneralServlet")
public class ReadGeneralServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

    public ReadGeneralServlet()
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
		
		//Paso 1 - Establecer las credenciales de acceso
		String urlDelServidor="jdbc:mysql://localhost:3306/elmacho?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String username="root";
		String password="root";
		
		//Paso 2 - Crear los objetos de conexion a la base de datos
		Connection conn=null;
		Statement stmnt=null;
		String sentenciaSQL="select * from empleados";
		ResultSet datos=null;
		
		try
		{
			//Paso 3 - Instanciamos el objeto de la clase conector
			//Class.forName("com.mysql.jdbc.Driver").newInstance();
			Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
			conn=DriverManager.getConnection(urlDelServidor, username, password);
			System.out.println("Conexion establecida");
			
			//Paso 4 - Creamos el objeto Statement, responsable de enviarle instrucciones al servidor de base de datos
			stmnt=conn.createStatement();
			datos=stmnt.executeQuery(sentenciaSQL);
			
			
			while(datos.next())
			{
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
		
		salida.close();
	}

}
