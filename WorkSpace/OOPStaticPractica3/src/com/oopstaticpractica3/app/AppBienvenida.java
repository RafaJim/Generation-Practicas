package com.oopstaticpractica3.app;

import com.oopstaticpractica3.misclases.Bienvenida;

public class AppBienvenida 
{
	public static void main(String[] args) 
	{
		//Buenas practicas
		Bienvenida miBienvenida=new Bienvenida();
		miBienvenida.setNombre("Macho");
		System.out.println(miBienvenida.saludo());
		
		//Bienvenida b=new Bienvenida();
		System.out.println(Bienvenida.sumaNumeros(10, 10));
		System.out.println("La raiz cuadrada de 9 es: "+Math.sqrt(9));
		
		//Visualizacion de diferentes cosas en arrays
		System.out.println("");
		Bienvenida[] alumnos=new Bienvenida[10];
		for(int i=0;i<alumnos.length;i++)
		{
			alumnos[i]=new Bienvenida();
		}
		
		for(int i=0;i<alumnos.length;i++)
		{
			alumnos[i].setNombre("Macho");
			alumnos[i].setApellido("Lee");
			alumnos[i].setDomicilio("Norris");
		}
		for(int i=0;i<alumnos.length;i++)
		{
			System.out.println("Alumno["+i+"]="+alumnos[i].getNombre());
			System.out.println("Apellido["+i+"]="+alumnos[i].getApellido());
			System.out.println("Domicilio["+i+"]="+alumnos[i].getDomicilio());
			System.out.println("");
		}
		
		/*MAlas practicas
		Bienvenida miBienvenidaMalasPracticas=new Bienvenida();
		miBienvenidaMalasPracticas.saludoMalasPracticas("Tito");*/
	}

}
