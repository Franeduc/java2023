package Prueba;

public class Enemigo {

	private String nombre;
	private String tipo;
	private int salud;
	private int nivel;
	private int damage;
	
	public Enemigo(String nombre, String tipo, int damage) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.damage = damage;
		this.salud = 100;
		this.nivel = 1;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getSalud() {
		return salud;
	}

	public void setSalud(int salud) {
		this.salud = salud;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}
	
	public void subirNivel() {
		
	}
	
	
}
