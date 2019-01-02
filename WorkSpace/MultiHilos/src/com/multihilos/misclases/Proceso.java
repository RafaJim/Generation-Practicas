package com.multihilos.misclases;

import java.util.Random;
import java.util.Scanner;

public class Proceso extends Thread
{
	/*public Proceso(String msg)
	{
		super(msg);
	}*/
	
	public void run()
	{
		Scanner entrada=new Scanner(System.in);
		String palabra="";
		int cont=0;
		int [] array=new int[10];
		Random rnd=new Random(System.nanoTime());

		for(int i=0;i<array.length;i++)
		{
			array[i]=rnd.nextInt(10);
		}
		
		for(int i=0;i<array.length;i++)
		{
			System.out.println("Array aleatorio("+i+")"+array[i]);
		}
		
		System.out.println("");
		System.out.println("Que quieres que se muestre?");
		palabra=entrada.nextLine();
		System.out.println("");
		System.out.print("Cuantas veces quieres que se muestre: ");
		cont=entrada.nextInt();
		
		for(int i=0;i<=cont;i++)
		{
			System.out.println("palabra: "+palabra);
		}
		
		entrada.close();
		/*for(int i=0;i<=5;i++)
		{
			//System.out.println("Algo");
			System.out.println(this.getName());
		}*/
	}
}