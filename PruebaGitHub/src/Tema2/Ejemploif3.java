package Tema2;

public class Ejemploif3 {

	public static void main(String[] args) {
		
		double nota1 = 7;
		double nota2 = 0;
		double nota3 = 5;
		double notaE = 2.5;
		double practica;
		double notaFinal;
		double examen;
		
		examen = notaE * 0.4;
		practica = (nota1 + nota2 + nota3) * 0.6 / 3;
		notaFinal = practica + examen;
		
		if ( practica < 3 ) {
			System.out.println("Suspenso");
		} else if ( examen < 3 ) {
			System.out.println("Suspenso");
		} else if ( notaFinal < 5 ) {
			System.out.println("Suspenso");
		} else if (( notaFinal >= 5 ) && ( notaFinal <= 8 )) {
			System.out.println("Notable");
		} else if ( notaFinal > 8 ) {
			System.out.println("Sobresaliente");
		}
	}

}
