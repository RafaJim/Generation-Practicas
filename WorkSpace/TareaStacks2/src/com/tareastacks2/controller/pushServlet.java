package com.tareastacks2.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Stack;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/pushServlet")
public class pushServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

    public pushServlet() 
    {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html charset='UTF-8'");
		PrintWriter salida=response.getWriter();
		Stack pila=new Stack();
		salida.println("<br>Test push()");
		
		salida.println("Para este ejemplo se añadieron 4 objetos dentro de la pila, empezando por el objeto 'algo' y terminando con el objeto '351235441'");
		pila.push("Algo");
		pila.push(50);
		pila.push("el cacas");
		pila.push(351235441);
		
		salida.println("Objetos introducidos dentro de la pila: ");
		salida.println("<br> "+pila);
		salida.println("<br><a href='index.jsp'>Volver a pag principal</a>");
	}

}
