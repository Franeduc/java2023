package Tema2;

public class EjemploIf2 {

	public static void main(String[] args) {
		//Variable edad = 2
		//Variable sexo = 'H', 'M'
		
		//Indicar si eres niño/a [0-11]
		// Si eres adolescente [12-18]
		// Si eres joven [19-29]
		// Si eres hombre/mujer [30-55]
		// Si eres viejo/vieja [56- infinito]
		// en otro caso -> datos incorrectos
		
		int edad = 2; //Otro ejemplo -1
		char sexo = 'H'; //'M'
		
		if ( (edad >= 0) && (edad <= 10) && (sexo == 'H') ) {
			if (sexo == 'H') {
				System.out.println("Niño");
			} else if (sexo == 'M') {
				System.out.println("Niña");
			}
		} else if ( (edad >= 12) && (edad <= 18) ) { //Adolescente
			System.out.println("Adolescente");
		} else if ( (edad >= 19) && (edad <= 29) ) { //Joven
			System.out.println("Joven");
		} else if ( (edad >= 30) && (edad <= 55) ) {
			if (sexo == 'H') { //Hombre/Mujer
				System.out.println("Mujer");
			}
		} else if ( edad >= 56 && sexo == 'H' ) {
			System.out.println("Viejo");
		} else if ( edad >= 56 && sexo == 'M') {
			System.out.println("Vieja");
		} else {
			System.out.println("Datos incorrectos");
		}
	}

}
