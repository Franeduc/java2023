package Tema2;

import java.util.Scanner;


public class EjemploScanner {

	public static void main(String[] args) {
		int numero;
		
		
		Scanner sc = new Scanner(System.in);  //Leer de teclado
		numero = sc.nextInt();
		
		do {
			try {
				numero = sc.nextInt();
			} catch (Exception e) {
				System.out.println("Te has equivocado");
			}
		} while (error == 1);
			
		
		System.out.println(numero);
		

	}

}
