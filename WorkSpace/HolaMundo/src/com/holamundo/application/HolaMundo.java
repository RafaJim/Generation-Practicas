package com.holamundo.application;

import java.util.Scanner;

public class HolaMundo 
{

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		String nombre="";
		
		System.out.println("Hola mundo!");
		System.out.println("Hola mundo2!");
		
		System.out.println("Dame tu nombre");
		nombre=entrada.nextLine();
		
		System.out.println("Bienvenido "+nombre);
		
		entrada.close();
	}

}
