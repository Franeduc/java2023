package Prueba;

public class Ejercicio2 {
	
	static int numero=1;
	
	public static int suma(int a, int b) {
		return a+b;
	}

	public static void main(String[] args) {
		
		//Declaracion de variables
		//TIPO- NOMBRE - VALOR POR DEFECTO
		
		short num1 = 8;
		int mes = 12;
		long distancia = 300000;
		
		char letra = 'a';
		float largo = 1e10f;
		double precio = 35000.95;
		
		float flotante = 0.0f;
		double decimal = 0.0; //Decimales
		
		//Constante (el nombre en mayusculas)
		final double PLUS = 1.15;
		
		float ffl = 3e10f;
		double ddl = 3.3e12;
		
		double precioSinIva; //Notacion camelCase
		double diaMes; //Notacion camelCase
		
		//long largo2 = (int) 3;
		//double grande2 = 5f:
		//float grandef = (float) 3d;
		
		boolean ganasDeIrme = true;
		
		System.out.println(num1);
		System.out.println(mes);
		System.out.println(distancia);
		System.out.println(letra);
		System.out.println(largo);
		System.out.println(precio);
		System.out.println(ganasDeIrme);
		System.out.println(PLUS);
		
	}
	

}
