package com.ooppractica2.misclases;

public class Vehicle implements Vehicleable
{
	//Propiedades
	private String tipoMotor;
	private double velocidadMaxima;
	private double capacidadCombustible;
	protected int tripulantes;
	
	//Metodo constructor
	public Vehicle()
	{
		/*tipoMotor="Motor generico";
		velocidadMaxima=30;
		capacidadCombustible=5;
		tripulantes=1;*/
		
		setTipoMotor("Motor generico");
		setVelocidadMaxima(30.0);
		setCapacidadCombustible(5.0);
		setTripulantes(1);
	}
	
	public Vehicle(String tipoMotor, double velocidadMaxima, double capacidadCombustible, int tripulantes)
	{
		setTipoMotor(tipoMotor);
		setVelocidadMaxima(velocidadMaxima);
		setCapacidadCombustible(capacidadCombustible);
		setTripulantes(tripulantes);
	}
	
	//Getters y Setters
	public String getTipoMotor()
	{
		return tipoMotor;
	}
	public void setTipoMotor(String tipoMotor)
	{
		this.tipoMotor=tipoMotor;
	}
	
	public double getVelocidadMaxima()
	{
		return velocidadMaxima;
	}
	public void setVelocidadMaxima(double velocidadMaxima)
	{
		this.velocidadMaxima=velocidadMaxima;
	}
	
	public double getCapacidadCombustible()
	{
		return capacidadCombustible;
	}
	public void setCapacidadCombustible(double capacidadCombustible)
	{
		this.capacidadCombustible=capacidadCombustible;
	}
	
	public int getTripulantes()
	{
		return tripulantes;
	}
	public void setTripulantes(int tripulantes)
	{
		this.tripulantes=tripulantes;
	}

	@Override
	public void Avanzar(double distancia) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Detener() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Encender() {
		// TODO Auto-generated method stub
		
	}
	
}
