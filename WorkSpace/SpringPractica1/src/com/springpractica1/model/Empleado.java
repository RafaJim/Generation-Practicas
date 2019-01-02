package com.springpractica1.model;

public class Empleado 
{
	private int idEmpleado;
	private String nombreEmpleado;
	private Domicilio domicilioEmpleado;
	
	public Empleado()
	{
		System.out.println("-- Empleado Creado --");
	}
	
	//Dependency Injection by Costructor
	public Empleado(Domicilio domicilioEmpleado)
	{
		this.domicilioEmpleado=domicilioEmpleado;
	}
	
	public int getIdEmpleado()
	{
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) 
	{
		this.idEmpleado = idEmpleado;
	}

	public String getNombreEmpleado()
	{
		return nombreEmpleado;
	}

	public void setNombreEmpleado(String nombreEmpleado)
	{
		this.nombreEmpleado = nombreEmpleado;
	}

	public Domicilio getDomicilioEmpleado() 
	{

		return domicilioEmpleado;
	}

	//Dependency Injection en setters
	public void setDomicilioEmpleado(Domicilio domicilioEmpleado)
	{
		this.domicilioEmpleado = domicilioEmpleado;
	}

	@Override
	public String toString() {
		return "Empleado [idEmpleado=" + idEmpleado + ", nombreEmpleado=" + nombreEmpleado + ", domicilioEmpleado="
				+ domicilioEmpleado + "]";
	}

	public void elInicializador()
	{
		System.out.println("Objeto Inicializado!");
	}
	public void elDestructor()
	{
		System.out.println("Objeto detruido");
	}
}
