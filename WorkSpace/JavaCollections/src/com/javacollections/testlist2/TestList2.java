package com.javacollections.testlist2;

import java.util.*;

public class TestList2 
{
	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");
		
		for(String obj:al)
		{
			System.out.println(obj);
		}
	}

}
