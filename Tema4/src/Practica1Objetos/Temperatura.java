package Practica1Objetos;

public class Temperatura {

	
	
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Temperatura [celsiusToFarenheit()=");
		builder.append(celsiusToFarenheit());
		builder.append(", farenheitToCelsius()=");
		builder.append(farenheitToCelsius());
		builder.append(", getClass()=");
		builder.append(getClass());
		builder.append(", hashCode()=");
		builder.append(hashCode());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}


	
	public double celsiusToFarenheit() {
		double celsiusToFarenheit = 22;
		
		celsiusToFarenheit = celsiusToFarenheit * (1.8) + 32;
		
		
		return celsiusToFarenheit;
	}
	
	
	public double farenheitToCelsius() {
		double farenheitToCelsius = 83;
		
		farenheitToCelsius = (farenheitToCelsius - 32) / 1.8;
		
		return farenheitToCelsius;
	}
	
}
