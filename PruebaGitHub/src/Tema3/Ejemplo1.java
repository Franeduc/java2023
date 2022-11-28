package Tema3;

public class Ejemplo1 {

	public static void main(String[] args) {
		
		int numeros[]; //array de int
		float precios[];
		
		numeros = new int[10]; //va a tener un tamaño de 10
		precios = new float[20];
		
		for(int i=0; i < numeros.length; i++) {
			numeros[i] = i;
		}
		
		//Pintar
		for(int i=0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}

	}

}
