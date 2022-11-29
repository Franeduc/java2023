package Tema3;

public class EjemplosArrays3 {

	public static void pintarVectorInt(int vector[]) {
		System.out.print("[");
		for(int i=0; i<vector.length; i++) {
			if(i == vector.length-1)
				System.out.print(", ");
		}
		System.out.println("]");
	}
	
	
	public static void main(String[] args) {
		
		int numeros[] = new int[15];
		
		//Generar los numeros dentro del array
		for(int i=0; i < numeros.length; i++) {
			numeros[i] = (int) (Math.random() * 100) + 1; //Chuleta pal examen esto y el 17 del Practica 1
		}
		
		//Sumar los que sean impares
		int total=0, totalPares=0;
		for(int i=0; i < numeros.length; i++) {
			if (numeros[i] % 2 !=0) {
				total += numeros[i];
			}
			//Comprueba que sea una posicion par [0,2,4,6,8,10,12,14]
			if (i % 2 !=0) {
				totalPares += numeros[i];
			}
		}
		
		System.out.println("Total de los impares es " +total);
		System.out.println("Total de los que están en posiciones pares es "+totalPares);

	}

}
