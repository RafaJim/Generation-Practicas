package com.ooppractica2.appvehicle;

import com.ooppractica2.misclases.Vehicle;
import com.ooppractica2.misclases.Boat;
import com.ooppractica2.misclases.Lancha;

public class AppVehiculos 
{

	public static void main(String[] args) 
	{
		//Ejercicio 1 - instanciacion de la clase abstract Vehicle
		
		/*Vehicle miVehiculo=new Vehicle();	//Metodo Vacio
		Vehicle miTransporte=new Vehicle("Mitsubishi Clase C,",20.0,150.0,2);	//Metodo declaracion de parametros
		
		System.out.println("El tipo de motor de miVehiculo es: "+miVehiculo.getTipoMotor());
		System.out.println("La capacidad del combustible de miVehiculo es: "+miVehiculo.getCapacidadCombustible());
		System.out.println("La velocidad maxima de miVehiculo es: "+miVehiculo.getVelocidadMaxima());
		System.out.println("La cantidad de tripulantes de miVehiculo es: "+miVehiculo.getTripulantes());
		
		//miVehiculo.setTipoMotor("Honda V8");
		miVehiculo.setCapacidadCombustible(20.0);
		miVehiculo.setVelocidadMaxima(85.0);
		miVehiculo.setTripulantes(4);
		
		System.out.println("");
		System.out.println("El tipo de motor de miVehiculo es: "+miVehiculo.getTipoMotor());
		System.out.println("La capacidad del combustible de miVehiculo es: "+miVehiculo.getCapacidadCombustible());
		System.out.println("La velocidad maxima de miVehiculo es: "+miVehiculo.getVelocidadMaxima());
		System.out.println("La cantidad de tripulantes de miVehiculo es: "+miVehiculo.getTripulantes());
		
		System.out.println("");
		System.out.println("El tipo de motor de miVehiculo es: "+miTransporte.getTipoMotor());
		System.out.println("La capacidad del combustible de miVehiculo es: "+miTransporte.getCapacidadCombustible());
		System.out.println("La velocidad maxima de miVehiculo es: "+miTransporte.getVelocidadMaxima());
		System.out.println("La cantidad de tripulantes de miVehiculo es: "+miTransporte.getTripulantes());*/
		
		//Ejercicio 2 - herencia de la clase Vehicle
		Boat miBote=new Boat();
		miBote.setTipoMotor("Honda M");
		miBote.setCapacidadCombustible(5.0);
		miBote.setVelocidadMaxima(4.0);
		miBote.setTripulantes(4);
		
		//Ejercicio 3 - Static
		Lancha miLancha=new Lancha();
		Lancha miLanchita=new Lancha();
		
		miLancha.setTipoMotor("Honda V8");
		miLanchita.setTipoMotor("Honda v6");
		
		System.out.println("Tipo motor mi miLancha: "+miLancha.getTipoMotor());
		System.out.println("Cantidad de remos: "+miLancha.cantidadRemos);
		
		System.out.println("Tipo motor mi miLanchita: "+miLanchita.getTipoMotor());
		System.out.println("Cantidad de remos: "+miLanchita.cantidadRemos);
		
		System.out.println("");
		//Al declararlo como =3 se llama la declaracion a 3 en vez de 2 a todas las salidas en delante de la nueva declaracion
		miLancha.cantidadRemos=3;
		System.out.println("Tipo motor mi miLancha: "+miLancha.getTipoMotor());
		System.out.println("Cantidad de remos: "+miLancha.cantidadRemos);
		
		System.out.println("Tipo motor mi miLanchita: "+miLanchita.getTipoMotor());
		System.out.println("Cantidad de remos: "+miLanchita.cantidadRemos);
	}

}
