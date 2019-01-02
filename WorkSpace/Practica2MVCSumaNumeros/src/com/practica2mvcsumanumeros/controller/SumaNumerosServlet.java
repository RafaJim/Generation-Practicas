package com.practica2mvcsumanumeros.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.practica2mvcsumanumeros.model.Operaciones;


@WebServlet("/SumaNumerosServlet")
public class SumaNumerosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SumaNumerosServlet() 
    {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.getWriter().append("Estamos en el get");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String variable=request.getParameter("Operador");
		
		int numero1;
		int numero2;
		
		numero1=Integer.parseInt(request.getParameter("txtNumero1"));
		numero2=Integer.parseInt(request.getParameter("txtNumero2"));
		
		Operaciones misOperaciones=new Operaciones();
		misOperaciones.setNumero1(numero1);
		misOperaciones.setNumero2(numero2);
		
		switch(variable)
		{
			case "suma":
				response.getWriter().append("El resultado es: "+misOperaciones.sumaNumeros());
				break;
				
			case "resta":
				response.getWriter().append("El resultado es: "+misOperaciones.resta());
				break;
			case "multiplicacion":
				response.getWriter().append("El resultado es: "+misOperaciones.multiplicacion());
				break;
			case "division":
				response.getWriter().append("El resultado es: "+misOperaciones.division());
				break;
		}
		
		//Maneras de Sumar
		
		/*int numero1;
		int numero2;
		numero1=Integer.parseInt(request.getParameter("txtNumero1"));
		numero2=Integer.parseInt(request.getParameter("txtNumero2"));*/
		
		/*
		//Forma 1
		Operaciones misOperaciones=new Operaciones();
		misOperaciones.setNumero1(Integer.parseInt(request.getParameter("txtNumero1")));
		misOperaciones.setNumero2(Integer.parseInt(request.getParameter("txtNumero2")));
		response.getWriter().append("El resultado es: "+misOperaciones.sumaNumeros());
		
		//Forma 2
		Operaciones misOperaciones2=new
		Operaciones(Integer.parseInt(request.getParameter("txtNumero1")),Integer.parseInt(request.getParameter("txtNumero2")));
		response.getWriter().append("El resultado es: "+misOperaciones2.sumaNumeros());
		*/
		
		//Forma 3
		/*int numero1;
		int numero2;
		
		numero1=Integer.parseInt(request.getParameter("txtNumero1"));
		numero2=Integer.parseInt(request.getParameter("txtNumero2"));
		
		Operaciones misOperaciones3=new Operaciones();
		misOperaciones3.setNumero1(numero1);
		misOperaciones3.setNumero2(numero2);
		response.getWriter().append("El resultado es: "+misOperaciones3.sumaNumeros());*/
		response.getWriter().append("<br/>Estamos en el POST");
		response.getWriter().append("<br/><a href=\"index.jsp\">Regresar</a>");
	}

}
