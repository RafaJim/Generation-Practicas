package com.ooppractica1.misclases.medico;

public class Medico 
{
	//Propiedades, atributos o caracteristicas
	public long cedula;
	public String nombre;
	public String fechaNacimiento;
	
	//Metodos, comportamientos o acciones
	
	
	//Metodo constructor y destructor
	public Medico()
	{
	}
	
	public Medico(long cedula, String nombre, String fechaNacimiento)
	{
		this.cedula=cedula;
		this.nombre=nombre;
		this.fechaNacimiento=fechaNacimiento;
	}
	
	//Metodo de funcionalidad
	public String crearDiagnostico(byte idDiagnostico)
	{
		String mensaje;
		switch(idDiagnostico)
		{
		case 1: mensaje="Tas bien";
		break;
		case 2: mensaje="Tas mal";
		break;
		case 3: mensaje="Tas mas o menos";
		break;
		default: mensaje="suerte compa";
		}
		return mensaje;
	}
	public String recetar(String diagnostico)
	{
		String receta="";
		if(diagnostico.equals("Tas bien"))
		{
			receta="Whisky";
		}
		else if(diagnostico.equals("Tas mal"))
		{
			receta="tequila";
		}
		else if(diagnostico.equals("tas mas o menos"))
		{
			receta="cerveza";
		}
		else
		{
			receta="tonayan";
		}
		return "Te wuarecetar un "+receta;
	}
	
	//Metodo getters y setters
	public long getCedula()
	{
		return cedula;
	}
	public void setCedula(long cedula)
	{
		this.cedula=cedula;
	}
	public String getNombre()
	{
		return nombre;
	}
	public void setNombre(String nombre)
	{
		this.nombre=nombre;
	}
	public String fechaNacimiento()
	{
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento)
	{
		this.fechaNacimiento=fechaNacimiento;
	}
	
}
