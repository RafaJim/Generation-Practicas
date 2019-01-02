package com.algoritmosbasicos.menu;

import java.util.Scanner;

public class Menu 
{

	public static void main(String[] args) 
	{
		Scanner entrada=new Scanner(System.in);
		byte opcion=0;
		
		do
		{
			System.out.println("1.- Altas");
			System.out.println("2.- Bajas");
			System.out.println("3.- Modificaciones");
			System.out.println("4.- Consultas");
			System.out.println("5.- Impresiones");
			System.out.println("6.- Salir");
			System.out.println("Selecciones una opcion: ");
			
			opcion=entrada.nextByte();
			
			switch(opcion)
			{
				case 1:
					System.out.println("Seleccionaste altas");
					break;
				case 2:
					System.out.println("Seleccionaste Bajas");
					break;
				case 3:
					System.out.println("Seleccionaste Modificaciones");
					break;
				case 4:
					System.out.println("Seleccionaste Consultas");
					break;
				case 5:
					System.out.println("Seleccionaste Impresiones");
					break;
				case 6:
					System.out.println("Seleccionaste Salir");
					break;
				default:
					System.out.println("OPCION NO VALIDA");
					break;
			}
		}while(opcion!=6);
		
	}

}
