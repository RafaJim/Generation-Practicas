package com.multihilos.app;

import com.multihilos.misclases.Proceso;

public class AppMultiHilo 
{

	public static void main(String[] args) 
	{
		Proceso hilo=new Proceso();
		//Thread hilo1=new Proceso("Array 1");
		/*Thread hilo2=new Proceso("Proceso 2");
		Thread hilo3=new Proceso("Proceso 3");
		Thread hilo4=new Proceso("Proceso 4");*/
		
		
		hilo.start();
		//hilo2.start();
		/*hilo3.start();
		hilo4.start();*/
	}

}
