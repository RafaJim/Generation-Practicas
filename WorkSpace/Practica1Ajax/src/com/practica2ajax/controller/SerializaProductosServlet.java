package com.practica2ajax.controller;

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


@WebServlet("/SerializaProductosServlet")
@MultipartConfig
public class SerializaProductosServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
       
    
    public SerializaProductosServlet() 
    {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("application/json");
		PrintWriter salida=response.getWriter();
		Productos objProducto=new Productos();
		
		objProducto.setIdProducto(Integer.parseInt(request.getParameter("txtIdProducto")));
		objProducto.setNombreProducto(request.getParameter("txtNombreProducto"));
		objProducto.setPrecioProducto(Double.parseDouble(request.getParameter("txtPrecioProducto")));
		
		Gson miObjetoGson=new Gson();
		
		salida.println(miObjetoGson.toJson(objProducto));
		
		salida.close();
	}

}
