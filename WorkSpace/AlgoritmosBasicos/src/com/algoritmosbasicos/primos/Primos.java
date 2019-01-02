package com.algoritmosbasicos.primos;

import java.util.Scanner;

public class Primos 
{

	public static void main(String[] args) 
	{
		Scanner entrada=new Scanner(System.in);
		char cRespuesta='n';
		String sRespuesta="";
		int numero=0;
		boolean isPrimo=true;
		
		do
		{
			//Entradas
			System.out.println("Introduce un numero: ");
			numero=entrada.nextInt();
			
			for(int i=2;i<numero;i++)
			{
				if(numero%i==0);
				{
					isPrimo=false;
				}
			}
			System.out.println("El numero introducido fue primo?: "+isPrimo);
			System.out.println("Desea calcularotro primo?(s/n): ");
			sRespuesta=entrada.next();
			cRespuesta=sRespuesta.charAt(0);
			
		}while(cRespuesta!='n');
	}

}
