package com.algoritmosbasicos.busquedabinaria;

import java.util.Random;
import java.util.Scanner;

public class BusquedaBinaria 
{

	public static void main(String[] args)
	{
		Random rnd=new Random(System.nanoTime());
		Scanner entrada=new Scanner(System.in);
		int [] arregloEnteros=new int [10];
		int aux=0;
		int numeroBuscar=0;
		
		//1.- Llenar vector con elementos aleatorios
		for(int i=0;i<arregloEnteros.length;i++)
		{
			arregloEnteros[i]=rnd.nextInt(99)+1;
		}	
		
		System.out.println("Datos desordenados:");
		for(int i=0;i<arregloEnteros.length;i++)
		{
			System.out.println("Elemento["+i+"]="+arregloEnteros[i]+"");
		}
		
		//2.- Ordenar el vector
		System.out.println("");
		System.out.println("Datos ordenados:");
		
		for(int i=0;i<arregloEnteros.length;i++)
		{
			for(int j=0;j<arregloEnteros.length-1;j++)
			{
				if(arregloEnteros[j]>arregloEnteros[j+1])
				{
					aux=arregloEnteros[j+1];
					arregloEnteros[j+1]=arregloEnteros[j];
					arregloEnteros[j]=aux;
				}
			}
		}
		
		for(int i=0;i<arregloEnteros.length;i++)
		{
			System.out.println("Elemento["+i+"]="+arregloEnteros[i]+"");
		}
		
		//3.- Pedir al usuario un numero a buscar
		System.out.println("");
		System.out.print("Ingrese datos a buscar: ");
		numeroBuscar=entrada.nextInt();
		
		//4.- Encontrar el numero con busqueda binaria
		int limInf=0;
		int limSup=arregloEnteros.length-1;
		int pivote=0;
		int EncontradoAt= -1;
		
		do
		{
			pivote=(limSup+limInf)/2;
			
			if(arregloEnteros[pivote]==numeroBuscar)
			{	
				EncontradoAt=pivote;
				break;
			}
			if(arregloEnteros[pivote]<numeroBuscar)
			{
				limInf=pivote+1;
			}
			else
			{
				limSup=pivote-1;
			}
		}while(limInf<=limSup);
		
		if(EncontradoAt!=-1)
		{
			System.out.println("Numero encontrado en posicion: "+EncontradoAt);
		}
		else
		{
			System.out.println("Numero no encontrado");
		}
	}

}
