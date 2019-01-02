package com.algoritmosbasicos.meses;

import java.util.Scanner;

public class Meses 
{

	public static void main(String[] args) 
	{
		//Declaracion de variables
		Scanner entrada=new Scanner(System.in);
		int mes=0;
		String mensaje="";
		
		//Entradas
		System.out.print("Introduce un numero del mes del 1 al 12: ");
		mes=entrada.nextInt();
		
		//Proceso
		switch(mes)
		{
		case 1: 
			mensaje="Enero";
			break;
		case 2: 
			mensaje="Febrero";
			break;
		case 3: 
			mensaje="Marzo";
			break;
		case 4: 
			mensaje="Abril";
			break;
		case 5: 
			mensaje="Mayo";
			break;
		case 6: 
			mensaje="Junio";
			break;
		case 7: 
			mensaje="Julio";
			break;
		case 8: 
			mensaje="Agosto";
			break;
		case 9: 
			mensaje="Septiembre";
			break;
		case 10:
			mensaje="Octubre";
			break;
		case 11:
			mensaje="Noviembre";
			break;
		case 12: 
			mensaje="Diciembre";
			break;
		case 13: 
			mensaje="Mes no valido";
			break;
		}
		
		//Salida
		System.out.println(mensaje);
	}

}
