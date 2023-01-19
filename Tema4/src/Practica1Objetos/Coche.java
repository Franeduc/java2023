package Practica1Objetos;

public class Coche {

	private int velocidad;
	
	Coche() {
		velocidad=0;
	}
	
	public int getVelocidad() {
		return velocidad;
	}
	
	public void acelera(int mas) {
		int acelera=0;
		
		acelera = this.velocidad + acelera;
	}
	
	public void frena(int menos) {
		int frena=0;
		
		this.velocidad = this.velocidad - frena;
	}
	
}
