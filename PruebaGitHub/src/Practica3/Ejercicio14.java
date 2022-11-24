package Practica3;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		//Pedir n por teclado (1-10)
		//n = 3
		//  * 2 espacio - 1 estrella    espacios = 3-nestrellas
		// ** 1 espacio - 2 estrellas   espacios = 3-nestrellas
		//*** 0 espacio - 3 estrellas	espacios = 3-nestrellas
		
		//for (i=1 hasta 3) {
		//  for (1 - 3-nes) {
		//            pinto " "
		//  }
		// for ( 1 - numero) {
		//      pinto "*"
		// }
		//}
		
		int numero=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un numero para crear la figura");
		try {
			numero = Integer.parseInt(sc.nextLine());
		} catch(Exception e) {
			System.out.println("Error");
		}
		
		for(int i=1; i <= numero; i++) {
			for(int j=1; j <= (numero-i); j++ ) {
				System.out.print(" ");
			}
			for(int j=1; j <= i; j++) {
				System.out.print("*");
			}
			
			for (int j=1; j <= i-1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		

	}

}
