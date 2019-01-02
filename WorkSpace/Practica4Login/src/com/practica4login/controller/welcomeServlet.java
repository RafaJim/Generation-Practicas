package com.practica4login.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/welcomeServlet")
public class welcomeServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

    public welcomeServlet() 
    {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html charset='UTF-8' ");
		PrintWriter salida=response.getWriter();
		HttpSession miSesion=request.getSession();
		String usuario="";
		String password="";
		
		usuario=(String)miSesion.getAttribute("usuario");
		password=(String)miSesion.getAttribute("password");
		
		salida.println("Bienbenido, "+usuario);
		salida.print("<br>Tu contraseña es: "+password);
		
		salida.close();
	}

}
