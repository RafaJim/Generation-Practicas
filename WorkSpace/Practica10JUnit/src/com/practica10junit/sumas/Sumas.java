package com.practica10junit.sumas;

public class Sumas 
{
	private int num1;
	private int num2;
	
	public Sumas()
	{
		
	}
	
	public Sumas(int num1, int num2)
	{
		setNum1(num1);
		setNum2(num2);
	}
	
	public int sumaNumeros()
	{
		return getNum1()+getNum2();
	}
	
	public int restaNumeros()
	{
		return getNum1()-getNum2();
	}
	
	public int getNum1()
	{
		return num1;
	}
	
	public void setNum1(int num1)
	{
		this.num1=num1;
	}
	
	public int getNum2()
	{
		return num2;
	}
	
	public void setNum2(int num2)
	{
		this.num2=num2;
	}
}
