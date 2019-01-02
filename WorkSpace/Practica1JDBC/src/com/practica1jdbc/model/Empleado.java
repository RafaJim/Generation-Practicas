package com.practica1jdbc.model;

import java.util.Date;

public class Empleado
{
	private int idEmpleado;
	private String nombreEmpleado;
	private String apellidoEmpleado;
	private String fechaNacimiento;
	private double salarioEmpleado;
	
	public Empleado()
	{
		
	}
	
	public Empleado(int idEmpleado, String nombreEmpleado, String apellidoEmpleado, String fechaNacimiento, double salarioEmpleado)
	{
		setIdEmpleado(idEmpleado);
		setNombreEmpleado(nombreEmpleado);
		setApellidoEmpleado(apellidoEmpleado);
		setFechaNacimiento(fechaNacimiento);
		setSalarioEmpleado(salarioEmpleado);
	}
	
	public int getIdEmpleado()
	{
		return idEmpleado;
	}
	public void setIdEmpleado(int idEmpleado)
	{
		this.idEmpleado=idEmpleado;
	}
	
	public String getNombreEmpleado()
	{
		return nombreEmpleado;
	}
	public void setNombreEmpleado(String nombreEmpleado)
	{
		this.nombreEmpleado=nombreEmpleado;
	}
	
	public String getApellidoEmpleado()
	{
		return apellidoEmpleado;
	}
	public void setApellidoEmpleado(String apellidoEmpleado)
	{
		this.apellidoEmpleado=apellidoEmpleado;
	}
	
	public String getFechaNacimiento()
	{
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNac)
	{
		this.fechaNacimiento=fechaNac;
	}
	
	public double getSalarioEmpleado()
	{
		return salarioEmpleado;
	}
	public void setSalarioEmpleado(double salarioEmpleado)
	{
		this.salarioEmpleado=salarioEmpleado;
	}
	
	public String toString()
	{
		return "idEmpleado: "+getIdEmpleado()+"Nombre Empleado: "+getNombreEmpleado()+"Apellido Empleado: "+getApellidoEmpleado()+"Fecha de nacimiento del Empleado: "+getFechaNacimiento()+"Salario Empleado: "+getSalarioEmpleado();
	}
}
