package com.practica4ajax.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.practica2ajax.model.Productos;

@WebServlet("/DeserealizaProductoServlet")
@MultipartConfig
public class DeserealizaProductoServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
       
    public DeserealizaProductoServlet() 
    {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter salida = response.getWriter();
		String cadenaJson = request.getParameter("txtCadenaJson");
		// Gson prmite parsear objetos JSon
		Gson miGson = new Gson();
		// lo de abajo permite revisar que cacha la cadena 
		//salida.println(cadenaJson);
		Productos miProducto = new Productos();
		
		miProducto = miGson.fromJson(cadenaJson, Productos.class);
		salida.println(miProducto.toString());
		salida.close();
	}

}
