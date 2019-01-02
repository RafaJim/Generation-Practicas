package com.webservicespractica1;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class HolaMundoCliente 
{

	public static void main(String[] args) 
	{
		try
		{
			URL url=new URL("http://localhost:9876/holamundito?wsdl"); 
			QName qname = new QName("http://webservicespractica1.com/", "HolaMundoServerImplService");
			Service service = Service.create(url, qname);
			HolaMundoServer server = service.getPort(HolaMundoServer.class);
			System.out.println(server.MostrarHolaMundo());
		}
		catch (MalformedURLException e) 
		{
			e.printStackTrace();
		}
	}

}
