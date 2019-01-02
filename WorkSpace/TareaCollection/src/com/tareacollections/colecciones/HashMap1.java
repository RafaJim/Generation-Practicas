package com.tareacollections.colecciones;

import java.util.*;

public class HashMap1
{

	public static void main(String[] args) 
	{
		HashMap<Integer,String> lista=new HashMap<Integer,String>();
		lista.put(100, "Amir");
		lista.put(101, "Vijay");
		lista.put(102, "Rahul");
		
		for(Map.Entry m:lista.entrySet())
		{
			System.out.println(m.getKey()+""+m.getValue());
		}
		System.out.println("lista: "+lista);
		
		//Mostrar la cantidad de datos
		int i=lista.size();
		System.out.println("tamaño: "+i);
		
		//Obtener dato en cierta pocision
		String Posicion=lista.get(100);
		System.out.println("Posicion ["+100+"]: "+Posicion);
		
		//determinar si hay elementos
		boolean mt=lista.isEmpty();
		System.out.println("La lista esta vacia?: "+mt);
		
		//Remover elemento
		lista.remove(101);
		System.out.println("lista actualizada: "+lista);
		
		//Eliminar objetos
		lista.clear();
		System.out.println("lista: "+lista);
	}

}
