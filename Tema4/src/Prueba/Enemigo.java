package Prueba;

public class Enemigo {

	private String nombre;
	private String tipo;
	private int salud;
	private int nivel;
	private int damage;
	
	public static int NumEnemigos;
	
	public Enemigo(String nombre, String tipo, int damage) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.damage = damage;
		this.salud = 100;
		this.nivel = 1;
		Enemigo.NumEnemigos++;
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
		this.nivel = this.nivel + 1;
		this.salud = this.salud + (int) (Math.pow(2, this.nivel));
	}
	
	public void recibirDamage (int damage) {
		this.salud = this.salud - damage;
		
		if(this.salud <= 0) {
			System.out.println(this.nombre + " muerto!!!");
			Enemigo.NumEnemigos--;
		}
		
		
	public static void incrementarNumEnemigos() {
		Enemigo.NumEnemigos++;
	}
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Enemigo [nombre=");
		builder.append(nombre);
		builder.append(", tipo=");
		builder.append(tipo);
		builder.append(", salud=");
		builder.append(salud);
		builder.append(", nivel=");
		builder.append(nivel);
		builder.append(", damage=");
		builder.append(damage);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
