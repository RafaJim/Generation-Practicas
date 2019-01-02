package com.ooppractica1.app;

import java.util.Scanner;

import com.ooppractica1.misclases.medico.Medico;

public class AppHospital 
{

	public static void main(String[] args) 
	{
		Scanner entrada;
		entrada=new Scanner(System.in);
		String diagnosticoMedico="";
		
		//Proceso de declaracion para reservar la memoria
		Medico Perez;
		
		//Proceso de instanciacion o cocretizacion o creacion de un nuevo objeto "Perez" que pertenece a la clase "Medico"
		Perez=new Medico();
		
		//Forma abreviada
		Medico Lopez=new Medico(102, "Lopez Sosa", "Hace dos dias"); //forma abreviada de declarar a medico lopez en vez de declararlo como al medico perez
		
		/*System.out.println("Numero de Cedula de Perez: "+Perez.cedula);	//lineas que demuestra que no mostrara los datos ya que los datos estan abajo de estas lineas
		System.out.println("El nombre de Perez es: "+Perez.nombre);
		System.out.println("La fecha de nacimiento de Perez es: "+Perez.fechaNacimiento);*/
		
		Perez.cedula=101;
		Perez.nombre="Pancho Perez";
		Perez.fechaNacimiento="Ayer";
		
		/*System.out.println("");
		System.out.println("");*/
		System.out.println("Numero de Cedula de Perez: "+Perez.cedula);
		System.out.println("El nombre de Perez es: "+Perez.nombre);
		System.out.println("La fecha de nacimiento de Perez es: "+Perez.fechaNacimiento);
		diagnosticoMedico=Perez.crearDiagnostico((byte)1);
		//System.out.println("El diagnostico de Perez es: "+Perez.crearDiagnostico());
		System.out.println(Perez.recetar(diagnosticoMedico));
		
		System.out.println("");
		System.out.println("");
		System.out.println("Numero de Cedula de Perez: "+Lopez.cedula);
		System.out.println("El nombre de Perez es: "+Lopez.nombre);
		System.out.println("La fecha de nacimiento de Perez es: "+Lopez.fechaNacimiento);
		
		
		
	}

}
