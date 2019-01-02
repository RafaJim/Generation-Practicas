package com.collectionsjava.main;

import java.util.ArrayList;
import java.util.Iterator;

import com.collectionsjava.model.Persona;

public class AppPersona {

	public static void main(String[] args) 
	{
		/*Persona persona1 = new Persona();
		Persona persona2 = new Persona();
		Persona persona3 = new Persona();*/
		
		Persona personaAux = new Persona();
		
		ArrayList<Persona> personas = new ArrayList<Persona>();
		
		for(int i=0;i<10;i++)
		{
			personas.add(new Persona("ElMacho "+i, "Macho "+i, 22+i));
		}
		
		personas.add(new Persona("LaCeci", "LaMorales", 45));
		personas.add(new Persona("ElYoryi", "LeHerrera", 47));
		personas.add(new Persona("ElPepe", "ElMarquez", 46));
		
		//Agrego una persona
		/*personaAux.setNombrePersona("LaCeci");
		personaAux.setApellidoPersona("LaMorales");
		personaAux.setEdadPersona(45);
		personas.add(personaAux);
		
		//Agrego otra persona
		personaAux.setNombrePersona("ElYoryi");
		personaAux.setApellidoPersona("LeHerrera");
		personaAux.setEdadPersona(47);
		personas.add(personaAux);
		
		//Agrego otra persona
		personaAux.setNombrePersona("ElPepe");
		personaAux.setApellidoPersona("ElMarquez");
		personaAux.setEdadPersona(46);
		personas.add(personaAux);*/
		
		Iterator<Persona> miIterador = personas.iterator();
		while(miIterador.hasNext())
		{
			System.out.println(miIterador.next());
		}
		
		
		
		for(Persona i: personas)
		{
			/*System.out.println("Nombre: "+i.getNombrePersona());
			System.out.println("Apellido: "+i.getApellidoPersona());
			System.out.println("Edad: "+i.getEdadPersona());*/
			
			System.out.println(i.toString());
		}
	}

}
