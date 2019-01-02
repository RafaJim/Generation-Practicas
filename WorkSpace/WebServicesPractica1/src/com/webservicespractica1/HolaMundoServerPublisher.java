package com.webservicespractica1;

import javax.xml.ws.Endpoint;

public class HolaMundoServerPublisher 
{
	public static void main(String [] args)
	{
		System.out.println("Publicando el servicio HolaMundoService...");
		Endpoint.publish("http://localhost:9876/holamundito", new HolaMundoServerImpl());	//Las url aqui, son denominadas como endpoint
		System.out.println("Publicacion lograda!!!");
	}
}
