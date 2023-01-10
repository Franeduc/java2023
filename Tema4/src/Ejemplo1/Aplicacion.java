package Ejemplo1;

public class Aplicacion {

	public static void main(String[] args) {
		
		Coche miCoche = new Coche("Peugeot", "407 Coupe", "rojo", 30000);
		Coche cocheMiTia = new Coche("BMW", "i3", "blaco", 450000);
		
		System.out.println(cocheMiTia.pintar());
		System.out.println(miCoche.pintar());
		
		miCoche.vender();
		System.out.println(miCoche.getModelo());
		

	}

}
