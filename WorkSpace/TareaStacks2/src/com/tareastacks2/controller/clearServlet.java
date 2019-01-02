package com.tareastacks2.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Stack;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/clearServlet")
public class clearServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
       
    public clearServlet()
    {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html charset='UTF-8'");
		PrintWriter salida=response.getWriter();
		Stack pila=new Stack();
		
		pila.push("obj1");
		pila.push("obj2");
		pila.push("obj3");
		salida.println("Muestra la pila con objetos: "+pila);
		
		pila.clear();
		salida.println("<br>Al ingresar el comando <i>variable.clear();</i> se eliminan todos los objetos dentro de la pila...");
		salida.println("<br>Contenido de la pila: "+pila);
		salida.println("<br><a href='index.jsp'>Volver a la pag principal</a>");
	}

}
