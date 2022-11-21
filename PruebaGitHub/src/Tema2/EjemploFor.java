package Tema2;

public class EjemploFor {

	public static void main(String[] args) {
		
		
		//1. Pinta todas las decenas del 1 al 10000
		for(int i=0; i<10000; i+=10) {
			System.out.println(i);
		}
		
		
		//2. Suma todos los numeros impares del 1 al 1000
		for(int i=1; i<=1000; i +=2) {
			System.out.println(i);
		}
		
		
		//3. Muestra los numeros entre -1 y 1, separados por 0.01
		for(double i=-1; i<1; i += 0.01) {
			System.out.println(i);
		}
		
		
		
		//4. Genera un numero aleatorio entre el 1 y el 100. Muestra todos los numeros entre el 1 y el 100 menos ese aleatorio
		
		
	}

}
