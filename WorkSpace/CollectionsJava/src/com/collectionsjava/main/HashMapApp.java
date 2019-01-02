package com.collectionsjava.main;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashMapApp 
{

	public static void main(String[] args) 
	{
		//En la collection HashMap se tiene la sintaxis <Clave, Valor>
		HashMap<String, String> miHash = new HashMap<String, String>();
		miHash.put("Flor", "Orquidea");
		miHash.put("Coche", "Civic");
		miHash.put("Deporte", "Futbol Americano");
		miHash.put("Computadora", "Dell");
		
		for(Map.Entry<String, String> m:miHash.entrySet())
		{
			System.out.println("Clave: "+m.getKey()+" Valor: "+m.getValue());
		}
		
		//Ejercicio con el HashTable
		Hashtable<String, String> miHashTable = new Hashtable<String, String>();
		miHashTable.put("Flor", "Orquidea");
		miHashTable.put("Coche", "Civic");
		miHashTable.put("Deporte", "Futbol Americano");
		miHashTable.put("Computadora", "Dell");
		
		for(Map.Entry<String, String> m:miHashTable.entrySet())
		{
			System.out.println("Clave: "+m.getKey()+" Valor: "+m.getValue());
		}
	}

}
