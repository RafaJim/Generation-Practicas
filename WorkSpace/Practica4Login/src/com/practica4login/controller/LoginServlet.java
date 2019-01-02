package com.practica4login.controller;

import java.io.IOException;
import javax.servlet.http.*;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(
		description = "Servlet para logueo de usuario", 
		urlPatterns = { "/LoginServlet", "/LogueoServlet" }) 
		
public class LoginServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() 
    {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		//Declaro variables cadena para obtener los valores de los textboxes
		String nombreUsuario="";
		String contrasenhaUsuario="";
		
		//Establesco el tipo MIME a un documento HTML con codificacion UTF-8
		response.setContentType("text/html charset='UTF-8'");
		
		//Instancia el objeto salidade tipo PrintWriter
		PrintWriter salida=response.getWriter();
		salida.print("Esta vivo!!");
		
		//Obtengo los datos de los textboxes
		nombreUsuario=request.getParameter("txtUsuario");
		contrasenhaUsuario=request.getParameter("txtContrasenha");
		
		//Valido las credenciales introducirlas por el usuario
		if(nombreUsuario.equals("puerco") && contrasenhaUsuario.equals("gordo"))
		{
			HttpSession miSesion=request.getSession();
			miSesion.setAttribute("usuario", nombreUsuario);
			miSesion.setAttribute("password", contrasenhaUsuario);
			response.sendRedirect("welcomeServlet");
		}
		else
		{
			salida.println("<br>Credenciales invalidas");
			salida.println("<br>Vuelve a intentarlo");
			salida.println("<br><a href='index.jsp'>&#60;Regresar&#62;</a>");
		}
		
		salida.close();
	}

}
