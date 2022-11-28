package Practica2;

public class Ejercicio13 {

	public static void main(String[] args) {
		
		int t, segundos, minutos, horas;
		
		t = 10000;
		horas = (t / 3600);
		minutos = ((t - horas * 3600) / 60);
		segundos = t - (horas * 3600 + minutos * 60);
		System.out.println("Los segundos: "+t+" Son "+horas+" horas, "+minutos+" minutos y "+segundos+" segundos.");
		

	}

}
