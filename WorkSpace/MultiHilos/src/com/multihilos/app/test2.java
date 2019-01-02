package com.multihilos.app;

public class test2 
{
	  public static void main(String args[])
	  {
	    Thread t = Thread.currentThread();
	    System.out.println("Hilo actual: " + t);
	    try 
	    {
	      for(int n = 10; n > 0; n--) 
	      {
	        System.out.println(n);
	        Thread.sleep(1000);
	      }
	      
	    } catch (InterruptedException e) 
	    
	    {
	      System.out.println("Interrupción del hilo principal");
	    }
	  }
	}