package com.tareastacks2.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Stack;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/peekServlet")
public class peekServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       

    public peekServlet() 
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
		salida.println("Iniciamos mostrando los objetos dentro de la pila: "+pila);
		salida.println("<br>mostramos el ultimo objeto con el metodo <i>peek()</i>: "+pila.peek());
		
		pila.push("obj4");
		salida.println("<br>Volvemos a mostrar la pila con el nuevo objeto: "+pila);
		salida.println("<br>Volvemos a mostrasr el ultimo objeto con el metodo <i>peek()</i>: "+pila.peek());
		salida.println("<br><a href='index.jsp'>Volver a pag principal</a>");
	}

}
