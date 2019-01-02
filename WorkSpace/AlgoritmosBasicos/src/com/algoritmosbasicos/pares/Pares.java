package com.algoritmosbasicos.pares;

import java.util.Random;

public class Pares
{

	public static void main(String[] args) 
	{
		Random rnd=new Random(System.nanoTime());
		int[] arreglo=new int[100];
		int iCantidadPares=0;
		int iCantidadImpares=0;
		String sPares="";
		String sImpares="";
		
		//Inicializacion del array
		for(int i=0;i<arreglo.length;i++)
		{
			arreglo[i]=rnd.nextInt(99)+1;
		}
		
		//Proceso
		for(int i=0;i<arreglo.length;i++)
		{
			if((arreglo[i]%2)==0)
			{
				iCantidadPares++;
				sPares=sPares+arreglo[i]+" ";
			}
			else
			{
				iCantidadImpares++;
				sImpares=sImpares+arreglo[i]+" ";
			}
		}
		
		//Visualizacion
		for(int i=0;i<arreglo.length;i++)
		{
			System.out.println("Arreglo["+i+"]="+arreglo[i]);
		}
		System.out.println("La cantidad de numeros pares es: "+iCantidadPares);
		System.out.println(sPares);
		System.out.println("La cantidad de numeros impares es: "+iCantidadImpares);
		System.out.println(sImpares);
	}

}
