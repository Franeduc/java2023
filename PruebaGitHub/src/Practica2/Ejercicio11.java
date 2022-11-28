package Practica2;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		//Calcula el área y el perímetro de un círculo de radio 3,6 metros
		double radio, area, perimetro;
		radio = 3.6;
		area = Math.PI * Math.pow(3.6, 2);
		perimetro = 2 * Math.PI * radio;
		System.out.println("El area es "+area+" y el perimetro es "+perimetro);
		
	}

}
