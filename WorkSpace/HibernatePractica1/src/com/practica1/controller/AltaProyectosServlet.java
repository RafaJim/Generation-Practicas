package com.practica1.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.practica1.model.Proyectos;


@WebServlet("/AltaProyectosServlet")
public class AltaProyectosServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
   
    public AltaProyectosServlet() 
    {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html charset='UTF-8'");
		PrintWriter salida=response.getWriter();
		int idProyecto=Integer.parseInt(request.getParameter("txtIdProyecto"));
		String nombreProyecto=request.getParameter("txtNombreProyecto");
		int duracionMeses=Integer.parseInt(request.getParameter("txtDuracionMeses"));
		
		Proyectos proyecto1=new Proyectos();
		proyecto1.setIdProyecto(idProyecto);
		proyecto1.setNombreProyecto(nombreProyecto);
		proyecto1.setDuracionMeses(duracionMeses);
		
		//Paso 1
		//Seleccionamos el archivo de configuracion de hibernate y abrimos el objeto session
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		//Paso 2 Abrimos la sesion
		Session miSesion = factory.openSession();
		
		//Paso 3 Comenzamos la configuracion
		Transaction miTransaccion= miSesion.beginTransaction();
		
		//Paso 4 Guardamos el proyecto
		miSesion.save(proyecto1);
		
		//Paso 5 Hacemos commit
		miTransaccion.commit();
		
		//Paso 6 Cerramos la conexion
		miSesion.close();
		
		salida.close();
	}

}
