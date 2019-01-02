package com.collectionsjava.model;

public class Persona
{
	private String nombrePersona;
	private String apellidoPersona;
	private int edadPersona;
	
	public Persona()
	{
		
	}
	
	public Persona(String nombrePersona, String apellidoPersona, int edadPersona)
	{
		this.nombrePersona=nombrePersona;
		this.apellidoPersona=apellidoPersona;
		this.edadPersona=edadPersona;
	}
	
	public String getNombrePersona()
	{
		return nombrePersona;
	}
	public void setNombrePersona(String nombrePersona)
	{
		this.nombrePersona=nombrePersona;
	}
	
	public String getApellidoPersona()
	{
		return apellidoPersona;
	}
	public void setApellidoPersona(String apellidoPersona)
	{
		this.apellidoPersona=apellidoPersona;
	}
	
	public int getEdadPersona()
	{
		return edadPersona;
	}
	public void setEdadPersona(int edadPersona)
	{
		this.edadPersona=edadPersona;
	}
	
	public String toString()
	{
		return "Nombre: "+getNombrePersona()+ "Apellido: "+getApellidoPersona()+"Edad: "+getEdadPersona();
	}
}
