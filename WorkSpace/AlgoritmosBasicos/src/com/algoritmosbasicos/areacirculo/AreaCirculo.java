package com.algoritmosbasicos.areacirculo;

import java.util.Scanner;

public class AreaCirculo 
{
	public static void main(String[] args) 
	{
		//declarar e inicializar variables y constantes
		Scanner entrada = new Scanner(System.in);
		final double PI=3.14159265;
		double radio=0.0;
		double area=0.0;
		
		//Pedir informacion al usuario
		System.out.print("Dame el radio del circulo: ");
		radio=entrada.nextDouble();
		
		//Proceso
		area=PI*(radio*radio);
		
		//Salida
		System.out.print("El area del circulo es: "+area);

	}

}
