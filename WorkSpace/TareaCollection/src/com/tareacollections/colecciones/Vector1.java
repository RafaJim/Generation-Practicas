package com.tareacollections.colecciones;

import java.util.Scanner;
import java.util.Vector;

public class Vector1 
{

	public static void main(String[] args) 
	{
		Scanner entrada=new Scanner(System.in);
		Vector<String> lista=new Vector<String>();
		int cantidad;
		
		System.out.print("Ingrese la cantidad de objetos en la lista: ");
		cantidad=entrada.nextInt();
		
		entrada.nextLine();
		for(int i=0;i<cantidad;i++)
		{
			System.out.println("Ingrese objeto["+i+"]: ");
			lista.add(entrada.nextLine());
		}
		for(String x: lista)
		{
			System.out.println("Contenido: "+x);
		}
		
		//Capacidad del vector
		System.out.println("Capacidad del vector: "+lista.capacity());
		
		//Cantidad de elementos
		System.out.println("Cantidad de elementos en el vector: "+lista.size());
		
		//Buscar por index
		System.out.println("Objeto dentro del index 2: "+lista.get(2));
		
		//Remover el index 2
		System.out.println("Remover el index '2'");
		lista.remove(2);
		System.out.println("Lista: "+lista);
		
		//Borrar todo
		System.out.println("Lista limpiada");
		lista.clear();
		System.out.println("Contenido :"+lista);
	}

}
