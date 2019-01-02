package com.practica1ajax.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.practica1ajax.model.OperacionesMatematicas;


@WebServlet("/DivisionNumerosServlet")
public class DivisionNumerosServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
       
    public DivisionNumerosServlet()
    {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html charset='UTF-8'");
		PrintWriter salida=response.getWriter();
				
		OperacionesMatematicas operacion=new OperacionesMatematicas();
		operacion.setNum1(Double.parseDouble(request.getParameter("txtNumero1")));
		operacion.setNum2(Double.parseDouble(request.getParameter("txtNumero2")));
		
		salida.println("la division es: "+operacion.dividirNumeros());
		salida.close();
	}

}
