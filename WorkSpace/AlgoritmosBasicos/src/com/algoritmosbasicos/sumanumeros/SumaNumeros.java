package com.algoritmosbasicos.sumanumeros;

import java.util.Scanner;

public class SumaNumeros 
{
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		int num1=0;
		int num2=0;
		
		System.out.println("Ingrese primer numero a sumar: ");
		num1 = entrada.nextInt();
		
		System.out.println("Ingrse segundo numero a sumar: ");
		num2 = entrada.nextInt();
		
		System.out.println("La suma es: "+(num1+num2));
		
		entrada.close();
	}

}
