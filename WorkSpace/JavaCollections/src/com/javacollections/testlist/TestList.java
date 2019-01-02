package com.javacollections.testlist;

import java.util.*;

public class TestList 
{

	public static void main(String[] args) 
	{
		ArrayList<String> list=new ArrayList<String>();
		
		//creando arraylist
		list.add("Ravi");	//añadiendo objetos en arraylist
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");
		
		//transversando lista a travez de iterador
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
