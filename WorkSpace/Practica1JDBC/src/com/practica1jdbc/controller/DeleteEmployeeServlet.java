package com.practica1jdbc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DeleteEmployeeServlet")
public class DeleteEmployeeServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    public DeleteEmployeeServlet() 
    {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html charset='UTF-8'");
		PrintWriter salida=response.getWriter();
		String idEmpleado=request.getParameter("txtIdEmpleado");
		salida.println("<link rel='stylesheet' href='css/bootstrap.min.css'>");
		salida.println("<a href='delete.jsp'><input type='button' value='Regresar al Delete'></a>");
		salida.println("<a href='index.jsp'><input type='button' value='Regresar al Index'></a>");
		
		//Paso 1 - Declara credenciales
		String url="jdbc:mysql://localhost:3306/elmacho?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String username="root";
		String password="root";
		int nRegistro=0;
		
		//Hacemos la conexion con la DB
		Connection conn=null;
		Statement stmnt=null;
		int datos;
		String sentenciaSQL="delete from empleados where idEmpleado= "+idEmpleado;
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
			conn=DriverManager.getConnection(url, username, password);
			stmnt=conn.createStatement();
			datos=stmnt.executeUpdate(sentenciaSQL);
			if(nRegistro>0)
			{
				salida.println("Registro borrado con exito");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				stmnt.close();
				conn.close();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
		salida.close();
	}

}
