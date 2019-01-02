package com.collectionsjava.main;

import java.util.ArrayList;

public class PracticaColeccion 
{
	public static void main(String[] args) 
	{
		final double SALARIONETO = 10000.0;
		
		final double ISR = SALARIONETO*0.30;
		final int NREGISTROSPORPAGINA = 10;
		int [] miArray = new int [NREGISTROSPORPAGINA];
		
		
		double salarioNeto = 10000;
		double salario = salarioNeto-(salarioNeto*0.30)+(salarioNeto*0.05);
		salario = salario+(2*salario);
		
		if(salarioNeto+(salarioNeto*0.07)==10)
		{
			
		}
		
		ArrayList<Integer> miArrayList = new ArrayList<Integer>();
		
		miArrayList.add(20);
		miArrayList.add(30);
		miArrayList.add(40);
		miArrayList.add(50);
		miArrayList.add(60);
		
		//Recorremos el Array
		for(Integer miIterador : miArrayList)
		{
			System.out.println(miIterador);
		}
		
		/*for(ListIterator<Integer> iterador= ArrayList.listIterator(ArrayList.size()))
		{
			System.out.println(d);
		}*/
		
		//Recorremos el ciclo con el for normal
		for(int i=0;i<NREGISTROSPORPAGINA;i++)
		{
			miArray[i]=i+1;
		}
		
		for(int i=0;i<NREGISTROSPORPAGINA;i++)
		{
			System.out.println(miArray[i]+"");
		}
		
		//Recorremos el ciclo con el ForEach
		for(int d:miArrayList )
		{
			System.out.println(d);
		}
	}

}
