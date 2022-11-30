package Tema3;

public class EjemploCadenas {

	public static void main(String[] args) {
		
		char cadena[] = new char[10];
		
		String cadena1 = "Hola mundo"; //Esta forma es habitual
		String cadena2 = new String("Hola mundo cruel mundo");
		String cadena3 = "";
		String cadena4 = "DAW";
		System.out.println("Hola mundo" + " 1daw");
	
		System.out.println(cadena1.length());  //Longitud de una cadena
		System.out.println(cadena1.startsWith("H")); //Si una cadena empieza por una subcadena
		
		System.out.println(cadena2.indexOf("mundo")); //Buscar una subcadena en una cadena, y devuelve el indice donde aparece
		System.out.println(cadena2.indexOf("mundo",6));
		
		cadena4 = cadena4 + " " + cadena1; // +
		cadena3 = cadena4.concat(" ").concat(cadena1); //concat hace lo mismo que +
		System.out.println(cadena4);
		System.out.println(cadena3);
		
		System.out.println(cadena3.substring(0, 3));
		
		System.out.println(String.valueOf(10.5f)); //De numero a String se usa String.valueof
		
		String cadena5 = "149.95";
		double precio = Double.parseDouble(cadena5);
		System.out.println(precio + 1);
		
		String cadena6 = "149.95";
		if (cadena5.equals(cadena6)) {
			System.out.println("Son iguales");
		}
		
		String cadena7 = "Elefante";
		String cadena8 = "Estrella";
		System.out.println(cadena7.compareTo(cadena8));
		
		
		
		
	}

}
