package com.practica1mvcholamundo.controler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MensajeServlet
 */
@WebServlet("/MensajeServlet")
public class MensajeServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    
    public MensajeServlet() 
    {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		//response.getWriter().append("Informacion recibida en el metodo Get");
		String miNombre="", miApellido="";
		miNombre=request.getParameter("txtNombre");
		miApellido=request.getParameter("txtApellido");
		response.getWriter().append("<html>");
		response.getWriter().append("<head>");
		response.getWriter().append("<title>Mi titulo</title>");
		response.getWriter().append("</head>");
		response.getWriter().append("<body>");
		for(int i=0;i<5;i++)
		{
			response.getWriter().append("<h3>");
			response.getWriter().append("Bienvenido "+miNombre+" "+miApellido);
			response.getWriter().append("</h3>");
		}
		
		response.getWriter().append("<p>");
		response.getWriter().append("Estas en el GET");
		response.getWriter().append("</p>");
		response.getWriter().append("</body>");
		response.getWriter().append("</html>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		//response.getWriter().append("Informacion recibida en el metodo Post");
		String miTest="";
		miTest=request.getParameter("txtNombre");
		response.getWriter().append("Bienvenido "+miTest);
		response.getWriter().append("Estas en el POST");
	}

	
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}

	
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}

	
	protected void doHead(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}

}
