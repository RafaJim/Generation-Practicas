package com.collectionsjava.main;

import java.util.Scanner;

public class AsercionesApp 
{

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		int edad;
		System.out.println("Introduce tu edad: ");
		edad=entrada.nextInt();
		assert edad>=18:"Edad no valida";
		System.out.println("Tu edad es: "+edad);
		entrada.close();
	}

}
