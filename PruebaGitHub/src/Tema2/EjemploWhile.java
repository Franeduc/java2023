package Tema2;

public class EjemploWhile {

	public static void main(String[] args) {
		
		
		//Numeros del 1 al 10
		int numero = 11;
		while (numero > 1) {
			numero--;
			System.out.println(numero);
		}
		//System.out.println(numero)
		
		//DEl 10 al 1 con do while
		numero = 10;
		do {
			System.out.println(numero--);
		}while(numero > 0);
		
		//Del 1 al 100 con for
		for(numero=1; numero <= 100; numero++) {
			System.out.println(numero);
		}
		
		//Del 100 al 1 con for
		for(int i=100; i >= 1; i--) {
			System.out.println(i);
		}
		
		
	}

}
