package com.practica1ajax.model;

public class OperacionesMatematicas
{
	private double num1;
	private double num2;
	
	public OperacionesMatematicas()
	{
	
	}
	public OperacionesMatematicas(double num1, double num2)
	{
		setNum1(num1);
		setNum2(num2);
	}
	
	public double sumaNumeros()
	{
		return getNum1()+getNum2();
	}
	
	public double restaNumeros()
	{
		return getNum1()-getNum2();
	}
	
	public double multiplicarNumeros()
	{
		return getNum1()*getNum2();
	}
	
	public double dividirNumeros()
	{
		return getNum1()/getNum2();
	}
	
	public double getNum1()
	{
		return num1;
	}
	
	public void setNum1(double num1)
	{
		this.num1=num1;
	}
	
	public double getNum2()
	{
		return num2;
	}
	
	public void setNum2(double num2)
	{
		this.num2=num2;
	}
	
	public String toString()
	{
		return ("Numero1: "+getNum1()+"Numero2: "+getNum2());
	}
}
