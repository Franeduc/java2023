package Practica2;

public class Ejercicio20 {

	public static void main(String[] args) {
		

		//1. 5a^2b^3+√a^2+b^2
		
		double resultado, resultado2, resultado3, a ,b, d;
		a = 2;
		b = 4;
		d = 6;
		resultado = (5 * (Math.pow(a, 2)) * (Math.pow(b, 3)) + Math.sqrt((Math.pow(a, 2) + (Math.pow(b, 2)))));
		System.out.println("El resultado es: "+resultado);
		
		//2. √4*a*b^2+(a+b)^2
		resultado2 = Math.sqrt(4 * a * (Math.pow(b, 2))) + ((a + b) * (a + b));
		System.out.println("El resultado 2 es: "+resultado2);
		
		//3. a^3*b / 2*a*b^2 - √12*d^4
		resultado3 = ((Math.pow(a, 3) * b) / (2 * a * (Math.pow(b, 2))) - Math.sqrt(12 * (Math.pow(d, 4))));
		System.out.println("El resultado 3 es: "+resultado3);
	}

}
