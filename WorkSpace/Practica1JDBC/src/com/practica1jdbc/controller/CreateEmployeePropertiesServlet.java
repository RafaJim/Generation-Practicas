package com.practica1jdbc.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.practica1jdbc.model.Empleado;

@WebServlet("/CreateEmployeePropertiesServlet")
public class CreateEmployeePropertiesServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
       
    
    public CreateEmployeePropertiesServlet() 
    {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html charset='UTF-8'");
		PrintWriter salida=response.getWriter();
		salida.println("<link rel='stylesheet' href='css/bootstrap.min.css'>");
		salida.println("<a href='create2.jsp'><input type='button' value='Regresar al Create'></a>");
		salida.println("<a href='index.jsp'><input type='button' value='Regresar al Index'></a>");
		Empleado empleado=new Empleado();
		
		empleado.setIdEmpleado(Integer.parseInt(request.getParameter("txtIdEmpleado")));
		empleado.setNombreEmpleado(request.getParameter("txtNombreEmpleado"));
		empleado.setApellidoEmpleado(request.getParameter("txtApellidoEmpleado"));
		empleado.setFechaNacimiento(request.getParameter("txtFechaNacimiento"));
		empleado.setSalarioEmpleado(Double.parseDouble(request.getParameter("txtSalario")));
		salida.println("Valores: "+empleado.toString());
		
		Properties props=new Properties();
		String propNombreArchivo="config.properties";
		InputStream input=null;
		input=getClass().getClassLoader().getResourceAsStream(propNombreArchivo);
		props.load(input);
		//props.load(new FileInputStream("config.properties"));
		
		String propiedadUrl=props.getProperty("url");
		String propiedadUsername=props.getProperty("username");
		String propiedadPassword=props.getProperty("password");
		String propiedadDriver=props.getProperty("driver");
		String propiedadAltaEmpleados=props.getProperty("SQLInsertarEmpleado");
		salida.println("Servidor: "+propiedadUrl);
		salida.println("Username: "+propiedadUsername);
		salida.println("Password: "+propiedadPassword);
		salida.println("Driver: "+propiedadDriver);
		
		
		Connection conn=null;
		PreparedStatement pstmnt=null;
		int nRegistros=0;
		
		try
		{
			Class.forName(propiedadDriver).getDeclaredConstructor().newInstance();
			conn=DriverManager.getConnection(propiedadUrl, propiedadUsername, propiedadPassword);
			pstmnt=conn.prepareStatement(propiedadAltaEmpleados);
			pstmnt.setInt(1, empleado.getIdEmpleado());
			pstmnt.setString(2, empleado.getNombreEmpleado());
			pstmnt.setString(3, empleado.getApellidoEmpleado());
			pstmnt.setString(4, empleado.getFechaNacimiento());
			pstmnt.setDouble(5, empleado.getSalarioEmpleado());
			nRegistros=pstmnt.executeUpdate();
			if(nRegistros>0)
			{
				salida.println("Cambios Realizados!");
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
				pstmnt.close();
				conn.close();
			}
			catch(SQLException el)
			{
				el.printStackTrace();
			}
		}
		
		salida.close();
	}

}
