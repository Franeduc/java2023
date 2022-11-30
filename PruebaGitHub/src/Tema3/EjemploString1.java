package Tema3;

public class EjemploString1 {

	public static void main(String[] args) {
		//1. Contar vocales de una cadena
		
		String cadena = "Esto de la programación es más difícil de lo que parece";
		int contador=0;
		//Recorrerse la cadena caracter a caracter -> .charAt(i)
		for(int i=0; i < cadena.length(); i++) {
			//syso(cadena.charAt(i);
			
			if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' || cadena.charAt(i) == 'i' ||
					cadena.charAt(i) == 'o' || cadena.charAt(i) == 'u') {
				contador++;
			}
			
			System.out.println("Numero de vocales: " + contador);
		}

	}

}
