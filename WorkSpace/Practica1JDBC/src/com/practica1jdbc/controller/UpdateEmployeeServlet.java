package com.practica1jdbc.controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UpdateEmployeeServlet")
public class UpdateEmployeeServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    
    public UpdateEmployeeServlet() 
    {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter salida=response.getWriter();
		response.setContentType("text/html charset='UTF-8'");
		
		Connection conn=null;
		PreparedStatement pstmnt=null;
		ResultSet datos;
		
		InputStream input;
		
		try
		{
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				pstmnt.close();
				conn.close();
			}
			catch(SQLException el)
			{
				el.printStackTrace();
			}
		}
	}

}
