package Practica1Objetos;

public class Coche {

	private int velocidad;
	
	Coche() {
		velocidad = 0;
	}
	
	public int getVelocidad() {
		return velocidad;
	}
	
	public void acelera(int mas) {
		int acelera=0;
		
		acelera = this.velocidad + acelera;
		
		return;
		
	}
	
	public void frena() {
		int frena=0;
		
		frena = this.velocidad - frena;
		
		return;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public Coche(int velocidad) {
		super();
		this.velocidad = velocidad;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Coche [velocidad=");
		builder.append(velocidad);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
