package com.practica1ajax.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.practica1ajax.model.OperacionesMatematicas;


@WebServlet("/SumaNumerosServlet")
public class SumaNumerosServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
  
    public SumaNumerosServlet()
    {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html charset='UTF-8'");
		PrintWriter salida=response.getWriter();
		
		OperacionesMatematicas operacion=new OperacionesMatematicas(Double.parseDouble((request.getParameter("txtNumero1"))), Double.parseDouble(request.getParameter("txtNumero2")));
		
		OperacionesMatematicas operacion2=new OperacionesMatematicas();
		operacion2.setNum1(Double.parseDouble(request.getParameter("txtNumero1")));
		operacion2.setNum2(Double.parseDouble(request.getParameter("txtNumero2")));
		
		salida.println("la suma es: "+operacion.sumaNumeros());
		salida.close();
	}

}
