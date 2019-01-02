package com.tareastacks2.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Stack;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/popServlet")
public class popServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    public popServlet() 
    {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html charset='UTF-8'");
		PrintWriter salida=response.getWriter();
		Stack pila=new Stack();
		
		pila.push("objeto1");
		pila.push("objeto2");
		pila.push("objeto3");
		pila.push("objeto4");
		
		salida.println("Pila: "+pila);
		salida.println("<br>Utilizando el metodo <i>pop</i> para remover el ultimo objeto añadido. Obketo eliminado: "+pila.pop());
		salida.println("<br>pila actualizada:"+pila);
		salida.println("<br><a href='index.jsp'>Volver a pag principal</a>");
	}

}
