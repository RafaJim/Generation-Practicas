package com.practica10junit.app;

import com.practica10junit.sumas.Sumas;

public class AppPractica10 
{

	public static void main(String[] args) 
	{
		Sumas objSumas=new Sumas();
		Sumas resta=new Sumas();
		
		objSumas.setNum1(50);
		objSumas.setNum2(20);
		resta.setNum1(100);
		resta.setNum2(50);
		System.out.println("La suma es: "+objSumas.sumaNumeros());
		System.out.println("La resta es: "+resta.restaNumeros());
		
	}

}
