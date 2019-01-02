package com.webservicesproyecto3;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//URI del recurso
@Path("/Mensaje")
public class Mensaje
{
	//Resultado producido por el recurso en formato HTML
	@GET
	@Path("MuestraHolaMundoXML")
	@Produces(MediaType.TEXT_XML)
	public String MuestraHolaMundoXML()
	{
		return "<?xml version='1.0'?>"
				+ "<MiMensaje>Hola Mundo</MiMensaje>";
	}
	
	@GET
	@Path("MuestraHolaMundoHTML")
	@Produces(MediaType.TEXT_HTML)
	public String MuestraHolaMundoHTML()
	{
		return "<!DOCTYPE html>"
				+ "<html>"
				+ 	"<head>"
				+ 		"<title>ws Mensjase</title>"
				+ 	"</head>"
				+ 	"<body>Hola Mundo</body>"
				+ "</html>";
	}
	
	/*@GET
	@Produces(MediaType.TEXT_HTML)
	public String MuestraHolaMundo()
	{
		return "<h2>Hola Mundo</h2>";
	}*/
	
	//JSON
	@POST
	@Path("MuestraHolaMundoJSON")
	@Produces(MediaType.APPLICATION_JSON)
	public String MuestraHolaMundoJSON()
	{
		return "{\"hola\":\"mundo\"}";
	}
	
	@GET
	@Produces(MediaType.TEXT_XML)
	@Path("{miNombre}")
	public String MuestraHolaMundo(@PathParam("miNombre")String miNombre)
	{
		return "<?xml version='1.0'?>"
				+ "<MiMensaje>Hola "+miNombre+"</MiMensaje>";
	}
}
