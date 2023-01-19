package Practica1Objetos;

public class Temperatura {

	
	public double celsiusToFarenheit() {
		double celsiusToFarenheit=0;
		double Celsius=20;
		
		celsiusToFarenheit = (1.8 * Celsius) + 32;
		
		return celsiusToFarenheit;
	}
	
	public double farenheitToCelsius() {
		double farenheitToCelsius=0;
		double Farenheit=78;
		
		farenheitToCelsius = (Farenheit - 32) / 1.8;
		
		return farenheitToCelsius;
	}
	
}
