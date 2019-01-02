package com.algoritmosbasicos.burbuja;

import java.util.Random;

public class Burbuja
{

	public static void main(String[] args) 
	{
		Random rnd=new Random(System.nanoTime());
		int [] arreglo=new int [100];
		int aux=0;
		
		//Inicializamos valores aleatorios
		for(int i=0;i<arreglo.length;i++)
		{
			arreglo[i]=rnd.nextInt(99)+1;
		}
		
		System.out.println("Vector desordenado:");	//Mostrar vector desordenado
		for(int i=0;i<arreglo.length;i++)
		{
			System.out.print("["+arreglo[i]+"]");
		}
		
		//Proceso burbuja
		for(int i=0;i<arreglo.length;i++)	//Este ciclo controla las veces que va a hacer el recorrido
		{
			for(int j=0;j<arreglo.length-1;j++)	//Este ciclo controla el recorrido del vector
			{
				if(arreglo[j]>arreglo[j+1])	//Acomodarlos descendente(<) o ascendente(>)
				{
					aux=arreglo[j+1];
					arreglo[j+1]=arreglo[j];
					arreglo[j]=aux;
				}
			}
		}
		
		System.out.println("");	//Salto de linea
		System.out.println("Vector ordenado:");
		
		//Mostramos vector
		for(int i=0;i<arreglo.length;i++)
		{
			System.out.print("["+arreglo[i]+"]");	//Muestra los vectores ordenados
		}
		
	}

}
