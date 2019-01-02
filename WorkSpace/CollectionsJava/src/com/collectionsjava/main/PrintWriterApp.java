package com.collectionsjava.main;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterApp 
{

	public static void main(String[] args)
	{
		FileWriter writer;
		PrintWriter pw;
		final int NVUELTAS=10;
		try
		{
			writer = new FileWriter("c:\\a\\algo2.txt");	//Crea un nuevo documento o modifica al que este apuntado
			pw = new PrintWriter(writer);
			for(int i=0;i<NVUELTAS;i++)
			{
				pw.println("Linea No.: "+i);
			}
			writer.close();	
			pw.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
