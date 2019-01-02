package com.ooppractica2.misclases;

public class Lancha extends Boat
{
	public static int cantidadRemos=2;	//Se declara la variable como statica en 2
	
	public Lancha()
	{
	}
	
	@Override
	public void Avanzar(double distancia)
	{
		tripulantes=2;
	}

}
