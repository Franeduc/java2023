package Practica3;

public class Ejercicio24 {

	public static void main(String[] args) {
		
		
		/*
		 * 325 -> 523
		 * 
		 * centenas decenas unidades -> (unidades(500)*100) + (decenas(20)*10) + centenas(3)
		 * 325:100=3
		 * (325%100):10=2
		 * (325%100)%10=5
		 */
		int numero = 325;
		int centenas, decenas, unidades;
		
		unidades = numero / 100;
		decenas = (numero % 100) / 10;
		centenas = (numero % 100) % 10;
		System.out.println("El resultado es "+centenas+""+decenas+""+unidades);
		
	}

}
