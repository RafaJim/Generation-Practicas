package com.tareastacks2.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Stack;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/searchServlet")
public class searchServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

    public searchServlet() 
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
		pila.push("obj4");
		pila.push("obj5");
		pila.push("obj6");
		pila.push("obj7");
		pila.push("obj8");
		pila.push("obj9");
		salida.println("Iniciamos mostrando los objetos dentro de la pila"+pila);
		
		salida.println("<br>Ahora procederemos a buscar algun objeto dentro de la pila...");
		
		salida.println("<br>Objeto a buscar (obj5): ");
		salida.println("<br>Nos indicara en que indice de la pila se encuentra nuestro objeto: "+pila.search("obj5"));
		salida.println("<br><a href='index.jsp'>Volver a la pag principal</a>");
	}

}
