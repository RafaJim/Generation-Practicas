package com.tareacollections.colecciones;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList1 
{

	public static void main(String[] args) 
	{
		ArrayList <String> lista=new ArrayList<String>();
		Scanner entrada=new Scanner(System.in);
		int entradas;
		
		System.out.print("Cuantos datos quiere crear?: ");
		entradas=entrada.nextInt();
		
		entrada.nextLine();
		for(int i=0;i<entradas;i++)
		{
			System.out.println("Ingresa el elemento ["+i+"]: ");
			lista.add(entrada.nextLine());
		}
		
		for(String str:lista)
		{
			System.out.println("Listado: "+str);
		}
		
		//Mostrar cantidad de la lista
		System.out.println("Tamaño del array: "+lista.size());
		
		//Eliminar la posicion del index 2
		System.out.println("Lista despues de eliminar el index '2'");
		lista.remove(2);
		System.out.println("Lista: "+lista);
		
		//Limpiar lista
		System.out.println("Lista limpiada");
		lista.clear();
		System.out.println("Lista: "+lista);
	}

}
