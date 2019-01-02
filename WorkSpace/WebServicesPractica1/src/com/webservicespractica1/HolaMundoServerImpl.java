package com.webservicespractica1;

import javax.jws.WebService;

@WebService(endpointInterface = "com.webservicespractica1.HolaMundoServer")
public class HolaMundoServerImpl implements HolaMundoServer 
{
	@Override
	public String MostrarHolaMundo()
	{
		return "Hola Mundo";
	}
}
