package Tema2;

public class EjemploSwitch3 {

	public static void main(String[] args) {
		char operador;
		double operando1, operando2;
		double resultado;
		
		operador = '+';
		operando1 = 20;
		operando2 = 4;
		
		switch (operador) {
		case '+': resultado= operando1 + operando2;
		System.out.println(resultado);
		break;
		case '-': resultado= operando1 - operando2;
		System.out.println(resultado);
		break;
		case '*': resultado= operando1 * operando2;
		System.out.println(resultado);
		break;
		case '/': resultado= operando1 / operando2;
		System.out.println(resultado);
		break;
		case '%': resultado= operando1 % operando2;
		System.out.println(resultado);
		break;
		case 's': resultado= Math.sin(operando1);
		System.out.println(resultado);
		break;
		}

	}

}
