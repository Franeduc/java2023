package Practica2;

public class Ejercicio16 {

	public static void main(String[] args) {
		
		//Calcula el área y el volumen de un cilindro
		double diametro, altura, areaTotal, volumen, valorPi, areaLateral, areaBase, radio;
		diametro = 15.5;
		altura = 42.4;
		radio = diametro / 2;
		valorPi = Math.PI;
		volumen = valorPi * (radio * radio) * altura;
		areaLateral = 2 * valorPi * radio * altura;
		areaBase = 2 * valorPi * (radio * radio );
		areaTotal = areaLateral + areaBase;
		System.out.println("El area del cilindro es "+areaTotal+" y el volumen es "+volumen);
		

	}

}
