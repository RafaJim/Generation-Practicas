package com.algoritmosbasicos.edades;

import java.util.Scanner;

public class Edades 
{

	public static void main(String[] args)
	{
		//Declaramos e inicializamos variables y objetos
		Scanner entrada=new Scanner(System.in);
		int edad=0;
		String mensaje="";
		
		//Pedimos informacion al usuario
		System.out.println("Dame tu edad: ");
		edad=entrada.nextInt();
		
		//Proceso
		if(edad<=5)
		{
			mensaje="Eres un niño";
		}
		else
		{
			if(edad>5 && edad<=18)
			{
				mensaje="Eres niño rata";
			}
			else
			{
				if(edad>18 && edad<=34)
				{
					mensaje="Eres un chavoruco";
				}
				else
				{
					if(edad==35)
					{
						mensaje="Hijo de calel";
					}
					else
					{
						if(edad>35)
						{
							mensaje="Viejo";
						}
					}
				}
			}
		}
		
		//Salida
		System.out.println(mensaje);
	}

}
