package com.tareastacks2.model;

import java.util.Scanner;
import java.util.Stack;

public class Pilas 
{

	public static void main(String[] args) 
	{
		Stack pila = new Stack();
		Scanner leer = new Scanner(System.in);
		
		System.out.print("Ingrese cantidad de la pila: ");
		int n=leer.nextInt();
		int i1 = 0;
		for(int i=0; i<n;i++)
		{
			System.out.print("Ingrese numero: ");
			i1=leer.nextInt();
			pila.push(Integer.toString(i1));
		}
		
		//System.out.println(i1);

		System.out.println("Desapilar");

		/*System.out.println("pila: "+pila);
		System.out.println("");
		System.out.println("pila con pop: "+pila.pop());*/
		System.out.println("pila: "+pila);
		while(!pila.empty())
		System.out.println("remover: "+pila.pop());
		System.out.println("pila: "+pila);
	}

}
