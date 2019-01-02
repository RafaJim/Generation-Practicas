package com.algoritmosbasicos.arreglosaleatorios;

import java.util.Random;

public class ArreglosAleatorios 
{

	public static void main(String[] args) 
	{
		int [] arreglito =new int [100];
		Random rnd = new Random(System.nanoTime());
		
		//Inicializacion de vector
		for(int i=0;i<arreglito.length;i++)
		{
			arreglito[i]=rnd.nextInt(100);
		}
		
		//Proceso del vector
		
		//Visualizacion del vector
		for(int i=0;i<arreglito.length;i++)
		{
			System.out.println("arreglito["+i+"]= "+arreglito[i]);
		}

	}

}
