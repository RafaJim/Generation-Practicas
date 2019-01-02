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

import com.practica1jdbc.model.Empleado;

@WebServlet("/CreateEmployeePreparedServlet")
public class CreateEmployeePreparedServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
 
    public CreateEmployeePreparedServlet() 
    {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html charset='UTF-8'");
		PrintWriter salida=response.getWriter();
		Empleado empleado=new Empleado();
		salida.println("<link rel='stylesheet' href='css/bootstrap.min.css'>");
		salida.println("<a href='create2.jsp'><input type='button' value='Regresar al Create'></a>");
		salida.println("<a href='index.jsp'><input type='button' value='Regresar al Index'></a>");
		

		empleado.setIdEmpleado(Integer.parseInt(request.getParameter("txtIdEmpleado")));
		empleado.setNombreEmpleado(request.getParameter("txtNombreEmpleado"));
		empleado.setApellidoEmpleado(request.getParameter("txtApellidoEmpleado"));
		empleado.setFechaNacimiento(request.getParameter("txtFechaNacimiento"));
		empleado.setSalarioEmpleado(Double.parseDouble(request.getParameter("txtSalario")));
		salida.println("valores del objeto: "+empleado.toString());
		
		//Crear variables de conexion
		String url="jdbc:mysql://localhost:3306/elmacho?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String username="root";
		String password="root";
		
		//Conexion
		Connection conn=null;
		PreparedStatement pstmnt=null;
		int nRegistros=0;
		String sentenciaSQL="insert into empleados (idEmpleado, nombreEmpleado, apellidoEmpleado, fechaNacimiento, salario) values(?, ?, ?, ?, ?)";
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
			conn=DriverManager.getConnection(url, username, password);
			pstmnt=conn.prepareStatement(sentenciaSQL);
			pstmnt.setInt(1, empleado.getIdEmpleado());
			pstmnt.setString(2, empleado.getNombreEmpleado());
			pstmnt.setString(3, empleado.getApellidoEmpleado());
			pstmnt.setString(4, empleado.getFechaNacimiento());
			pstmnt.setDouble(5, empleado.getSalarioEmpleado());
			nRegistros=pstmnt.executeUpdate();
			if(nRegistros>0)
			{
				salida.println("Registro agregado!");
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
				conn.close();
				pstmnt.close();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
		
		salida.close();
	}

}
