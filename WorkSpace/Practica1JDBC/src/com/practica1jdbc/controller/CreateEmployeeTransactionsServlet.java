package com.practica1jdbc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CreateEmployeeTransactionsServlet")
public class CreateEmployeeTransactionsServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    public CreateEmployeeTransactionsServlet()
    {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html charset='UTF-8'");
		PrintWriter salida=response.getWriter();
		salida.println("<link rel='stylesheet' href='css/bootstrap.min.css'>");
		salida.println("<a href='createTransactions.jsp'><input type='button' value='Regresar'></a>");
		salida.println("<a href='index.jsp'><input type='button' value='Regresar al Index'></a>");
		
		//Declarar variables
		String url="jdbc:mysql://localhost:3306/elmacho?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String username="root";
		String password="root";
		
		//Declaramos los objetos
		Connection conn=null;
		PreparedStatement psmnt=null;
		String sentenciaSQL="insert into empleados (idEmpleado, nombreEmpleado, apellidoEmpleado, fechaNacimiento, salario) values (?, ?, ?, ?, ?)";
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
			conn=DriverManager.getConnection(url, username, password);
			psmnt=conn.prepareStatement(sentenciaSQL);
			conn.setAutoCommit(false);
			psmnt.setInt(1, 115);
			psmnt.setString(2, "ElTito");
			psmnt.setString(3, "Capotito");
			psmnt.setString(4, "1900-03-03");
			psmnt.setDouble(5, 300.0);
			psmnt.executeUpdate();
			
			psmnt.setInt(1, 116);
			psmnt.setString(2, "ElCristian");
			psmnt.setString(3, "Ausente");
			psmnt.setString(4, "1910-03-03");
			psmnt.setDouble(5, 200.0);
			psmnt.executeUpdate();
			
			psmnt.setInt(1, 117);
			psmnt.setString(2, "ElPablo");
			psmnt.setString(3, "Pablocich");
			psmnt.setString(4, "1920-03-03");
			psmnt.setDouble(5, 400.0);
			psmnt.executeUpdate();
			
			conn.commit();
		}
		catch(Exception e)
		{
			try
			{
				conn.rollback();
			}
			catch(SQLException el)
			{
				el.printStackTrace();
			}
			e.printStackTrace();
		}
		finally
		{
			try
			{
				psmnt.close();
				conn.close();
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		
		salida.close();
	}

}
