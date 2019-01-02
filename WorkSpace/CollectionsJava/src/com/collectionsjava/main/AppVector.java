package com.collectionsjava.main;

import java.util.Enumeration;
import java.util.Vector;

import com.collectionsjava.model.Persona;

public class AppVector 
{

	public static void main(String[] args) 
	{
		Vector<Persona> personas = new Vector<Persona>(3);
		
		//Metodo add de la collection
		personas.add(new Persona("Lola", "Lolita", 18));
		personas.add(new Persona("Silvia", "Saint", 19));
		personas.add(new Persona("Mia", "Khalifa", 20));
		
		//Metodo addElement de la clase vector
		personas.addElement(new Persona("Alexis", "Texas", 23));
		Enumeration miEnum = personas.elements();
		while(miEnum.hasMoreElements())
		{
			System.out.println(miEnum.nextElement());
		}
		
	}

}
