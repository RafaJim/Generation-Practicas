package com.javacollections.testvector;

import java.util.*;

public class TestVector 
{

	public static void main(String[] args) 
	{
		Vector<String> v=new Vector<String>();	//crando vector
		
		v.add("umesh");	//metodo de colleccion
		v.addElement("irfan"); 	//metodo de vector
		v.addElement("kumar");	//transversando elemento usando enumeracion
		
		Enumeration e=v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}

	}

}
