package com.collectionsjava.main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderApp 
{

	public static void main(String[] args) 
	{
		//Ejercicio de Lectura de archivos de texto
		String cadena="";
		FileReader reader;
		BufferedReader buffer;
		try
		{	
			reader = new FileReader("c:\\a\\algo.txt");
			buffer = new BufferedReader(reader);
			while((cadena=buffer.readLine())!=null)
			{
				System.out.println(cadena);
			}
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}catch(IOException ed)
		{
			ed.printStackTrace();
		}
	}

}
