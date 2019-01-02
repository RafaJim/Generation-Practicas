package com.jsfcrudpractica.model;

import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.jsfcrudpractica.dao.DatabaseOperation;

@ManagedBean @RequestScoped
public class ProyectoBean 
{
	private int idProyecto;
	private String nombreProyecto;
	private String duracionMeses;
	
	public ArrayList proyectosListFromDB;
	
	public int getIdProyecto()
	{
		return idProyecto;
	}
	public void setIdProyecto(int idProyecto)
	{
		this.idProyecto=idProyecto;
	}
	
	public String getNombreProyecto()
	{
		return nombreProyecto;
	}
	public void setNombreProyecto(String nombreProyecto)
	{
		this.nombreProyecto=nombreProyecto;
	}
	
	public String getDuracionMeses()
	{
		return duracionMeses;
	}
	public void setDuracionMeses(String duracionMeses)
	{
		this.duracionMeses=duracionMeses;
	}
	
	//Cosas raras
	@PostConstruct
	public void init()
	{
		proyectosListFromDB = DatabaseOperation.getProyectosListFromDB();
	}
	
	public ArrayList proyectosList()
	{
		return proyectosListFromDB;
	}
	
	public String saveProyectoDetailsIn(ProyectoBean newProyectoObj)
	{
		return DatabaseOperation.saveProyectoDetailsInDB(newProyectoObj);
	}
	
	public String editProyectoRecord(int idProyecto)
	{
		return DatabaseOperation.editProyectoRecordInDB(idProyecto);
	}
	
	public String updateProyectoDetails(ProyectoBean updateProyectoObj)
	{
		return DatabaseOperation.updateProyectoDetailsInDB(updateProyectoObj);
	}
	
	public String deleteProyectoDetails(int idProyecto)
	{
		return DatabaseOperation.deleteProyectoDetailsInDB(idProyecto);
	}
}
