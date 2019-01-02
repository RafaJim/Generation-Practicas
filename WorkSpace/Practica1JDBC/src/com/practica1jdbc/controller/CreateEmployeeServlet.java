package com.practica1jdbc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.practica1jdbc.model.Empleado;

@WebServlet("/CreateEmployeeServlet")
public class CreateEmployeeServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    public CreateEmployeeServlet() 
    {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html charset='UTF-8'");
		PrintWriter salida=response.getWriter();
		
		Empleado empleado=new Empleado();
		
		salida.println("<link rel='stylesheet' href='css/bootstrap.min.css'>");
		salida.println("<a href='create.jsp'><input type='button' value='Regresar al Create'></a>");
		salida.println("<a href='index.jsp'><input type='button' value='Regresar al Index'></a>");
		
		empleado.setIdEmpleado(Integer.parseInt(request.getParameter("txtIdEmpleado")));
		empleado.setNombreEmpleado(request.getParameter("txtNombreEmpleado"));
		empleado.setApellidoEmpleado(request.getParameter("txtApellidoEmpleado"));
		String fechaNac=request.getParameter("txtFechaNacimiento");
		//System.out.println("Fecha nacimiento: "+fechaNac);
		//DateFormat formateador=new SimpleDateFormat("dd-MM-yyyy");
		try
		{
			empleado.setFechaNacimiento(fechaNac);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		empleado.setSalarioEmpleado(Double.parseDouble(request.getParameter("txtSalario")));
		System.out.println(empleado.toString());
				
		//Crear variables de conexion
		String url="jdbc:mysql://localhost:3306/elmacho?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String user="root";
		String password="root";
		int nRegistros=0;
		String sentenciaSQL=null;
		
		//Creamos los objetos
		Connection conn=null;
		Statement stmnt=null;
		ResultSet datos=null;
		//java.sql.Date fecha=new java.sql.Date(empleado.getFechaNacimiento());
		sentenciaSQL="insert into empleados (idEmpleado, nombreEmpleado, apellidoEmpleado, fechaNacimiento, salario) values ("+empleado.getIdEmpleado()+", '"+empleado.getNombreEmpleado()+"', '"+empleado.getApellidoEmpleado()+"', '"+empleado.getFechaNacimiento()+"', "+empleado.getSalarioEmpleado()+")";
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
			conn=DriverManager.getConnection(url, user, password);
			stmnt=conn.createStatement();
			nRegistros=stmnt.executeUpdate(sentenciaSQL);
			if(nRegistros>0)
			{
				salida.println("Registro añadido con exito");
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
