package com.jsfcrudpractica.dao;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Properties;

import com.jsfcrudpractica.model.ProyectoBean;

public class DatabaseOperation 
{
	private static Connection conn=null;
	private static PreparedStatement pstmnt=null;
	private static ResultSet datos=null;
	private static Properties props;
	//private InputStream input;
	
	public static Connection getConnection()
	{
		//input = getClass().getClassLoader().getResourceAsStream("config.properties");
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/elmacho?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "root");
			//pstmnt = conn.prepareStatement("");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return conn;
	}
	
	public static ArrayList getProyectosListFromDB()
	{
		return null;
	}
	
	public static String saveProyectoDetailsInDB(ProyectoBean newProyectoObj)
	{
		return "";
	}
	
	public static String editProyectoRecordInDB(int idProyecto)
	{
		return "";
	}
	
	public static String updateProyectoDetailsInDB(ProyectoBean updateProyectoObj)
	{
		return "";
	}
	
	public static String deleteProyectoDetailsInDB(int idProyecto)
	{
		return "";
	}
}
