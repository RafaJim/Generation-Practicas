package com.practica1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Proyectos")
public class Proyectos 
{
	@Id
	private int idProyecto;
	
	@Column(name="nombreProyecto")
	private String nombreProyecto;
	
	@Column(name="duracionMeses")
	private int duracionMeses;
	
	public Proyectos()
	{
		
	}
	public Proyectos(int idProyecto, String nombreProyecto, int duracionMeses)
	{
		super();
		this.idProyecto = idProyecto;
		this.nombreProyecto = nombreProyecto;
		this.duracionMeses = duracionMeses;
	}

	public int getIdProyecto()
	{
		return idProyecto;
	}

	public void setIdProyecto(int idProyecto)
	{
		this.idProyecto = idProyecto;
	}

	public String getNombreProyecto()
	{
		return nombreProyecto;
	}

	public void setNombreProyecto(String nombreProyecto)
	{
		this.nombreProyecto = nombreProyecto;
	}

	public int getDuracionMeses() 
	{
		return duracionMeses;
	}

	public void setDuracionMeses(int duracionMeses) 
	{
		this.duracionMeses = duracionMeses;
	}
	
	
}
