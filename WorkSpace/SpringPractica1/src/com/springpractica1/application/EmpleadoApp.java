package com.springpractica1.application;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.springpractica1.model.Empleado;

public class EmpleadoApp 
{

	public static void main(String[] args) 
	{
		//Construccion del objeto (forma tradicional) realizada por el programador
		/*Empleado empleado1 = new Empleado();
		
		empleado1.setIdEmpleado(1);
		empleado1.setNombreEmpleado("Macho");
		empleado1.setDomicilioEmpleado("Valdepeñas");*/
		
		//Construccion de objetos realizada por la forma Spring
		//IOC (Inversion of control)
		//La construccion de los objetos es realizada por el Spring container
		
		//Abrimos el archivo empleadoBean.xml
		//Resource recurso = new ClassPathResource("empleadobean.xml");
		
		//Parseamos el archivo leifo, como si fuera un xml
		/*BeanFactory factory = new XmlBeanFactory(recurso);
		
		Empleado empleadoObj1 = (Empleado) factory.getBean("persona1");
		System.out.println("Datos Empleado 1: "+empleadoObj1.toString());
		
		Empleado empleadoObj2 = factory.getBean("persona2", Empleado.class);
		System.out.println("Datos Empleado 2: "+empleadoObj2.toString());
		
		Empleado empleadoObj3 = factory.getBean("persona3", Empleado.class);
		System.out.println("Datos Empleado 3: "+empleadoObj3.toString());*/
		
		ApplicationContext contexto = new ClassPathXmlApplicationContext("empleadobean.xml");
		
		Empleado empleadoObj1 = (Empleado) contexto.getBean("persona1");
		System.out.println("Datos Empleado 1: "+empleadoObj1.toString());
		
		Empleado empleadoObj2 = contexto.getBean("persona2", Empleado.class);
		System.out.println("Datos Empleado 2: "+empleadoObj2.toString());
		
		Empleado empleadoObj3 = contexto.getBean("persona3", Empleado.class);
		System.out.println("Datos Empleado 3: "+empleadoObj3.toString());
		
		ClassPathXmlApplicationContext cat = (ClassPathXmlApplicationContext) contexto;
		cat.close();
	}

}
