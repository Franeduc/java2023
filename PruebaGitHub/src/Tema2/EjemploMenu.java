package Tema2;

import java.io.IOException;
import java.util.Scanner;

public class EjemploMenu {

	public static void main(String[] args) throws Exception {
		
	
		
		int opcion = 0;
		
		//Crear Scanner
		Scanner sc = new Scanner(System.in);
		
		//Bucle para repetirlo hasta que la opcion sea 4
		do {
			
			//Pintan las opciones
			System.out.println("1. Saludar");
			System.out.println("2. Despedirte");
			System.out.println("3. Darse la mano");
			System.out.println("4. Salir");
			
			//PIDE QUE EL USUARIO ELIJA SU OPCION
			System.out.println("Dime la opcion que eliges: ");
			try {
				opcion = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				//System.out.println("Opcion incorrecta (1,2,3,4)");
				opcion = 0
			}
			
			//HARIA ACCIONES EN FUNCION DE LA OPCION ELEGIDA
			switch (opcion) {
				case 1:
					System.out.println("Hola que tal!");
					break;
				
				case 2:
					System.out.println("Hasta pronto!");
					break;
					
				case 3:
					System.out.println("Encantado");
					break;
					
				case 4:
					System.out.println("Adios, fin del programa!");
					break;
				default:
					System.out.println("Numero de opcion incorrecto");
			}
			
		} while (opcion != 4);
		
			
		

	}

}
