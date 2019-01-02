package com.practica1jdbc.controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.practica1jdbc.model.Empleado;


@WebServlet("/ObtainRecordServlet")
public class ObtainRecordServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    public ObtainRecordServlet()
    {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		//configuramos salida del response
		response.setContentType("text/html charset='UTF-8'");
		PrintWriter salida=response.getWriter();
		salida.println("<link rel='stylesheet' href='css/bootstrap.min.css'>");
		salida.println("<a href='update.jsp'><input type='button' value='Regresar'></a>");
		salida.println("<a href='index.jsp'><input type='button' value='Regresar al Index'></a>");
		
		//configuramos el objeto props que nos servira para abrir los archivos de propiedades config.properties (que contiene la configuracion de la conexion a la base de datos) y sql.properties (que contiene las sentencias SQL de la base de datos)
		Properties props=new Properties();
		InputStream input=null;
		//abrimos el archivo config.properties
		input=getClass().getClassLoader().getResourceAsStream("config.properties");
		props.load(input);
		
		//Obtenemos las propiedades del archivo sql.properties
		String idEmpleado=request.getParameter("txtIdEmpleado");
		String url=props.getProperty("url");
		String username=props.getProperty("username");
		String password=props.getProperty("password");
		String driver=props.getProperty("driver");
		
		//abrimos el archivo sql.properties
		input=getClass().getClassLoader().getResourceAsStream("sql.properties");
		
		//Obtenemos las sentencias del archivo sql.properties
		String sentenciaSQL=props.getProperty("SQLBuscarEmpleado");
		
		
		Connection conn=null;
		PreparedStatement pstmnt=null;
		ResultSet datos=null;
		int nRegistros=0;
		Boolean isRegistroEncontrado=false;
		
		try
		{
			Class.forName(driver).getDeclaredConstructor().newInstance();
			conn=DriverManager.getConnection(url, username, password);
			pstmnt=conn.prepareStatement(sentenciaSQL);
			pstmnt.setInt(1, Integer.parseInt(idEmpleado));
			datos=pstmnt.executeQuery();
			Empleado empleado=new Empleado();
			while(datos.next())
			{
				isRegistroEncontrado=true;
				empleado.setIdEmpleado(datos.getInt("idEmpleado"));
				empleado.setNombreEmpleado(datos.getString("nombreEmpleado"));
				empleado.setApellidoEmpleado(datos.getString("apellidoEmpleado"));
				empleado.setFechaNacimiento(datos.getString("fechaNacimiento"));
				empleado.setSalarioEmpleado(datos.getDouble("salario"));
				salida.println("Datos de empleado: "+empleado.toString());
			}
			if(isRegistroEncontrado==false)
			{
				salida.println("Registro no encontrado");
				RequestDispatcher rd=request.getRequestDispatcher("/update.jsp");
				rd.include(request, response);
			}
			else
			{
				request.setAttribute("empleadito", empleado); //(key, valor)
				RequestDispatcher rd=request.getRequestDispatcher("/updateEmployee.jsp");
				rd.forward(request, response);
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
		
		//verificamos que las propiedades recibidas son correctas
		/*salida.println("controlador: "+driver);
		salida.println("<br>url: "+url);
		salida.println("<br>username: "+username);
		salida.println("<br>password: "+password);
		salida.println("<br>sentencia SQL: "+sentenciaSQL);*/
		salida.close();
	}

}
