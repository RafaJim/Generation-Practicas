package com.practica2ajax.model;

public class Productos 
{
	private int idProducto;
	private String nombreProducto;
	private double precioProducto;
	
	public Productos()
	{
		
	}
	
	public Productos(int idProducto, String nombreProducto, double precioProducto)
	{
		this.idProducto=idProducto;
		this.nombreProducto=nombreProducto;
		this.precioProducto=precioProducto;
	}
	
	public int getIdProducto()
	{
		return idProducto;
	}
	public void setIdProducto(int idProducto)
	{
		this.idProducto=idProducto;
	}
	
	public String getNombreProducto()
	{
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto)
	{
		this.nombreProducto=nombreProducto;
	}
	
	public double getPrecioProducto()
	{
		return precioProducto;
	}
	public void setPrecioProducto(double precioProducto)
	{
		this.precioProducto=precioProducto;
	}
	
	@Override
	public String toString()
	{
		return "ID Producto: "+idProducto+"Nombre Producto: "+nombreProducto+"Precio Producto: "+precioProducto;
	}
}
