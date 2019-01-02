package com.oopstaticpractica3.misclases;

public class Bienvenida 
{
	//Buenas practicas
	private String nombre;
	private String apellido;
	private String domicilio;
	
	public String saludo()
	{
		return "Bienvenido "+getNombre();
	}
	
	public String getNombre()
	{
		return nombre;
	}
	public void setNombre(String nombre)
	{
		this.nombre=nombre;
	}
	
	public static int sumaNumeros(int numero1, int numero2)
	{
		return numero1+numero2;
	}
	
	public String getApellido()
	{
		return apellido;
	}
	public void setApellido(String apellido)
	{
		this.apellido=apellido;
	}
	
	public String getDomicilio()
	{
		return domicilio;
	}
	public void setDomicilio(String domicilio)
	{
		this.domicilio=domicilio;
	}
	
	/*Malas practicas
	public void saludoMalasPracticas(String nombre2)
	{
		System.out.println("Bienvenido "+nombre2);
	}*/
}
