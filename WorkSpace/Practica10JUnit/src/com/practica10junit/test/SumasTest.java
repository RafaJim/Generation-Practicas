package com.practica10junit.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.practica10junit.sumas.Sumas;

public class SumasTest 
{

	@Test
	public void testSumaNumeros() 
	{
		//fail("Not yet implemented");
		Sumas objSumas1=new Sumas();
		objSumas1.setNum1(10);
		objSumas1.setNum2(20);
		int sumaEsperado=30;
		int sumaReal=objSumas1.sumaNumeros();
		
		assertEquals(sumaEsperado, sumaReal, 0.01);
	}

}
