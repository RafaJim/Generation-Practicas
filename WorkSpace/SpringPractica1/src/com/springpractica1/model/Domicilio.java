package com.springpractica1.model;

public class Domicilio
{
	private String ciudad;
	private String estado;
	private int codigoPostal;
	
	public Domicilio()
	{
		
	}
	
	public Domicilio(String ciudad, String estado, int codigoPostal)
	{
		super();
		this.ciudad = ciudad;
		this.estado = estado;
		this.codigoPostal = codigoPostal;
	}

	public String getCiudad()
	{
		return ciudad;
	}

	public void setCiudad(String ciudad)
	{
		this.ciudad = ciudad;
	}

	public String getEstado() 
	{
		return estado;
	}

	public void setEstado(String estado)
	{
		this.estado = estado;
	}

	public int getCodigoPostal() 
	{
		return codigoPostal;
	}

	public void setCodigoPostal(int codigoPostal) 
	{
		this.codigoPostal = codigoPostal;
	}

	@Override
	public String toString() {
		return "Domicilio [ciudad=" + ciudad + ", estado=" + estado + ", codigoPostal=" + codigoPostal + "]";
	}
	
	
}
